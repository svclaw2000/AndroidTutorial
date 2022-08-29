package park.keich.mobile_tutorial.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import park.keich.mobile_tutorial.local.model.RepositoryHistoryEntity

@Dao
interface GithubHistoryDao {

    @Insert
    suspend fun insertHistory(history: RepositoryHistoryEntity)

    @Query("SELECT * FROM RepositoryHistoryEntity")
    suspend fun fetchHistoryList(): List<RepositoryHistoryEntity>
}
