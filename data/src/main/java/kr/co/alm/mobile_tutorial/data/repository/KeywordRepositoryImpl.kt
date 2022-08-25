package kr.co.alm.mobile_tutorial.data.repository

import kr.co.alm.mobile_tutorial.data.source.local.KeywordLocalDataSource
import kr.co.alm.mobile_tutorial.domain.repository.KeywordRepository

class KeywordRepositoryImpl(
    private val local: KeywordLocalDataSource,
) : KeywordRepository {

    override suspend fun updateKeyword(keyword: String): Result<Unit> {
        TODO("Not yet implemented")
    }

    override suspend fun fetchKeyword(): Result<String> {
        TODO("Not yet implemented")
    }
}
