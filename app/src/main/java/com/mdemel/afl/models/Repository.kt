import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.mdemel.afl.models.Category
import com.mdemel.afl.models.DataRepository

class SharedRepository {
    private val categoriesLiveData = MutableLiveData<List<Category>>() // LiveData for categories
    private val selectedCategoriesLiveData = MutableLiveData<Set<Category>>() // LiveData for selected categories

    // Initialize the shared data in the constructor
    init {
        categoriesLiveData.value = DataRepository().initializeCategories() // Initialize categories
        selectedCategoriesLiveData.value = emptySet() // Initialize selected categories to an empty set

    }
    fun getCategories(): LiveData<List<Category>> {

        return categoriesLiveData
    }

    fun getSelectedCategories(): LiveData<Set<Category>> {

            return selectedCategoriesLiveData

    }


    fun addSelectedCategory(category: Category) { synchronized(selectedCategoriesLiveData) {
        val currentSelectedCategories = selectedCategoriesLiveData.value ?: emptySet()

        selectedCategoriesLiveData.value = currentSelectedCategories + category
    }
    }

    fun removeSelectedCategory(category: Category) {   synchronized(selectedCategoriesLiveData) {
        val currentSelectedCategories = selectedCategoriesLiveData.value ?: emptySet()
        selectedCategoriesLiveData.value = currentSelectedCategories - category
    }}
}
