package park.keich.mobile_tutorial.remote.model

import com.google.gson.annotations.SerializedName

data class RepositoryDTO(
    @SerializedName("name") val name: String = "",
    @SerializedName("owner") val user: UserDTO = UserDTO(),
    @SerializedName("stargazers_count") val starCount: Int = 0,
    @SerializedName("forks_count") val forkCount: Int = 0,
) {

    data class UserDTO(
        @SerializedName("login") val name: String = "",
    )
}
