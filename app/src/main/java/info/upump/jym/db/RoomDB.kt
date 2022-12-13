package info.upump.jym.db

import androidx.room.Database
import androidx.room.RoomDatabase


@Database(version = 1, entities = [])
abstract class RoomDB : RoomDatabase() {
    companion object {
        const val BASE_NAME = "jym.db"
        const val DB_PATH = "data/data/info.upump.jym2/databases/$BASE_NAME"
    }
}