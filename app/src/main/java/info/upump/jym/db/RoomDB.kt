package info.upump.jym.db

import androidx.room.Database
import androidx.room.RoomDatabase
import info.upump.jym.db.entities.TestEntity


@Database(version = 1, entities = [TestEntity::class])
abstract class RoomDB : RoomDatabase() {
    companion object {
        const val BASE_NAME = "jym.db"
        const val DB_PATH = "data/data/info.upump.jym2/databases/$BASE_NAME"
    }
}