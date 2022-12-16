package info.upump.jym

import android.app.Application
import info.upump.jym.db.repo.CycleRepo
import info.upump.jym.db.repo.WorkoutRepo

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        WorkoutRepo.initialize(applicationContext)
        CycleRepo.initialize(applicationContext)
    }
}