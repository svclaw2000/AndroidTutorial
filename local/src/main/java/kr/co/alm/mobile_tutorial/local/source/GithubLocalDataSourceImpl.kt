package kr.co.alm.mobile_tutorial.local.source

import kr.co.alm.mobile_tutorial.data.model.RepositoryData
import kr.co.alm.mobile_tutorial.data.model.RepositoryHistoryData
import kr.co.alm.mobile_tutorial.data.source.local.GithubLocalDataSource

class GithubLocalDataSourceImpl : GithubLocalDataSource {

    override suspend fun addRepositoryHistory(repository: RepositoryData): Result<Unit> {
        TODO("Not yet implemented")
    }

    override suspend fun fetchRepositoryHistoryList(): Result<List<RepositoryHistoryData>> {
        TODO("Not yet implemented")
    }
}
