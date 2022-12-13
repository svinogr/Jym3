package info.upump.jym.models

import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*

data class Cycle(
    var id: Long = 0,
    var parentId: Long = 0,
    var title: String? = null,
    var comment: String? = null,
    var startDate: Date? = null,
    var finishDate: Date? = null,
    var defaultType: Boolean = false,
    var image: String? = null,
    var defaultImg: String? = null,
    var workoutList: MutableList<Workout> = mutableListOf<Workout>()
) {

    private val simpleDateFormat = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())


    fun setStartDateByString(stringDate: String) {
        try {
            startDate = simpleDateFormat.parse(stringDate)
        } catch (e: ParseException) {
            print(e)
        }
    }

    fun setFinishDateByString(stringDate: String) {
        try {
            finishDate = simpleDateFormat.parse(stringDate)
        }catch (e:ParseException) {
            print(e)
        }
    }

    fun getStartDateStringFormat(): String {
        return simpleDateFormat.format(finishDate!!)
    }

    fun getFinishDateStringFormat(): String {
        return simpleDateFormat.format(finishDate!!)
    }


}