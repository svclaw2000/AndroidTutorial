package park.keich.mobile_tutorial.domain.repository

import park.keich.mobile_tutorial.domain.model.Commit
import park.keich.mobile_tutorial.domain.model.Repository
import park.keich.mobile_tutorial.domain.model.RepositoryHistory

interface GithubRepository {

    suspend fun fetchRepositoryList(username: String): Result<List<Repository>>

    suspend fun addRepositoryHistory(repository: Repository): Result<Unit>

    suspend fun fetchRepositoryHistoryList(): Result<List<RepositoryHistory>>

    suspend fun fetchCommitList(username: String, repositoryName: String): Result<List<Commit>>
}
