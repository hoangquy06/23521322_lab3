package com.example.homework_lab3.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import androidx.paging.cachedIn
import com.example.homework_lab3.data.repository.PixabayRepository
import com.example.homework_lab3.ui.model.GalleryItem
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.flatMapLatest
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.launch

class MainViewModel(
    private val repository: PixabayRepository,
) : ViewModel() {

    private val query = MutableStateFlow("nature")
    private val smartMode = MutableStateFlow(false)
    private val aiTag = MutableStateFlow("")

    val pagingData: Flow<PagingData<GalleryItem>> =
        combine(
            query,
            smartMode,
            aiTag,
        ) { q, smart, tag ->
            Triple(q, smart, tag)
        }.flatMapLatest { (q, smart, tag) ->
            if (!smart) {
                repository.searchImagesPaging(q)
            } else {
                val trimmed = tag.trim()
                if (trimmed.isBlank()) repository.searchImagesPaging(q)
                else repository.smartSearchByAiTagPaging(trimmed)
            }
        }.cachedIn(viewModelScope)

    fun submitQuery(value: String) {
        query.value = value.trim().ifBlank { "nature" }
    }

    fun setSmartMode(enabled: Boolean) {
        smartMode.value = enabled
    }

    fun setAiTag(value: String) {
        aiTag.value = value
    }

    fun observeLabels(imageId: Long) = repository.observeLabels(imageId)

    fun ensureAnalyzed(item: GalleryItem) {
        viewModelScope.launch {
            repository.ensureAnalyzed(item)
        }
    }
}
