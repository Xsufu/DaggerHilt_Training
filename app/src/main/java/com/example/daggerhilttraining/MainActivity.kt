package com.example.daggerhilttraining

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import com.example.daggerhilttraining.databinding.ActivityMainBinding
import com.example.daggerhilttraining.frags.Activity2
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var wiFiManager: WiFiManager

    @Inject
    lateinit var thirdPartyClass: ThirdPartyClass
    val mainViewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("MyLog", "MainActivity instance id: $wiFiManager")
        Log.d("MyLog", "MainActivity ThirdPartyClass id: $thirdPartyClass")

        mainViewModel.writer()

        startActivity(Intent(this, Activity2::class.java))
    }
}