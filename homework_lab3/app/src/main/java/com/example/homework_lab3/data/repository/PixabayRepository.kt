package com.example.homework_lab3.data.repository

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import androidx.paging.map
import com.example.homework_lab3.BuildConfig
import com.example.homework_lab3.data.api.PixabayApi
import com.example.homework_lab3.data.paging.PixabayPagingSource
import com.example.homework_lab3.ui.model.GalleryItem
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class PixabayRepository(
    private val api: PixabayApi,
    private val imageProcessingRepository: ImageProcessingRepository,
) {
    fun searchImagesPaging(query: String): Flow<PagingData<GalleryItem>> {
        val pager = Pager(
            config = PagingConfig(pageSize = 20, enablePlaceholders = false),
            pagingSourceFactory = {
                PixabayPagingSource(
                    api = api,
                    apiKey = BuildConfig.PIXABAY_API_KEY,
                    query = query,
                    perPage = 20,
                )
            },
        )

        return pager.flow.map { pagingData ->
            pagingData.map { item ->
                GalleryItem(
                    imageId = item.id,
                    previewUrl = item.previewUrl,
                    sourceTags = item.tags,
                    fromCache = false,
                )
            }
        }
    }

    fun smartSearchByAiTagPaging(tag: String): Flow<PagingData<GalleryItem>> {
        val pager = Pager(
            config = PagingConfig(pageSize = 20, enablePlaceholders = false),
            pagingSourceFactory = { imageProcessingRepository.processedImageDao().pagingByAiTag(tag) },
        )

        return pager.flow.map { pagingData ->
            pagingData.map { entity ->
                GalleryItem(
                    imageId = entity.imageId,
                    previewUrl = entity.previewUrl,
                    sourceTags = entity.sourceTags,
                    fromCache = true,
                )
            }
        }
    }

    fun observeLabels(imageId: Long) = imageProcessingRepository.observeLabels(imageId)

    suspend fun ensureAnalyzed(item: GalleryItem) {
        imageProcessingRepository.ensureAnalyzed(
            imageId = item.imageId,
            previewUrl = item.previewUrl,
            sourceTags = item.sourceTags,
        )
    }
}
