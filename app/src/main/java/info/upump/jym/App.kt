package info.upump.jym

import android.app.Application
import android.util.Log
import androidx.room.Room
import info.upump.jym.db.RoomDB
import info.upump.jym.db.repo.*
import java.io.File

class App : Application() {

    companion object{
        lateinit var db: RoomDB
    }

    override fun onCreate() {
        super.onCreate()

        initializeDb()
        WorkoutRepo.initialize(applicationContext)
        CycleRepo.initialize(applicationContext)
        ExerciseRepo.initialize(applicationContext)
        ExerciseDescriptionRepo.initialize((applicationContext))
        SetsRepo.initialize((applicationContext))
    }

    private fun initializeDb() {
        val file = File(RoomDB.DB_PATH)

        if (!file.exists()) {
            Log.d(TAG, "file isnt exist")

            db =
                Room.databaseBuilder(applicationContext, RoomDB::class.java, RoomDB.BASE_NAME)
                    .createFromAsset(RoomDB.BASE_NAME)
                    .build()
        } else {
            db =
                Room.databaseBuilder(applicationContext, RoomDB::class.java, RoomDB.BASE_NAME)
                    .build()
        }
    }
}