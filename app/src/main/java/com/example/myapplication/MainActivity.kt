package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.myapplication.FragmentActivity3

class MainActivity : AppCompatActivity() {
    val TAG = "Main Activity 1"

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.buttonFragment1.setOnClickListener{
            goToFragment(Fragment1())
        }

        binding.buttonFragment2.setOnClickListener {
            goToFragment(Fragment2())
        }
    

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "onCreate: ")

        val button: Button = findViewById(R.id.button)
        button.setOnClickListener(View.OnClickListener { startActivity(Intent(this, MainActivity2::class.java)) })
    }

//        binding.button2.setOnClickListener {
//        startActivity(Intent(this, FragmentActivity3::class.java))
//        }

    private fun goToFragment(fragment: Fragment){
        fragmentManager = supportFragmentManager
        fragmentManager.beginTransaction().replace(R.id.fragmentContainer, fragment).commit()
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

class Fragment1 : Fragment() {

}

class Fragment2 : Fragment() {
    

}
