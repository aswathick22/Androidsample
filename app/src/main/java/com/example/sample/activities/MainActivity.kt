package com.example.sample.activities

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.sample.R
import com.example.sample.retrofit.MyViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var navController: NavController
    private val mainViewModel by viewModels<MyViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.navController
        setupActionBarWithNavController(navController)

        mainViewModel.harryPotterData.observe(this){listOfWizard ->
            listOfWizard.forEach{
                println("Name of the wizard is ${it.firstName}")
            }
        }
        mainViewModel.houseData.observe(this){listOfHouses ->
            listOfHouses.forEach{
                println("Name of the house is ${it.name}")
            }
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp() || super.onSupportNavigateUp()
    }

}