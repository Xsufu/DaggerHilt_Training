package com.example.daggerhilttraining

import android.util.Log

class ThirdPartyClass (private val basicClass: BasicTPClass){
    fun writer() {
        basicClass.writeLog()
    }
}

class BasicTPClass {
    fun writeLog() {
        Log.d("MyLog", "Log are written")
    }
}