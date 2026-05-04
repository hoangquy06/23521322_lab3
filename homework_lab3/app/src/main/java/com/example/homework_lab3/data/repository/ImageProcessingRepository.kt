package com.example.homework_lab3.data.repository

import android.content.Context
import android.graphics.drawable.BitmapDrawable
import androidx.core.graphics.drawable.toBitmap
import coil.ImageLoader
import coil.request.ImageRequest
import com.example.homework_lab3.data.db.AiCacheDatabase
import com.example.homework_lab3.data.db.ImageLabelEntity
import com.example.homework_lab3.data.db.ProcessedImageEntity
import com.example.homework_lab3.data.ml.MlKitImageLabeling
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.util.concurrent.ConcurrentHashMap

class ImageProcessingRepository(
    private val appContext: Context,
    private val db: AiCacheDatabase,
    private val labeler: MlKitImageLabeling,
) {
    private val imageLoader = ImageLoader(appContext)
    private val inFlight = ConcurrentHashMap<Long, Unit>()

    fun processedImageDao() = db.processedImageDao()
    fun observeLabels(imageId: Long) = db.imageLabelDao().observeByImageId(imageId)

    suspend fun ensureAnalyzed(
        imageId: Long,
        previewUrl: String?,
        sourceTags: String?,
    ) {
        if (previewUrl.isNullOrBlank()) return

        val existing = withContext(Dispatchers.IO) {
            db.imageLabelDao().countByImageId(imageId)
        }
        if (existing > 0) return

        val lock = inFlight.putIfAbsent(imageId, Unit)
        if (lock != null) return

        try {
            withContext(Dispatchers.IO) {
                db.processedImageDao().upsert(
                    ProcessedImageEntity(
                        imageId = imageId,
                        previewUrl = previewUrl,
                        sourceTags = sourceTags,
                        updatedAtEpochMs = System.currentTimeMillis(),
                    ),
                )
            }

            val bitmap = withContext(Dispatchers.IO) {
                val request = ImageRequest.Builder(appContext)
                    .data(previewUrl)
                    .allowHardware(false)
                    .build()

                val result = imageLoader.execute(request)
                val drawable = result.drawable ?: return@withContext null
                (drawable as? BitmapDrawable)?.bitmap ?: drawable.toBitmap()
            } ?: return

            val labels = labeler.label(bitmap)
            val now = System.currentTimeMillis()

            withContext(Dispatchers.IO) {
                db.imageLabelDao().deleteByImageId(imageId)
                db.imageLabelDao().upsertAll(
                    labels.map {
                        ImageLabelEntity(
                            imageId = imageId,
                            text = it.text,
                            confidence = it.confidence,
                            createdAtEpochMs = now,
                        )
                    },
                )

                db.processedImageDao().upsert(
                    ProcessedImageEntity(
                        imageId = imageId,
                        previewUrl = previewUrl,
                        sourceTags = sourceTags,
                        updatedAtEpochMs = now,
                    ),
                )
            }
        } finally {
            inFlight.remove(imageId)
        }
    }
}
