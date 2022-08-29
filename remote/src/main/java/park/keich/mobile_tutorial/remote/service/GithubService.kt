package park.keich.mobile_tutorial.remote.service

import park.keich.mobile_tutorial.remote.model.RepositoryDTO

interface GithubService {

    suspend fun fetchRepositoryList(username: String): List<RepositoryDTO>
}
