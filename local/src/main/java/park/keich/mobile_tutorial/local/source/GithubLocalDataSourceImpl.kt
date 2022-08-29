package park.keich.mobile_tutorial.local.source

import park.keich.mobile_tutorial.data.model.RepositoryData
import park.keich.mobile_tutorial.data.model.RepositoryHistoryData
import park.keich.mobile_tutorial.data.source.local.GithubLocalDataSource
import park.keich.mobile_tutorial.local.dao.GithubHistoryDao
import javax.inject.Inject

class GithubLocalDataSourceImpl @Inject constructor(
    private val githubHistoryDao: GithubHistoryDao,
) : GithubLocalDataSource {

    override suspend fun addRepositoryHistory(repository: RepositoryData): Result<Unit> {
        TODO("Not yet implemented")
    }

    override suspend fun fetchRepositoryHistoryList(): Result<List<RepositoryHistoryData>> {
        TODO("Not yet implemented")
    }
}
