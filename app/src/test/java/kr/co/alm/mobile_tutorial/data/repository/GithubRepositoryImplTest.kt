package kr.co.alm.mobile_tutorial.data.repository

import io.mockk.mockk
import kotlinx.coroutines.test.runTest
import kr.co.alm.mobile_tutorial.domain.repository.GithubRepository
import kr.co.alm.mobile_tutorial.local.source.GithubLocalDataSourceImpl
import kr.co.alm.mobile_tutorial.remote.di.RemoteModule
import kr.co.alm.mobile_tutorial.remote.source.GithubRemoteDataSourceImpl
import org.junit.Before
import org.junit.Test

class GithubRepositoryImplTest {

    private lateinit var repository: GithubRepository

    @Before
    fun setUp() {
        repository = GithubRepositoryImpl(
            local = mockk(),
            remote = GithubRemoteDataSourceImpl(RemoteModule.provideGithubService()),
        )
    }

    @Test
    fun fetchRepositoryList() = runTest {
        repository.fetchRepositoryList("svclaw2000").onSuccess { repositoryList ->
            repositoryList.forEach(::println)
        }
    }
}
