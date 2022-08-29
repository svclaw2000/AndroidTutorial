package park.keich.mobile_tutorial.presentation.ui.history

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import androidx.activity.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import park.keich.mobile_tutorial.presentation.databinding.ActivityHistoryBinding
import park.keich.mobile_tutorial.presentation.ui.commit.CommitActivity

@AndroidEntryPoint
class HistoryActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHistoryBinding
    private val viewModel: HistoryViewModel by viewModels()

    private val historyListAdapter = HistoryListAdapter {
        val intent = Intent(this, CommitActivity::class.java).apply {
            putExtra("username", it.username)
            putExtra("repositoryName", it.name)
        }
        startActivity(intent)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHistoryBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = historyListAdapter

        setDataListener()
        viewModel.loadHistoryList()
    }

    private fun setDataListener() {
        lifecycleScope.launch {
            viewModel.historyList.collect {
                historyListAdapter.submitList(it)
            }
        }
    }
}
