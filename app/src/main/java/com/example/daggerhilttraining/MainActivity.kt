package com.example.daggerhilttraining

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.daggerhilttraining.databinding.ActivityMainBinding
import com.example.daggerhilttraining.frags.Activity2
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var wiFiManager: WiFiManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("MyLog", "MainActivity instance id: $wiFiManager")

        startActivity(Intent(this, Activity2::class.java))
    }
}