package park.keich.mobile_tutorial.presentation.ui.history

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import park.keich.mobile_tutorial.domain.model.RepositoryHistory
import park.keich.mobile_tutorial.domain.repository.GithubRepository
import javax.inject.Inject

@HiltViewModel
class HistoryViewModel @Inject constructor(
    private val githubRepository: GithubRepository,
) : ViewModel() {

    private val _historyList = MutableStateFlow<List<RepositoryHistory>>(emptyList())
    val historyList = _historyList.asStateFlow()

    fun loadHistoryList() {
        viewModelScope.launch {
            githubRepository.fetchRepositoryHistoryList().onSuccess {
                _historyList.value = it
            }
        }
    }
}
