package com.example.daggerhilttraining

import android.util.Log

// Класс WiFiManager зависит от WiFiSettings
class WiFiManager(private val settings: WiFiSettings) {
    fun connect() {
        settings.openConnection()
    }

    fun sendMessage() {
        settings.writeBytes()
    }
}

class WiFiSettings {
    fun openConnection() {
        Log.d("MyLog", "Connection opened")
    }

    fun writeBytes() {
        /* Do something */
        Log.d("MyLog", "Bytes written")
    }
}