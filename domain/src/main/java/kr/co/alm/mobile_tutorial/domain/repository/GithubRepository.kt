package kr.co.alm.mobile_tutorial.domain.repository

import kr.co.alm.mobile_tutorial.domain.model.Commit
import kr.co.alm.mobile_tutorial.domain.model.Repository
import kr.co.alm.mobile_tutorial.domain.model.RepositoryHistory

interface GithubRepository {

    suspend fun fetchRepositoryList(username: String): Result<List<Repository>>

    suspend fun addRepositoryHistory(repository: Repository): Result<Unit>

    suspend fun fetchRepositoryHistoryList(): Result<List<RepositoryHistory>>

    suspend fun fetchCommitList(organizationName: String, repositoryName: String): Result<List<Commit>>
}
