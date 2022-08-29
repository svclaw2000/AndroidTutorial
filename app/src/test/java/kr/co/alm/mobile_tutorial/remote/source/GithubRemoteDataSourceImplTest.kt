package park.keich.mobile_tutorial.remote.source

import kotlinx.coroutines.test.runTest
import org.junit.Before
import org.junit.Test
import park.keich.mobile_tutorial.data.source.remote.GithubRemoteDataSource
import park.keich.mobile_tutorial.remote.di.RemoteModule

class GithubRemoteDataSourceImplTest {

    private lateinit var remote: GithubRemoteDataSource

    @Before
    fun setUp() {
        remote = GithubRemoteDataSourceImpl(RemoteModule.provideGithubService())
    }

    @Test
    fun fetchRepositoryList() = runTest {
        remote.fetchRepositoryList("svclaw2000").onSuccess { repositoryList ->
            repositoryList.forEach(::println)
        }
    }
}
