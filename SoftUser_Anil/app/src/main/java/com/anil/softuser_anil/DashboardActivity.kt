package com.anil.softuser_anil

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.anil.softuser_anil.fragments.AboutFragment
import com.anil.softuser_anil.fragments.HomeFragment
import com.anil.softuser_anil.fragments.StudentFragment
import com.google.android.material.bottomnavigation.BottomNavigationView


class DashboardActivity : AppCompatActivity() {

    private val studentFragment = StudentFragment()
    private val homeFragment = HomeFragment()
    private val aboutFragment = AboutFragment()

    private lateinit var botmNavVw : BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        replaceFragment(homeFragment)

        botmNavVw = findViewById(R.id.bottomNav)

        botmNavVw.setOnNavigationItemSelectedListener{
            when(it.itemId) {
                R.id.iHome -> replaceFragment(homeFragment)
                R.id.iNewStudent -> replaceFragment(studentFragment)
                R.id.iAbout -> replaceFragment(aboutFragment)

            }
            true
        }
    }


    private fun replaceFragment(fragment: Fragment) {
        if (fragment != null) {
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.linearContainer, fragment)
            transaction.addToBackStack(null)
            transaction.commit()
        }
    }
}