package com.example.daggerhilttraining

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    private lateinit var wiFiManager: WiFiManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val settings = WiFiSettings()

        wiFiManager = WiFiManager(settings)

        wiFiManager.connect()
        wiFiManager.sendMessage()
    }
}