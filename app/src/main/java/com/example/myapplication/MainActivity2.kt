package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity2 : AppCompatActivity() {

    val TAG = "Main Activity 2"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        Log.d(TAG, "onCreate: ")

    }

    @Override
    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart: ")
    }

    @Override
    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume: ")
    }

    @Override
    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause: ")
    }

    @Override
    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop: ")
    }

    @Override
    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart: ")
    }

    @Override
    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy: ")
    }

}