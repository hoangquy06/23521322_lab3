package com.example.homework_lab3.data.db

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "processed_images")
data class ProcessedImageEntity(
    @PrimaryKey val imageId: Long,
    val previewUrl: String?,
    val sourceTags: String?,
    val updatedAtEpochMs: Long,
)

