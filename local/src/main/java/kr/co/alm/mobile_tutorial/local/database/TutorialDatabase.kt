package kr.co.alm.mobile_tutorial.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import kr.co.alm.mobile_tutorial.local.dao.GithubHistoryDao
import kr.co.alm.mobile_tutorial.local.model.RepositoryHistoryEntity

@Database(
    entities = [RepositoryHistoryEntity::class],
    version = 1,
)
abstract class TutorialDatabase : RoomDatabase() {

    abstract fun githubHistoryDao(): GithubHistoryDao
}
