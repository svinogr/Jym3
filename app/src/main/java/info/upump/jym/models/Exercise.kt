package info.upump.jym.models

import java.util.*
data class Exercise(
    var id: Long = 0,
    var parentId: Long = 0,
    var title: String? = null,
    var comment: String? = null,
    var startDate: Date? = null,
    var finishDate: Date? = null,
    var defaultType: Boolean = false,
    var typeMuscle: TypeMuscle? = null,
    var template: Boolean = false,
    var setsList: MutableList<Sets> = mutableListOf<Sets>(),
    var exersiceDescription: ExerciseDescription? = null
) {
}