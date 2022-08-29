package park.keich.mobile_tutorial.data.source.local

interface KeywordLocalDataSource {

    suspend fun updateKeyword(keyword: String): Result<Unit>

    suspend fun fetchKeyword(): Result<String>
}
