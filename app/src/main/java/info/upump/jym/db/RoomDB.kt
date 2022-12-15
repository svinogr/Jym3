package info.upump.jym.db

import androidx.room.Database
import androidx.room.RoomDatabase
import info.upump.jym.db.dao.CycleDao
import info.upump.jym.db.entities.CycleEntity


@Database(version = 1, entities = [CycleEntity::class])
abstract class RoomDB : RoomDatabase() {
    abstract fun cycleDao() : CycleDao
    companion object {
        const val BASE_NAME = "jym.db"
        const val DB_PATH = "data/data/info.upump.jym2/databases/$BASE_NAME"
    }
}