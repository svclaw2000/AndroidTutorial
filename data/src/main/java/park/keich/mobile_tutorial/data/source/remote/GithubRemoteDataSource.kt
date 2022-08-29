package park.keich.mobile_tutorial.data.source.remote

import park.keich.mobile_tutorial.data.model.CommitData
import park.keich.mobile_tutorial.data.model.RepositoryData

interface GithubRemoteDataSource {

    suspend fun fetchRepositoryList(username: String): Result<List<RepositoryData>>

    suspend fun fetchCommitList(username: String, repositoryName: String): Result<List<CommitData>>
}
