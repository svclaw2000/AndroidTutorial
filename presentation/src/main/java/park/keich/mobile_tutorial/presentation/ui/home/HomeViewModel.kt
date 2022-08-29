package park.keich.mobile_tutorial.presentation.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import park.keich.mobile_tutorial.domain.model.Repository
import park.keich.mobile_tutorial.domain.repository.GithubRepository
import kotlinx.coroutines.launch
import park.keich.mobile_tutorial.domain.repository.KeywordRepository
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val githubRepository: GithubRepository,
    private val keywordRepository: KeywordRepository,
) : ViewModel() {

    val keyword = MutableStateFlow("")

    private val _repositoryList = MutableStateFlow<List<Repository>>(emptyList())
    val repositoryList = _repositoryList.asStateFlow()

    fun loadRepositoryList() {
        viewModelScope.launch {
            githubRepository.fetchRepositoryList(keyword.value).onSuccess {
                _repositoryList.value = it
            }
        }
    }

    fun saveKeyword() {
        viewModelScope.launch {
            keywordRepository.updateKeyword(keyword.value)
        }
    }

    fun loadKeyword() {
        viewModelScope.launch {
            keywordRepository.fetchKeyword().onSuccess {
                keyword.value = it
                loadRepositoryList()
            }
        }
    }

    fun addRepositoryHistory(repository: Repository) {
        viewModelScope.launch {
            githubRepository.addRepositoryHistory(repository)
        }
    }
}
