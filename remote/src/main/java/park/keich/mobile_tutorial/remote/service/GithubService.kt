package park.keich.mobile_tutorial.remote.service

import park.keich.mobile_tutorial.remote.model.RepositoryDTO
import park.keich.mobile_tutorial.remote.model.CommitDTO
import retrofit2.http.GET
import retrofit2.http.Path

interface GithubService {

    @GET("users/{username}/repos")
    suspend fun fetchRepositoryList(@Path("username") username: String): List<RepositoryDTO>

    @GET("repos/{username}/{repositoryName}/commits")
    suspend fun fetchCommitList(@Path("username") username: String, @Path("repositoryName") repositoryName: String): List<CommitDTO>
}
