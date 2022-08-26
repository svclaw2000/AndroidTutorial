package park.keich.mobile_tutorial.data.repository

import park.keich.mobile_tutorial.data.source.local.GithubLocalDataSource
import park.keich.mobile_tutorial.data.source.remote.GithubRemoteDataSource
import park.keich.mobile_tutorial.domain.model.Commit
import park.keich.mobile_tutorial.domain.model.Repository
import park.keich.mobile_tutorial.domain.model.RepositoryHistory
import park.keich.mobile_tutorial.domain.repository.GithubRepository
import javax.inject.Inject

class GithubRepositoryImpl @Inject constructor(
    private val local: GithubLocalDataSource,
    private val remote: GithubRemoteDataSource,
) : GithubRepository {

    override suspend fun fetchRepositoryList(username: String): Result<List<Repository>> {
        return remote.fetchRepositoryList(username).map { dataList ->
            dataList.map { data ->
                Repository(
                    name = data.name,
                    username = data.username,
                    starCount = data.starCount,
                    forkCount = data.forkCount,
                )
            }
        }
    }

    override suspend fun addRepositoryHistory(repository: Repository): Result<Unit> {
        TODO("Not yet implemented")
    }

    override suspend fun fetchRepositoryHistoryList(): Result<List<RepositoryHistory>> {
        TODO("Not yet implemented")
    }

    override suspend fun fetchCommitList(username: String, repositoryName: String): Result<List<Commit>> {
        TODO("Not yet implemented")
    }
}
