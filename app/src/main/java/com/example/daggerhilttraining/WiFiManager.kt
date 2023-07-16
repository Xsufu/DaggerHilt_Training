package com.example.daggerhilttraining

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

// Класс WiFiManager зависит от WiFiSettings
@Singleton
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