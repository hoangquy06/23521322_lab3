package com.example.homework_lab3.ui

import android.os.Bundle
import android.view.inputmethod.EditorInfo
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.homework_lab3.ServiceLocator
import com.example.homework_lab3.databinding.ActivityMainBinding
import com.example.homework_lab3.ui.adapter.GalleryAdapter
import com.example.homework_lab3.ui.adapter.GalleryLoadStateAdapter
import kotlinx.coroutines.launch
import kotlinx.coroutines.flow.collectLatest

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(
            this,
            MainViewModelFactory(ServiceLocator.pixabayRepository),
        )[MainViewModel::class.java]

        val adapter = GalleryAdapter(
            scope = lifecycleScope,
            labelsFlow = viewModel::observeLabels,
            ensureAnalyzed = viewModel::ensureAnalyzed,
        )

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = adapter.withLoadStateFooter(
            footer = GalleryLoadStateAdapter { adapter.retry() },
        )

        binding.searchButton.setOnClickListener {
            val queryText = binding.queryInput.text?.toString().orEmpty()
            val aiTagText = binding.aiTagInput.text?.toString().orEmpty()
            if (binding.smartSwitch.isChecked) {
                viewModel.setAiTag(aiTagText.ifBlank { queryText })
            } else {
                viewModel.submitQuery(queryText)
            }
        }

        binding.queryInput.setOnEditorActionListener { _, actionId, _ ->
            if (actionId == EditorInfo.IME_ACTION_SEARCH) {
                viewModel.submitQuery(binding.queryInput.text?.toString().orEmpty())
                true
            } else {
                false
            }
        }

        binding.aiTagInput.setOnEditorActionListener { _, actionId, _ ->
            if (actionId == EditorInfo.IME_ACTION_DONE) {
                viewModel.setAiTag(binding.aiTagInput.text?.toString().orEmpty())
                true
            } else {
                false
            }
        }

        binding.smartSwitch.setOnCheckedChangeListener { _, isChecked ->
            binding.aiTagLayout.isVisible = isChecked
            viewModel.setSmartMode(isChecked)
        }

        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.pagingData.collectLatest { pagingData ->
                    adapter.submitData(pagingData)
                }
            }
        }
    }
}
