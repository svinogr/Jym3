package info.upump.jym.ui.homescreen

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import info.upump.jym.db.repo.CycleRepo
import info.upump.jym.models.Cycle
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class CycleVM : ViewModel() {
        private val _cycles = MutableLiveData<List<Cycle>>()
        val cycles: LiveData<List<Cycle>> = _cycles

    fun getAll() {
        viewModelScope.launch(Dispatchers.IO){
            val ceR = CycleRepo.get().getAll()
            var list = mutableListOf<Cycle>()
            for(item in ceR) {
                val c = Cycle()
                c.id = item._id
                c.title = item.title
                list.add(c)
                print(c.id)
            }

            print(list.size)

            _cycles.postValue(list)

        }
    }
}