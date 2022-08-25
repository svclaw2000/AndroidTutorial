package kr.co.alm.mobile_tutorial.data.repository

import kr.co.alm.mobile_tutorial.data.source.local.GithubLocalDataSource
import kr.co.alm.mobile_tutorial.data.source.remote.GithubRemoteDataSource
import kr.co.alm.mobile_tutorial.domain.model.Commit
import kr.co.alm.mobile_tutorial.domain.model.Repository
import kr.co.alm.mobile_tutorial.domain.model.RepositoryHistory
import kr.co.alm.mobile_tutorial.domain.repository.GithubRepository

class GithubRepositoryImpl(
    private val local: GithubLocalDataSource,
    private val remote: GithubRemoteDataSource,
) : GithubRepository {

    override suspend fun fetchRepositoryList(username: String): Result<List<Repository>> {
        TODO("Not yet implemented")
    }

    override suspend fun addRepositoryHistory(repository: Repository): Result<Unit> {
        TODO("Not yet implemented")
    }

    override suspend fun fetchRepositoryHistoryList(): Result<List<RepositoryHistory>> {
        TODO("Not yet implemented")
    }

    override suspend fun fetchCommitList(organizationName: String, repositoryName: String): Result<List<Commit>> {
        TODO("Not yet implemented")
    }
}
