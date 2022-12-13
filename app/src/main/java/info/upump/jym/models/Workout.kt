package info.upump.jym.models

import java.util.*

class Workout(
    var id: Long = 0,
    var parentId: Long = 0,
    var title: String? = null,
    var comment: String? = null,
    var startDate: Date? = null,
    var finishDate: Date? = null,
    var defaultType: Boolean = false,
    var day: Day? = null,
    var exerciseList: MutableList<Exercise> = mutableListOf<Exercise>()
) {
}