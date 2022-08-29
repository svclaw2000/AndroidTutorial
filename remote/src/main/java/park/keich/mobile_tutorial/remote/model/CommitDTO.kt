package park.keich.mobile_tutorial.remote.model

import com.google.gson.annotations.SerializedName

data class CommitDTO(
    @SerializedName("commit") val commit: Commit,
) {

    data class Commit(
        @SerializedName("message") val message: String = "",
        @SerializedName("author") val author: Author = Author(),
    ) {

        data class Author(
            @SerializedName("name") val name: String = "",
            @SerializedName("email") val email: String = "",
            @SerializedName("date") val date: String = "",
        )
    }
}
