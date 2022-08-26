package kr.co.alm.mobile_tutorial.local.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kr.co.alm.mobile_tutorial.data.source.local.GithubLocalDataSource
import kr.co.alm.mobile_tutorial.local.source.GithubLocalDataSourceImpl

@Module
@InstallIn(SingletonComponent::class)
abstract class DataSourceModule {

    @Binds
    abstract fun bindGithubLocalDataSource(impl: GithubLocalDataSourceImpl): GithubLocalDataSource
}
