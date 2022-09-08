package com.acube.ecare.ui.activity

import android.os.Bundle
import android.util.TypedValue
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.acube.ecare.R
import com.acube.ecare.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationItemView
import com.google.android.material.bottomnavigation.BottomNavigationMenuView
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView
        val navController = findNavController(R.id.fragmentContainerView)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
//        val appBarConfiguration = AppBarConfiguration(setOf(
//            R.id.nav_home, R.id.nav_Consult, R.id.nav_message, R.id.nav_more))
//        setupActionBarWithNavController(navController, appBarConfiguration)
//       navView.BottomNavigationItem(
//            //..
//            modifier =
//            Modifier.then(Modifier.weight(
//                if (selectedItem == index) 2f else 1f
//            ))
//        )
//

        navView.setupWithNavController(navController)
//        navView.setOnItemSelectedListener{
//
//            when(it.itemId){
//                R.id.homeFragment->{
//                    Log.d("TAG", "onCreate: ")
//                }
//            }
//            return@setOnItemSelectedListener true
//        }
        // Here the index: 2 at 'getChildAt(2)' means the middle icon
// Here the index: 2 at 'getChildAt(2)' means the middle icon
        val menuView = binding.navView.getChildAt(0) as BottomNavigationMenuView
        val navigationItemView = menuView.getChildAt(2) as BottomNavigationItemView
        val displayMetrics = resources.displayMetrics
        navigationItemView.setIconSize(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 50f,
            displayMetrics).toInt())
        navigationItemView.elevation = 5f
        navigationItemView.setIconTintList(null)
      //  navigationItemView.setItemBack
    }


}