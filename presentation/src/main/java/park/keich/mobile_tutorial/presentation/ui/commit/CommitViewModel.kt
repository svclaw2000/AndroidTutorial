package park.keich.mobile_tutorial.presentation.ui.commit

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import park.keich.mobile_tutorial.domain.model.Commit
import park.keich.mobile_tutorial.domain.repository.GithubRepository
import javax.inject.Inject

@HiltViewModel
class CommitViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle,
    private val githubRepository: GithubRepository,
) : ViewModel() {

    val repositoryName: String = savedStateHandle["repositoryName"] ?: ""
    val username: String = savedStateHandle["username"] ?: ""

    private val _commitList = MutableStateFlow<List<Commit>>(emptyList())
    val commitList = _commitList.asStateFlow()

    fun loadCommitList() {
        viewModelScope.launch {
            githubRepository.fetchCommitList(username, repositoryName).onSuccess {
                _commitList.value = it
            }
        }
    }
}
