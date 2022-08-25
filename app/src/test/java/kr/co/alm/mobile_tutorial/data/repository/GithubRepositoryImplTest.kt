package kr.co.alm.mobile_tutorial.data.repository

import kotlinx.coroutines.test.runTest
import kr.co.alm.mobile_tutorial.domain.repository.GithubRepository
import kr.co.alm.mobile_tutorial.local.source.GithubLocalDataSourceImpl
import kr.co.alm.mobile_tutorial.remote.retrofit.GithubRetrofitModule
import kr.co.alm.mobile_tutorial.remote.source.GithubRemoteDataSourceImpl
import org.junit.Before
import org.junit.Test

class GithubRepositoryImplTest {

    private lateinit var repository: GithubRepository

    @Before
    fun setUp() {
        repository = GithubRepositoryImpl(
            local = GithubLocalDataSourceImpl(),
            remote = GithubRemoteDataSourceImpl(GithubRetrofitModule().githubService),
        )
    }

    @Test
    fun fetchRepositoryList() = runTest {
        repository.fetchRepositoryList("svclaw2000").onSuccess { repositoryList ->
            repositoryList.forEach(::println)
        }
    }
}
