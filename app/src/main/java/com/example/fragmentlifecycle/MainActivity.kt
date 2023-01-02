package com.example.fragmentlifecycle

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {

    var TAG = "TAG"
    private lateinit var fragmentManager: FragmentManager
    private lateinit var fragmentTransaction: FragmentTransaction

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "onCreate() Activity")
        addFragmentA()
    }

    private fun addFragmentA() {
        val fragment = FragmentA.newInstance()
        fragmentManager = supportFragmentManager
        fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.frameContainer, fragment, "Fragment_A")
        fragmentTransaction.addToBackStack("Fragment_A")
        fragmentTransaction.commit()
    }

    fun fragmentB() {
        val fragment = FragmentB.newInstance()
        fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.frameContainer, fragment, "Fragment_B")
        fragmentTransaction.addToBackStack("Fragment_B")
        fragmentTransaction.commit()
    }

    fun fragmentC() {
        val fragment = FragmentC.newInstance()
        fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.frameContainer, fragment, "Fragment_C")
        fragmentTransaction.addToBackStack("Fragment_C")
        fragmentTransaction.commit()
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart() Activity")
    }

    override fun onAttachFragment(fragment: Fragment) {
        super.onAttachFragment(fragment)
        Log.d(TAG, "onAttachFragment() Activity")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume() Activity")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause() Activity")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart() Activity")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop() Activity")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy() Activity")
    }

}