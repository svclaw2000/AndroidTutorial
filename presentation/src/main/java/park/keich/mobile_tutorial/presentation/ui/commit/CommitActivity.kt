package park.keich.mobile_tutorial.presentation.ui.commit

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.activity.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import park.keich.mobile_tutorial.presentation.databinding.ActivityCommitBinding

@AndroidEntryPoint
class CommitActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCommitBinding
    private val viewModel: CommitViewModel by viewModels()

    private val commitListAdapter = CommitListAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCommitBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.lifecycleOwner = this
        binding.viewModel = viewModel

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = commitListAdapter

        setDataListener()
        viewModel.loadCommitList()
    }

    private fun setDataListener() {
        lifecycleScope.launch {
            viewModel.commitList.collect {
                commitListAdapter.submitList(it)
            }
        }
    }
}
