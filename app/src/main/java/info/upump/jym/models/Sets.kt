package info.upump.jym.models

import java.util.*

data class Sets(
    var id: Long = 0,
    var parentId: Long = 0,
    var title: String? = null,
    var comment: String? = null,
    var startDate: Date? = null,
    var finishDate: Date? = null,
    var defaultType: Boolean = false,
    var weight: Double = 0.0,
    var reps: Int = 0,
    var weightPast: Double = 0.0
) {

}