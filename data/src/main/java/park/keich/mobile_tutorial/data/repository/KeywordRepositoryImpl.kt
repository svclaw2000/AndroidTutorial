package park.keich.mobile_tutorial.data.repository

import park.keich.mobile_tutorial.data.source.local.KeywordLocalDataSource
import park.keich.mobile_tutorial.domain.repository.KeywordRepository
import javax.inject.Inject

class KeywordRepositoryImpl @Inject constructor(
    private val local: KeywordLocalDataSource,
) : KeywordRepository {

    override suspend fun updateKeyword(keyword: String): Result<Unit> {
        return local.updateKeyword(keyword)
    }

    override suspend fun fetchKeyword(): Result<String> {
        return local.fetchKeyword()
    }
}
