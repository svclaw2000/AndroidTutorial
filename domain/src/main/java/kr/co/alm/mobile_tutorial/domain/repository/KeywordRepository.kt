package kr.co.alm.mobile_tutorial.domain.repository

interface KeywordRepository {

    suspend fun updateKeyword(keyword: String): Result<Unit>

    suspend fun fetchKeyword(): Result<String>
}
