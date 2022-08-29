package park.keich.mobile_tutorial.domain.repository

interface KeywordRepository {

    suspend fun updateKeyword(keyword: String): Result<Unit>

    suspend fun fetchKeyword(): Result<String>
}
