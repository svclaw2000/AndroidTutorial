package park.keich.mobile_tutorial.local.di

import android.content.Context
import android.content.SharedPreferences
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import park.keich.mobile_tutorial.local.database.TutorialDatabase

@Module
@InstallIn(SingletonComponent::class)
object LocalModule {

    @Provides
    fun provideSharedPreferences(
        @ApplicationContext context: Context
    ): SharedPreferences = context.getSharedPreferences("preferences", Context.MODE_PRIVATE)

    @Provides
    fun provideDatabase(
        @ApplicationContext context: Context
    ): TutorialDatabase = Room.databaseBuilder(context, TutorialDatabase::class.java, "tutorial.db")
        .fallbackToDestructiveMigrationOnDowngrade()
        .build()

    @Provides
    fun provideGithubHistoryDao(
        database: TutorialDatabase
    ) = database.githubHistoryDao()
}
