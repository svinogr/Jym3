package info.upump.jym.models

import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*

class User(
    var id: Long = 0,
    var name: String? = null,
    var weight: Double = 0.0,
    var fat: Double = 0.0,
    var height: Double = 0.0,
    var neck: Double = 0.0,
    var pectoral: Double = 0.0,

    var shoulder: Double = 0.0,
    var leftBiceps: Double = 0.0,
    var rightBiceps: Double = 0.0,

    var abs: Double = 0.0,
    var leftLeg: Double = 0.0,
    var rightLeg: Double = 0.0,
    var leftCalves: Double = 0.0,
    var rightCalves: Double = 0.0,
    var date: Date? = null
) {
    private val simpleDateFormat = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())


    fun settDateByString(stringDate: String) {
        try {
            date = simpleDateFormat.parse(stringDate)
        } catch (e: ParseException) {
            print(e)
        }
    }

    fun getStartDateStringFormat(): String {
        return simpleDateFormat.format(date)
    }
}