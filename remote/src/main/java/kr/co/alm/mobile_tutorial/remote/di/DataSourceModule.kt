package kr.co.alm.mobile_tutorial.remote.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kr.co.alm.mobile_tutorial.data.source.remote.GithubRemoteDataSource
import kr.co.alm.mobile_tutorial.remote.source.GithubRemoteDataSourceImpl

@Module
@InstallIn(SingletonComponent::class)
abstract class DataSourceModule {

    @Binds
    abstract fun bindGithubRemoteDataSource(impl: GithubRemoteDataSourceImpl): GithubRemoteDataSource
}
