package park.keich.mobile_tutorial.local.source

import android.content.SharedPreferences
import park.keich.mobile_tutorial.data.source.local.KeywordLocalDataSource
import androidx.core.content.edit
import javax.inject.Inject

class KeywordLocalDataSourceImpl @Inject constructor(
    private val sharedPreferences: SharedPreferences,
) : KeywordLocalDataSource {

    override suspend fun updateKeyword(keyword: String): Result<Unit> {
        return runCatching {
            sharedPreferences.edit {
                putString(KEY_KEYWORD, keyword)
            }
        }
    }

    override suspend fun fetchKeyword(): Result<String> {
        return runCatching {
            sharedPreferences.getString(KEY_KEYWORD, null) ?: ""
        }
    }

    companion object {
        private const val KEY_KEYWORD = "KEY_KEYWORD"
    }
}
