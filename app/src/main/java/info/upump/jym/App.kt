package info.upump.jym

import android.app.Application
import info.upump.jym.db.repo.CycleRepo

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        CycleRepo.initialize(applicationContext)
    }
}