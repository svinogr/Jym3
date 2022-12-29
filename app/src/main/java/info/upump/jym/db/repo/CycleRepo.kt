package info.upump.jym.db.repo

import android.content.Context
import android.util.Log
import androidx.room.Room
import info.upump.jym.TAG
import info.upump.jym.db.RepoActions
import info.upump.jym.db.RoomDB
import info.upump.jym.db.entities.CycleEntity
import java.io.File

class CycleRepo private constructor(private val contex: Context) : RepoActions<CycleEntity> {
    private var db = getDB()
    private fun getDB(): RoomDB {
        val file = File(RoomDB.DB_PATH)

        if (!file.exists()) {
            Log.d(TAG, "file isnt exist")

            db =
                Room.databaseBuilder(contex, RoomDB::class.java, RoomDB.BASE_NAME)
                    .createFromAsset(RoomDB.BASE_NAME)
                    .build()
        } else {
            db =
                Room.databaseBuilder(contex, RoomDB::class.java, RoomDB.BASE_NAME)
                    .build()
        }

        return db
    }

    private val cycleDao = db.cycleDao()

    companion object {
        private var instance: CycleRepo? = null

        fun initialize(contex: Context) {
            if (instance == null) {
                instance = CycleRepo(contex)
            }
        }

        fun get(): RepoActions<CycleEntity>{
            return instance ?: throw IllegalStateException(" first need initialize repo")
        }
    }

    override fun getAll(): List<CycleEntity> {
       return cycleDao.getAllCycles()
    }

    override fun save(item: CycleEntity) {
        cycleDao.save(item)
    }

}