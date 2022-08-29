package park.keich.mobile_tutorial.presentation.ui.commit

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import park.keich.mobile_tutorial.domain.model.Commit
import park.keich.mobile_tutorial.presentation.databinding.ItemCommitBinding
import java.text.SimpleDateFormat
import java.util.Locale

class CommitListAdapter : ListAdapter<Commit, CommitListAdapter.ViewHolder>(
    object : DiffUtil.ItemCallback<Commit>() {
        override fun areItemsTheSame(oldItem: Commit, newItem: Commit): Boolean {
            return oldItem.hashCode() == newItem.hashCode()
        }

        override fun areContentsTheSame(oldItem: Commit, newItem: Commit): Boolean {
            return oldItem == newItem
        }
    }
) {

    private val sdfKorean = SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초", Locale.KOREA)

    inner class ViewHolder(private val binding: ItemCommitBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(commit: Commit) {
            binding.commit = commit
            binding.textViewDate.text = sdfKorean.format(commit.date)
            binding.executePendingBindings()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemCommitBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}
