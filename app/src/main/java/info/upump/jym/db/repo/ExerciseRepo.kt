package info.upump.jym.db.repo

import android.content.Context
import info.upump.jym.App
import info.upump.jym.db.RepoActions
import info.upump.jym.db.entities.ExerciseEntity

class ExerciseRepo private constructor(private val context: Context) : RepoActions<ExerciseEntity> {
    private val exerciseRepo = App.db.exerciseDao()

    companion object {
        private var instance: ExerciseRepo? = null

        fun initialize(context: Context) {
            if (instance == null) {
                instance = ExerciseRepo(context)
            }
        }

        fun get(): RepoActions<ExerciseEntity> {
            return instance ?: throw IllegalStateException(" first need initialize repo")
        }
    }

    override fun getAll(): List<ExerciseEntity> {
        return exerciseRepo.getAll()
    }

    override fun save(item: ExerciseEntity): ExerciseEntity {
        TODO("Not yet implemented")
    }

}