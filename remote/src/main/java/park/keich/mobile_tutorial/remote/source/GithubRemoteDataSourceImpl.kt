package park.keich.mobile_tutorial.remote.source

import park.keich.mobile_tutorial.data.model.CommitData
import park.keich.mobile_tutorial.data.model.RepositoryData
import park.keich.mobile_tutorial.data.source.remote.GithubRemoteDataSource
import park.keich.mobile_tutorial.remote.service.GithubService
import javax.inject.Inject

class GithubRemoteDataSourceImpl @Inject constructor(
    private val githubService: GithubService,
) : GithubRemoteDataSource {

    override suspend fun fetchRepositoryList(username: String): Result<List<RepositoryData>> {
        return runCatching {
            val dtoList = githubService.fetchRepositoryList(username)
            TODO("dtoList: List<RepositoryDTO>를 List<RepositoryData>로 변환하여 return 한다.")
        }
    }

    override suspend fun fetchCommitList(username: String, repositoryName: String): Result<List<CommitData>> {
        TODO("Not yet implemented")
    }
}
