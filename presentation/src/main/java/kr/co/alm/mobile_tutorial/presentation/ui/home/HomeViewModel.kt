package kr.co.alm.mobile_tutorial.presentation.ui.home

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kr.co.alm.mobile_tutorial.domain.model.Repository
import kr.co.alm.mobile_tutorial.domain.repository.GithubRepository

class HomeViewModel(
    private val githubRepository: GithubRepository,
) : ViewModel() {

    val keyword = MutableStateFlow("")

    private val _repositoryList = MutableStateFlow<List<Repository>>(emptyList())
    val repositoryList = _repositoryList.asStateFlow()

    fun fetchRepositoryList(username: String): List<Repository> {
        TODO("Not yet implemented")
    }

    fun loadRepositoryList() {
        TODO("Not yet implemented")
    }
}
