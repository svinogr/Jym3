package info.upump.jym

import android.os.Bundle
import android.util.Log
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import info.upump.jym.databinding.ActivityMainBinding
import info.upump.jym.db.entities.CycleEntity
import info.upump.jym.db.repo.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)

        val item = CycleEntity(0)


        // get.save(item)

        lifecycleScope.launch(Dispatchers.IO) {
            val get = CycleRepo.get()
            val list = get.getAll()
            Log.d("TAG", "${list.size}")
            /*   for (it in list) {
                   Log.d("TAG", "${it.comment}")

               }
   */
            val w = WorkoutRepo.get()
            val list2 = w.getAll()
            Log.d("TAG", "${list2.size}")
            for (it in list2) {
       //         Log.d("TAG", "${it.comment}")


            }

            val e = ExerciseRepo.get()
            val list3 = e.getAll()

            Log.d("TAG", "${list3.size}")
            for (it in list3) {
            //    Log.d("TAG", "${it.title}")

            }

            val r = ExerciseDescriptionRepo.get()
            val list4 = r.getAll()

            Log.d("TAG", "${list4.size}")
            for (it in list4) {
                Log.d("TAG", "${it.title}")
            }

            val t = SetsRepo.get()
            val list5 = t.getAll()

            Log.d("TAG", "${list5.size}")
            for (it in list5) {
                Log.d("TAG", "${it.reps}")
            }
        }
    }
}