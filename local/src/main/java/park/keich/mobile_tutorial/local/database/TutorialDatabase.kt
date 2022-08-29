package park.keich.mobile_tutorial.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import park.keich.mobile_tutorial.local.dao.GithubHistoryDao
import park.keich.mobile_tutorial.local.model.RepositoryHistoryEntity

@Database(
    entities = [RepositoryHistoryEntity::class],
    version = 1,
)
abstract class TutorialDatabase : RoomDatabase() {

    abstract fun githubHistoryDao(): GithubHistoryDao
}
