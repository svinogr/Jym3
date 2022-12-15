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

}
