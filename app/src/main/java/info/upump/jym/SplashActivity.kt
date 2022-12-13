package info.upump.jym

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.room.Room
import info.upump.jym.db.RoomDB


import java.io.File

const val TAG = "SplashActivity"
class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        val file = File(RoomDB.DB_PATH)
        if (!file.exists()) {
            Log.d(TAG, "file isnt exist")
            setDbFromAsset()
        }

        try {
            Thread.sleep(1000)
        } catch (e: InterruptedException) {
            Log.d("db", "ошибка")
            e.printStackTrace()
        }

        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }

    private fun setDbFromAsset() {
        Room.databaseBuilder(applicationContext, RoomDB::class.java, RoomDB.BASE_NAME)
            .createFromAsset(RoomDB.BASE_NAME)
            .build()
    }
}
