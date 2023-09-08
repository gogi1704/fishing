package com.fishing.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.NavHostFragment
import com.fishing.R
import com.fishing.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var container: View
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val navFragment = supportFragmentManager.findFragmentById(R.id.nav_container) as NavHostFragment

        val navController = navFragment.navController

        binding.bottomNavigation.setOnItemSelectedListener {
            when(it.itemId){
                R.id.equipment->{

                }
                R.id.book->{

                }
            }

            true
        }


        setContentView(binding.root)
    }


}