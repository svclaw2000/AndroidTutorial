package park.keich.mobile_tutorial.data.source.local

import park.keich.mobile_tutorial.data.model.RepositoryData
import park.keich.mobile_tutorial.data.model.RepositoryHistoryData

interface GithubLocalDataSource {

    suspend fun addRepositoryHistory(repository: RepositoryData): Result<Unit>

    suspend fun fetchRepositoryHistoryList(): Result<List<RepositoryHistoryData>>
}
