package park.keich.mobile_tutorial.data.model

import java.util.Date

data class RepositoryHistoryData(
    val name: String,
    val username: String,
    val starCount: Int,
    val forkCount: Int,
    val visitedDate: Date,
)
