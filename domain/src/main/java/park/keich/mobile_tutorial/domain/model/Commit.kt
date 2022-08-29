package park.keich.mobile_tutorial.domain.model

import java.util.Date

data class Commit(
    val message: String,
    val authorName: String,
    val authorEmail: String,
    val date: Date,
)
