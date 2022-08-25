package kr.co.alm.mobile_tutorial.data.source.remote

import kr.co.alm.mobile_tutorial.data.model.CommitData
import kr.co.alm.mobile_tutorial.data.model.RepositoryData

interface GithubRemoteDataSource {

    suspend fun fetchRepositoryList(username: String): Result<List<RepositoryData>>

    suspend fun fetchCommitList(organizationName: String, repositoryName: String): Result<List<CommitData>>
}
