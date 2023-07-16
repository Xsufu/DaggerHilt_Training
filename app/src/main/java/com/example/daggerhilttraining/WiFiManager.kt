package com.example.daggerhilttraining

import android.util.Log
import dagger.hilt.android.scopes.ActivityRetainedScoped
import javax.inject.Inject
import javax.inject.Singleton

/* Класс WiFiManager зависит от WiFiSettings */
/* С аннотацией Singleton доступ к одной инстанции класса осуществляется во всём приложении */

/* ActivityRetainedScoped даёт доступ к одной инстанции
   при изменении конфигурации и возможность поделиться с ViewModel в пределах одной Activity */

@Singleton
//@ActivityRetainedScoped
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