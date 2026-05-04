package com.example.homework_lab3.data.paging

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.example.homework_lab3.data.api.PixabayApi
import com.example.homework_lab3.data.model.ImageItem
import retrofit2.HttpException
import java.io.IOException

class PixabayPagingSource(
    private val api: PixabayApi,
    private val apiKey: String,
    private val query: String,
    private val perPage: Int,
) : PagingSource<Int, ImageItem>() {

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, ImageItem> {
        val page = params.key ?: 1

        return try {
            val response = api.searchImages(
                apiKey = apiKey,
                query = query,
                page = page,
                perPage = perPage,
            )

            val items = response.hits
            val nextKey = if (items.isEmpty()) null else page + 1

            LoadResult.Page(
                data = items,
                prevKey = if (page == 1) null else page - 1,
                nextKey = nextKey,
            )
        } catch (e: IOException) {
            LoadResult.Error(e)
        } catch (e: HttpException) {
            LoadResult.Error(e)
        }
    }

    override fun getRefreshKey(state: PagingState<Int, ImageItem>): Int? {
        val anchor = state.anchorPosition ?: return null
        val page = state.closestPageToPosition(anchor) ?: return null
        return page.prevKey?.plus(1) ?: page.nextKey?.minus(1)
    }
}

