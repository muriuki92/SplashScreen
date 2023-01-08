package com.example.splashscreen

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import java.util.*
import kotlin.concurrent.schedule

class TimerSplashActivity :AppCompatActivity() {
    var timer = Timer()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_timer_splash)

        timer.schedule(3000) {
            var intent = Intent(this@TimerSplashActivity, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    override fun onPause() {
        timer.cancel()
        super.onPause()
    }
}