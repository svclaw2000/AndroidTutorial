package park.keich.mobile_tutorial.local.source

import android.content.SharedPreferences
import park.keich.mobile_tutorial.data.source.local.KeywordLocalDataSource

class KeywordLocalDataSourceImpl(
    private val sharedPreferences: SharedPreferences,
) : KeywordLocalDataSource {

    override suspend fun updateKeyword(keyword: String): Result<Unit> {
        TODO("Not yet implemented")
    }

    override suspend fun fetchKeyword(): Result<String> {
        TODO("Not yet implemented")
    }
}
