package kr.co.alm.mobile_tutorial.local.source

import kr.co.alm.mobile_tutorial.data.source.local.KeywordLocalDataSource

class KeywordLocalDataSourceImpl : KeywordLocalDataSource {

    override suspend fun updateKeyword(keyword: String): Result<Unit> {
        TODO("Not yet implemented")
    }

    override suspend fun fetchKeyword(): Result<String> {
        TODO("Not yet implemented")
    }
}
