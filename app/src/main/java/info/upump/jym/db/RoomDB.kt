package info.upump.jym.db

import androidx.room.Database
import androidx.room.RoomDatabase
import info.upump.jym.db.dao.CycleDao
import info.upump.jym.db.dao.WorkoutDao
import info.upump.jym.db.entities.CycleEntity
import info.upump.jym.db.entities.WorkoutEntity


@Database(version = 1, entities = [CycleEntity::class, WorkoutEntity::class])
abstract class RoomDB : RoomDatabase() {
    abstract fun cycleDao() : CycleDao
    abstract fun workoutDao(): WorkoutDao

    companion object {
        const val BASE_NAME = "jym.db"
        const val DB_PATH = "data/data/info.upump.jym2/databases/$BASE_NAME"
    }
}