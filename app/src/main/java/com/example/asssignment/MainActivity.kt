package com.example.asssignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentTransaction
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_home.*

class MainActivity : AppCompatActivity() {

    lateinit var homeFragment: HomeFragment
    lateinit var libraryFragment: LibraryFragment
    lateinit var quizFragment: QuizFragment
    lateinit var notificationFragment: NotificationFragment
    lateinit var profileFragment: ProfileFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNav1:BottomNavigationView = findViewById(R.id.btmNav)

        homeFragment= HomeFragment()
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.container1,homeFragment)
            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
            .commit()


        bottomNav1.setOnNavigationItemSelectedListener { item ->

            when(item.itemId){

                R.id.home ->{
                    homeFragment= HomeFragment()
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.container1,homeFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit()
                }
                R.id.library ->{
                    libraryFragment=LibraryFragment()
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.container1,libraryFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit()
                }
                R.id.quiz ->{
                    quizFragment= QuizFragment()
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.container1,quizFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit()
                }
                R.id.notification ->{
                    notificationFragment= NotificationFragment()
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.container1,notificationFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit()
                }
                R.id.profile ->{
                    profileFragment=ProfileFragment()
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.container1,profileFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit()
                }

            }
            true
        }


    }


}
