package info.upump.jym.db

import androidx.room.Database
import androidx.room.RoomDatabase
import info.upump.jym.db.dao.*
import info.upump.jym.db.entities.*
import info.upump.jym.db.repo.ExerciseRepo
import info.upump.jym.models.ExerciseDescription


@Database(
    version = 1, entities = [
        CycleEntity::class,
        WorkoutEntity::class,
        ExerciseEntity::class,
        ExerciseDescriptionEntity::class,
        SetsEntity::class]
)
abstract class RoomDB : RoomDatabase() {
    abstract fun cycleDao(): CycleDao
    abstract fun workoutDao(): WorkoutDao
    abstract fun exerciseDao(): ExerciseDao
    abstract fun exerciseDescriptionDao(): ExerciseDescriptionDao
    abstract fun setsDao(): SetsDao

    companion object {
        const val BASE_NAME = "jym.db"
        const val DB_PATH = "data/data/info.upump.jym2/databases/$BASE_NAME"
    }
}