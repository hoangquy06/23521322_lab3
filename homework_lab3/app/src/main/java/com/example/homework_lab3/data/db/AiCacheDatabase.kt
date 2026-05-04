package com.example.homework_lab3.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(
    entities = [
        ProcessedImageEntity::class,
        ImageLabelEntity::class,
    ],
    version = 1,
    exportSchema = false,
)
abstract class AiCacheDatabase : RoomDatabase() {
    abstract fun processedImageDao(): ProcessedImageDao
    abstract fun imageLabelDao(): ImageLabelDao

    companion object {
        fun create(context: Context): AiCacheDatabase {
            return Room.databaseBuilder(
                context.applicationContext,
                AiCacheDatabase::class.java,
                "ai_cache.db",
            ).build()
        }
    }
}

