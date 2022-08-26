package kr.co.alm.mobile_tutorial.presentation.ui.home

import androidx.lifecycle.ViewModel
import kr.co.alm.mobile_tutorial.domain.model.Repository
import kr.co.alm.mobile_tutorial.domain.repository.GithubRepository

class HomeViewModel(
    private val githubRepository: GithubRepository,
) : ViewModel() {

    fun fetchRepositoryList(username: String): List<Repository> {
        TODO("Not yet implemented")
    }
}
