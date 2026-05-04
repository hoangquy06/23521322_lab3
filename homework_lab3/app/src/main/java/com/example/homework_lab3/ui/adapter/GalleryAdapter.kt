package com.example.homework_lab3.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.homework_lab3.data.db.ImageLabelEntity
import com.example.homework_lab3.databinding.ItemGalleryBinding
import com.example.homework_lab3.ui.model.GalleryItem
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

class GalleryAdapter(
    private val scope: CoroutineScope,
    private val labelsFlow: (Long) -> Flow<List<ImageLabelEntity>>,
    private val ensureAnalyzed: (GalleryItem) -> Unit,
) : PagingDataAdapter<GalleryItem, GalleryAdapter.GalleryViewHolder>(DIFF) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GalleryViewHolder {
        val binding = ItemGalleryBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return GalleryViewHolder(binding)
    }

    override fun onBindViewHolder(holder: GalleryViewHolder, position: Int) {
        val item = getItem(position) ?: return
        holder.bind(item)
    }

    inner class GalleryViewHolder(
        private val binding: ItemGalleryBinding,
    ) : RecyclerView.ViewHolder(binding.root) {

        private var labelsJob: Job? = null

        fun bind(item: GalleryItem) {
            binding.imageView.load(item.previewUrl) {
                crossfade(true)
            }

            binding.sourceTagsText.text = item.sourceTags.orEmpty()

            labelsJob?.cancel()
            labelsJob = scope.launch {
                labelsFlow(item.imageId).collectLatest { labels ->
                    binding.aiLabelsText.text = labels
                        .sortedByDescending { it.confidence }
                        .take(6)
                        .joinToString(separator = ", ") { it.text }
                }
            }

            ensureAnalyzed(item)
        }
    }

    companion object {
        private val DIFF = object : DiffUtil.ItemCallback<GalleryItem>() {
            override fun areItemsTheSame(oldItem: GalleryItem, newItem: GalleryItem): Boolean =
                oldItem.imageId == newItem.imageId

            override fun areContentsTheSame(oldItem: GalleryItem, newItem: GalleryItem): Boolean =
                oldItem == newItem
        }
    }
}
