package com.example.homework_lab3.data.db

import androidx.room.Entity

@Entity(
    tableName = "image_labels",
    primaryKeys = ["imageId", "text"],
)
data class ImageLabelEntity(
    val imageId: Long,
    val text: String,
    val confidence: Float,
    val createdAtEpochMs: Long,
)

