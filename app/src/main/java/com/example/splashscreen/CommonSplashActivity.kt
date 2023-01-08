package com.example.splashscreen

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.HandlerThread
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.postDelayed

class CommonSplashActivity :AppCompatActivity(){
    var handler = Handler()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_common_splash)

        handler.postDelayed(3000) {
            var intent = Intent(this@CommonSplashActivity, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    override fun onDestroy() {
        handler.removeCallbacksAndMessages(null)
        super.onDestroy()
    }
}