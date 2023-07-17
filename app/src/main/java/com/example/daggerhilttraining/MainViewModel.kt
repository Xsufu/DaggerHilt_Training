package com.example.daggerhilttraining

import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val thirdPartyClass: ThirdPartyClass
): ViewModel(){

    init {
        Log.d("MyLog", "ViewModel instance id: $thirdPartyClass")
    }

    fun writer() {
        thirdPartyClass.writer()
    }
}