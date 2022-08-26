package kr.co.alm.mobile_tutorial.local.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import kr.co.alm.mobile_tutorial.local.dao.GithubHistoryDao
import kr.co.alm.mobile_tutorial.local.model.RepositoryHistoryEntity

@Database(
    entities = [RepositoryHistoryEntity::class],
    version = 1,
)
abstract class TutorialDatabase : RoomDatabase() {

    abstract fun githubHistoryDao(): GithubHistoryDao

    fun create(context: Context): TutorialDatabase {
        return Room.databaseBuilder(context, TutorialDatabase::class.java, "tutorial.db")
            .fallbackToDestructiveMigrationOnDowngrade()
            .build()
    }
}
