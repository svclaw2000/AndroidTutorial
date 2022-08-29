package park.keich.mobile_tutorial.local.source

import park.keich.mobile_tutorial.data.model.RepositoryData
import park.keich.mobile_tutorial.data.model.RepositoryHistoryData
import park.keich.mobile_tutorial.data.source.local.GithubLocalDataSource
import park.keich.mobile_tutorial.local.dao.GithubHistoryDao
import park.keich.mobile_tutorial.local.model.RepositoryHistoryEntity
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale
import javax.inject.Inject

class GithubLocalDataSourceImpl @Inject constructor(
    private val githubHistoryDao: GithubHistoryDao,
) : GithubLocalDataSource {

    private val sdfUtc = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.getDefault())

    override suspend fun addRepositoryHistory(repository: RepositoryData): Result<Unit> {
        return runCatching {
            githubHistoryDao.insertHistory(
                RepositoryHistoryEntity(
                    name = repository.name,
                    username = repository.username,
                    starCount = repository.starCount,
                    forkCount = repository.forkCount,
                    date = sdfUtc.format(Date())
                )
            )
        }
    }

    override suspend fun fetchRepositoryHistoryList(): Result<List<RepositoryHistoryData>> {
        return runCatching {
            githubHistoryDao.fetchHistoryList().map {
                RepositoryHistoryData(
                    name = it.name,
                    username = it.username,
                    starCount = it.starCount,
                    forkCount = it.forkCount,
                    visitedDate = sdfUtc.parse(it.date) ?: Date()
                )
            }
        }
    }
}
