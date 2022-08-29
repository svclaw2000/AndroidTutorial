package park.keich.mobile_tutorial.data.repository

import io.mockk.mockk
import kotlinx.coroutines.test.runTest
import org.junit.Before
import org.junit.Test
import park.keich.mobile_tutorial.domain.repository.GithubRepository
import park.keich.mobile_tutorial.remote.di.RemoteModule
import park.keich.mobile_tutorial.remote.source.GithubRemoteDataSourceImpl

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
