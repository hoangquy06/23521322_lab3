package com.example.homework_lab3.data.model

import com.google.gson.annotations.SerializedName

data class PixabayResponse(
    @SerializedName("total") val total: Int,
    @SerializedName("totalHits") val totalHits: Int,
    @SerializedName("hits") val hits: List<ImageItem>,
)

data class ImageItem(
    @SerializedName("id") val id: Long,
    @SerializedName("pageURL") val pageUrl: String?,
    @SerializedName("type") val type: String?,
    @SerializedName("tags") val tags: String?,
    @SerializedName("previewURL") val previewUrl: String?,
    @SerializedName("webformatURL") val webformatUrl: String?,
    @SerializedName("largeImageURL") val largeImageUrl: String?,
)

data class ProcessedImage(
    val imageId: Long,
    val previewUrl: String?,
    val sourceTags: String?,
    val labels: List<ProcessedLabel>,
)

data class ProcessedLabel(
    val text: String,
    val confidence: Float,
)

