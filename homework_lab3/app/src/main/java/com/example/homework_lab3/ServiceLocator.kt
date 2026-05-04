package com.example.homework_lab3

import android.content.Context
import com.example.homework_lab3.data.api.NetworkModule
import com.example.homework_lab3.data.db.AiCacheDatabase
import com.example.homework_lab3.data.ml.MlKitImageLabeling
import com.example.homework_lab3.data.repository.ImageProcessingRepository
import com.example.homework_lab3.data.repository.PixabayRepository

object ServiceLocator {
    private var appContext: Context? = null

    fun init(context: Context) {
        if (appContext != null) return
        appContext = context.applicationContext
    }

    private fun requireContext(): Context = requireNotNull(appContext)

    val db: AiCacheDatabase by lazy { AiCacheDatabase.create(requireContext()) }
    val pixabayApi by lazy { NetworkModule.createPixabayApi() }
    val labeler by lazy { MlKitImageLabeling() }
    val imageProcessingRepository by lazy {
        ImageProcessingRepository(
            appContext = requireContext(),
            db = db,
            labeler = labeler,
        )
    }
    val pixabayRepository by lazy {
        PixabayRepository(
            api = pixabayApi,
            imageProcessingRepository = imageProcessingRepository,
        )
    }
}

