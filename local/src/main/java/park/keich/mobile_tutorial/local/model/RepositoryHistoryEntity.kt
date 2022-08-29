package park.keich.mobile_tutorial.local.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class RepositoryHistoryEntity(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val name: String,
    val username: String,
    val starCount: Int,
    val forkCount: Int,
    val date: String,
)
