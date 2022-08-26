package kr.co.alm.mobile_tutorial.data.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kr.co.alm.mobile_tutorial.data.repository.GithubRepositoryImpl
import kr.co.alm.mobile_tutorial.domain.repository.GithubRepository

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    abstract fun bindGithubRepository(impl: GithubRepositoryImpl): GithubRepository
}
