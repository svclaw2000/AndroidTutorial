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
            dtoList.map { dto ->
                RepositoryData(
                    name = dto.name,
                    username = dto.user.name,
                    starCount = dto.starCount,
                    forkCount = dto.forkCount,
                )
            }
        }
    }

    override suspend fun fetchCommitList(username: String, repositoryName: String): Result<List<CommitData>> {
        TODO("Not yet implemented")
    }
}
