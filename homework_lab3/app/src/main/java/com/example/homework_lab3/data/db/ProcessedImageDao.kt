package com.example.homework_lab3.data.db

import androidx.paging.PagingSource
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface ProcessedImageDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(image: ProcessedImageEntity)

    @Query("SELECT * FROM processed_images WHERE imageId = :imageId LIMIT 1")
    fun observe(imageId: Long): Flow<ProcessedImageEntity?>

    @Query(
        """
        SELECT processed_images.* FROM processed_images
        INNER JOIN image_labels ON processed_images.imageId = image_labels.imageId
        WHERE image_labels.text LIKE '%' || :tag || '%'
        GROUP BY processed_images.imageId
        ORDER BY processed_images.updatedAtEpochMs DESC
        """,
    )
    fun pagingByAiTag(tag: String): PagingSource<Int, ProcessedImageEntity>
}

