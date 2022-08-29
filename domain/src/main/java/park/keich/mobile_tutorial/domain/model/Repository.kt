package park.keich.mobile_tutorial.domain.model

data class Repository(
    val name: String,
    val username: String,
    val starCount: Int,
    val forkCount: Int,
)
