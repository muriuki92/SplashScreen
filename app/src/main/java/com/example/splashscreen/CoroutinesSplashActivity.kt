package com.example.splashscreen

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.*

class CoroutinesSplashActivity :AppCompatActivity() {
    val activityScope = CoroutineScope(Dispatchers.Main)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coroutines_splash)

        activityScope.launch {
            delay(3000)

            var intent = Intent(this@CoroutinesSplashActivity, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    override fun onPause() {
        activityScope.cancel()
        super.onPause()
    }
}