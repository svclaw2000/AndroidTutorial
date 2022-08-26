package kr.co.alm.mobile_tutorial.presentation.ui.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import kr.co.alm.mobile_tutorial.presentation.R
import kr.co.alm.mobile_tutorial.presentation.databinding.ActivityHomeBinding

@AndroidEntryPoint
class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding
    private val viewModel: HomeViewModel by viewModels()

    private val repositoryListAdapter = RepositoryListAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = repositoryListAdapter

        setViewListener()
        setDataListsner()
    }

    private fun setViewListener() {
        // TODO("검색을 클릭하면 검색 결과를 화면에 표시한다.")
    }

    private fun setDataListsner() {
        lifecycleScope.launch {
            viewModel.repositoryList.collect {
                // TODO("Not yet implemented")
            }
        }
    }
}
