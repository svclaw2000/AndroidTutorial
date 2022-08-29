package park.keich.mobile_tutorial.presentation.ui.history

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import park.keich.mobile_tutorial.domain.model.RepositoryHistory
import park.keich.mobile_tutorial.presentation.databinding.ItemHistoryBinding
import java.text.SimpleDateFormat
import java.util.Locale

class HistoryListAdapter(
    private val onItemClick: (RepositoryHistory) -> Unit
) : ListAdapter<RepositoryHistory, HistoryListAdapter.ViewHolder>(
    object : DiffUtil.ItemCallback<RepositoryHistory>() {
        override fun areItemsTheSame(oldItem: RepositoryHistory, newItem: RepositoryHistory): Boolean {
            return oldItem.username == newItem.username && oldItem.name == newItem.name
        }

        override fun areContentsTheSame(oldItem: RepositoryHistory, newItem: RepositoryHistory): Boolean {
            return oldItem == newItem
        }
    }
) {

    private val sdfDate = SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault())

    inner class ViewHolder(private val binding: ItemHistoryBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(item: RepositoryHistory) {
            binding.history = item
            binding.executePendingBindings()
            binding.root.setOnClickListener { onItemClick(item) }
            binding.textViewDate.text = sdfDate.format(item.visitedDate)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemHistoryBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}
