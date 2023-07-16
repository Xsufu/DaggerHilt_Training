package com.example.daggerhilttraining

import android.util.Log
import javax.inject.Inject

// Класс WiFiManager зависит от WiFiSettings
class WiFiManager @Inject constructor(private val settings: WiFiSettings) {
    fun connect() {
        settings.openConnection()
    }

    fun sendMessage() {
        settings.writeBytes()
    }
}

class WiFiSettings @Inject constructor() {
    fun openConnection() {
        Log.d("MyLog", "Connection opened")
    }

    fun writeBytes() {
        /* Do something */
        Log.d("MyLog", "Bytes written")
    }
}