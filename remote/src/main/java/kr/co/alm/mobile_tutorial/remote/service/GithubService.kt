package kr.co.alm.mobile_tutorial.remote.service

import kr.co.alm.mobile_tutorial.remote.model.RepositoryDTO

interface GithubService {

    suspend fun fetchRepositoryList(username: String): List<RepositoryDTO>
}
