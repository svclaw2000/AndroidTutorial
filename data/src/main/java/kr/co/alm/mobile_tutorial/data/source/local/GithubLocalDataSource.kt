package kr.co.alm.mobile_tutorial.data.source.local

import kr.co.alm.mobile_tutorial.data.model.RepositoryData
import kr.co.alm.mobile_tutorial.data.model.RepositoryHistoryData

interface GithubLocalDataSource {

    suspend fun addRepositoryHistory(repository: RepositoryData): Result<Unit>

    suspend fun fetchRepositoryHistoryList(): Result<List<RepositoryHistoryData>>
}
