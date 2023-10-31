import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mdemel.afl.models.Category
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
private const val mango = "CategoryViewModel"


class SharedViewModel : ViewModel() {
    private val selectedCategories by lazy {
        MutableLiveData<Array<Category>?>(null)
    }
    init {
        selectedCategories.value = selectedCategories.value
    }

    fun getSelectedCategories(): LiveData<Array<Category>?> {
        return selectedCategories
    }

    fun setSelectedCategories (categories: Array<Category>?) {
        CoroutineScope(Dispatchers.Main).launch {

            selectedCategories.value = categories
        }
    }
}
//class SharedViewModel : ViewModel() {
//    private val _selectedCategories = MutableLiveData<Set<Category>>(emptySet())
//    val selectedCategories: LiveData<Set<Category>> = _selectedCategories
//
//    fun addSelectedCategory(category: Category) { CoroutineScope(Dispatchers.Main).launch {
//        val currentSet = _selectedCategories.value.orEmpty().toMutableSet()
//        currentSet.add(category)
//        _selectedCategories.value = currentSet
//        Log.d(selectedCategories.toString(), "addSelectedCategory:${selectedCategories.value.toString()} ")
//    }
//    }
//
//    fun removeSelectedCategory(category: Category) {
//        CoroutineScope(Dispatchers.Main).launch{
//            val currentSet = _selectedCategories.value.orEmpty().toMutableSet()
//            currentSet.remove(category)
//            _selectedCategories.value = currentSet
//        }
//    }
//}



//class SharedViewModel(private val repository: SharedRepository) : ViewModel() {
//    val categories = repository.getCategories()
//    val selectedCategories = repository.getSelectedCategories()
//
//    fun addSelectedCategory(category: Category) {
//        repository.addSelectedCategory(category)
//    }
//
//    fun removeSelectedCategory(category: Category) {
//        repository.removeSelectedCategory(category)
//    }
//}
//class SharedViewModel : ViewModel() {
//    private val sharedRepository = MutableLiveData<SharedRepository>()
//
//    // Initialize the SharedViewModel with the repository
//    fun initialize(repository: SharedRepository) {
//        sharedRepository.value = repository
//    }
//
//    // Access the repository methods using the sharedRepository LiveData
//    private fun getRepository() = sharedRepository.value
//
//    val categories = getRepository()?.getCategories()
//
//    val selectedCategories = getRepository()?.getSelectedCategories()
//
//    fun addSelectedCategory(category: Category) {
//        CoroutineScope(Dispatchers.Main).launch {
//            getRepository()?.addSelectedCategory(category)
//        }
//    }
//    fun removeSelectedCategory(category: Category) {
//        CoroutineScope(Dispatchers.Main).launch {
//            getRepository()?.removeSelectedCategory(category)
//        }
//    }
//}
