package park.keich.mobile_tutorial.domain.model

import java.util.Date

data class RepositoryHistory(
    val name: String,
    val username: String,
    val starCount: Int,
    val forkCount: Int,
    val visitedDate: Date,
)
