package org.d3if4064.dessertclicker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("MainActivity", "onCreate Called")
    }
    override fun onStart() {
        super.onStart()
        Log.i("MainActivity", "onStart Called")
    }

}