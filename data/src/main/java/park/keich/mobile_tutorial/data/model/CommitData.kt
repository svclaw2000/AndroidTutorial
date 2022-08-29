package park.keich.mobile_tutorial.data.model

import java.util.Date

data class CommitData(
    val message: String,
    val authorName: String,
    val authorEmail: String,
    val date: Date,
)
