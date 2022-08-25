package kr.co.alm.mobile_tutorial.remote.source

import kr.co.alm.mobile_tutorial.data.model.CommitData
import kr.co.alm.mobile_tutorial.data.model.RepositoryData
import kr.co.alm.mobile_tutorial.data.source.remote.GithubRemoteDataSource

class GithubRemoteDataSourceImpl : GithubRemoteDataSource {

    override suspend fun fetchRepositoryList(username: String): Result<List<RepositoryData>> {
        TODO("Not yet implemented")
    }

    override suspend fun fetchCommitList(username: String, repositoryName: String): Result<List<CommitData>> {
        TODO("Not yet implemented")
    }
}
