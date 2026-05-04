package com.example.homework_lab3.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface ImageLabelDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsertAll(labels: List<ImageLabelEntity>)

    @Query("DELETE FROM image_labels WHERE imageId = :imageId")
    suspend fun deleteByImageId(imageId: Long)

    @Query("SELECT * FROM image_labels WHERE imageId = :imageId ORDER BY confidence DESC")
    fun observeByImageId(imageId: Long): Flow<List<ImageLabelEntity>>

    @Query("SELECT COUNT(*) FROM image_labels WHERE imageId = :imageId")
    suspend fun countByImageId(imageId: Long): Int
}

