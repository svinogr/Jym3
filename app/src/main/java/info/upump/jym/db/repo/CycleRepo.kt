package info.upump.jym.db.repo

import android.content.Context
import android.util.Log
import androidx.room.Room
import info.upump.jym.App
import info.upump.jym.TAG
import info.upump.jym.db.RepoActions
import info.upump.jym.db.RoomDB
import info.upump.jym.db.entities.CycleEntity
import java.io.File

class CycleRepo private constructor(private val context: Context) : RepoActions<CycleEntity> {
    private val cycleDao = App.db.cycleDao()

    companion object {
        private var instance: CycleRepo? = null

        fun initialize(contex: Context) {
            if (instance == null) {
                instance = CycleRepo(contex)
            }
        }

        fun get(): RepoActions<CycleEntity> {
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