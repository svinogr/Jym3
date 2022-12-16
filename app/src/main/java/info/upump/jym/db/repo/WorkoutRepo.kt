package info.upump.jym.db.repo

import android.annotation.SuppressLint
import android.content.Context
import android.util.Log
import androidx.room.Room
import info.upump.jym.TAG
import info.upump.jym.db.RepoActions
import info.upump.jym.db.RoomDB
import info.upump.jym.db.entities.WorkoutEntity
import java.io.File

class WorkoutRepo(private val context: Context) : RepoActions<WorkoutEntity> {
    private var db = getDB()
    private fun getDB(): RoomDB {
        val file = File(RoomDB.DB_PATH)

        if (!file.exists()) {
            Log.d(TAG, "file isnt exist")

            db =
                Room.databaseBuilder(context, RoomDB::class.java, RoomDB.BASE_NAME)
                    .createFromAsset(RoomDB.BASE_NAME)
                    .build()
        } else {
            db =
                Room.databaseBuilder(context, RoomDB::class.java, RoomDB.BASE_NAME)
                    .build()
        }

        return db
    }

    private val workoutDao = db.workoutDao()

    companion object {
        @SuppressLint("StaticFieldLeak")
        private var instance: WorkoutRepo? = null

        fun initialize(context: Context) {
            if (instance == null) {
                instance = WorkoutRepo(context)
            }
        }

        fun get(): RepoActions<WorkoutEntity> {
            return instance ?: throw IllegalStateException(" first need initialize repo")
        }
    }

    override fun getAll(): List<WorkoutEntity> {
        return workoutDao.getAllWorkouts()
    }

    override fun save(item: WorkoutEntity) {
        TODO("Not yet implemented")
    }

}