package com.example.homework_lab3.data.api

import com.example.homework_lab3.data.model.PixabayResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface PixabayApi {
    @GET("api/")
    suspend fun searchImages(
        @Query("key") apiKey: String,
        @Query("q") query: String,
        @Query("page") page: Int,
        @Query("per_page") perPage: Int,
        @Query("image_type") imageType: String = "photo",
        @Query("safesearch") safeSearch: Boolean = true,
    ): PixabayResponse
}

