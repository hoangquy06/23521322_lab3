package com.example.homework_lab3.data.ml

import android.graphics.Bitmap
import com.example.homework_lab3.data.model.ProcessedLabel
import com.google.mlkit.vision.common.InputImage
import com.google.mlkit.vision.label.ImageLabeling
import com.google.mlkit.vision.label.defaults.ImageLabelerOptions
import kotlinx.coroutines.tasks.await

class MlKitImageLabeling {
    private val labeler = ImageLabeling.getClient(ImageLabelerOptions.DEFAULT_OPTIONS)

    suspend fun label(bitmap: Bitmap): List<ProcessedLabel> {
        val image = InputImage.fromBitmap(bitmap, 0)
        val labels = labeler.process(image).await()
        return labels
            .sortedByDescending { it.confidence }
            .take(6)
            .map { ProcessedLabel(text = it.text, confidence = it.confidence) }
    }
}
