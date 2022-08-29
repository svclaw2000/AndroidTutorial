package park.keich.mobile_tutorial.data.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import park.keich.mobile_tutorial.data.repository.GithubRepositoryImpl
import park.keich.mobile_tutorial.domain.repository.GithubRepository

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    abstract fun bindGithubRepository(impl: GithubRepositoryImpl): GithubRepository
}
