package info.upump.jym.db.repo

import android.content.Context
import info.upump.jym.App
import info.upump.jym.db.RepoActions
import info.upump.jym.db.entities.ExerciseDescriptionEntity
import info.upump.jym.db.entities.ExerciseEntity
import info.upump.jym.models.ExerciseDescription

class ExerciseDescriptionRepo private constructor(private val context: Context): RepoActions<ExerciseDescriptionEntity> {
    private val exerciseDescriptionRepo = App.db.exerciseDescriptionDao()

    companion object {
        private var instance: ExerciseDescriptionRepo? = null

        fun initialize(context: Context) {
            if (instance == null) {
                instance = ExerciseDescriptionRepo(context)
            }
        }
        fun get(): RepoActions<ExerciseDescriptionEntity> {
            return ExerciseDescriptionRepo.instance ?: throw IllegalStateException(" first need initialize repo")
        }
    }


    override fun getAll(): List<ExerciseDescriptionEntity> {
      return exerciseDescriptionRepo.getAll()
    }

    override fun save(item: ExerciseDescriptionEntity) {
        TODO("Not yet implemented")
    }
}