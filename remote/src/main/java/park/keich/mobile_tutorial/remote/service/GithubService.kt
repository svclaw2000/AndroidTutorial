package park.keich.mobile_tutorial.remote.service

import park.keich.mobile_tutorial.remote.model.RepositoryDTO
import retrofit2.http.GET
import retrofit2.http.Path

interface GithubService {

    @GET("users/{username}/repos")
    suspend fun fetchRepositoryList(@Path("username") username: String): List<RepositoryDTO>
}
