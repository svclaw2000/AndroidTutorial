package kr.co.alm.mobile_tutorial.remote.source

import kotlinx.coroutines.test.runTest
import kr.co.alm.mobile_tutorial.data.source.remote.GithubRemoteDataSource
import kr.co.alm.mobile_tutorial.remote.retrofit.GithubRetrofitModule
import org.junit.Before
import org.junit.Test

class GithubRemoteDataSourceImplTest {

    private lateinit var remote: GithubRemoteDataSource

    @Before
    fun setUp() {
        remote = GithubRemoteDataSourceImpl(GithubRetrofitModule().githubService)
    }

    @Test
    fun fetchRepositoryList() = runTest {
        remote.fetchRepositoryList("svclaw2000").onSuccess { repositoryList ->
            repositoryList.forEach(::println)
        }
    }
}
