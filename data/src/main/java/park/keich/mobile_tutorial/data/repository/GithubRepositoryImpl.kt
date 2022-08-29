package park.keich.mobile_tutorial.data.repository

import park.keich.mobile_tutorial.data.model.RepositoryData
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
        return local.addRepositoryHistory(
            RepositoryData(
                name = repository.name,
                username = repository.username,
                starCount = repository.starCount,
                forkCount = repository.forkCount,
            )
        )
    }

    override suspend fun fetchRepositoryHistoryList(): Result<List<RepositoryHistory>> {
        return local.fetchRepositoryHistoryList().map { dataList ->
            dataList.map { data ->
                RepositoryHistory(
                    name = data.name,
                    username = data.username,
                    starCount = data.starCount,
                    forkCount = data.forkCount,
                    visitedDate = data.visitedDate,
                )
            }
        }
    }

    override suspend fun fetchCommitList(username: String, repositoryName: String): Result<List<Commit>> {
        return remote.fetchCommitList(username, repositoryName).map { dataList ->
            dataList.map { data ->
                Commit(
                    message = data.message,
                    authorName = data.authorName,
                    authorEmail = data.authorEmail,
                    date = data.date,
                )
            }
        }
    }
}
