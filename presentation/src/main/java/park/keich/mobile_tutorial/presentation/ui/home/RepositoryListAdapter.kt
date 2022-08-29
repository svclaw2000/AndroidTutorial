package park.keich.mobile_tutorial.presentation.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import park.keich.mobile_tutorial.domain.model.Repository
import park.keich.mobile_tutorial.presentation.databinding.ItemRepositoryBinding

class RepositoryListAdapter : ListAdapter<Repository, RepositoryListAdapter.ViewHolder>(
    object : DiffUtil.ItemCallback<Repository>() {
        override fun areItemsTheSame(oldItem: Repository, newItem: Repository): Boolean {
            TODO("Not yet implemented")
        }

        override fun areContentsTheSame(oldItem: Repository, newItem: Repository): Boolean {
            TODO("Not yet implemented")
        }
    }
) {

    class ViewHolder(private val binding: ItemRepositoryBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(item: Repository) {
            TODO("해당 Repository의 정보를 화면에 표시한다.")
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemRepositoryBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}
