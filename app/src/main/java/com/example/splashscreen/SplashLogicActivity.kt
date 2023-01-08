package com.example.splashscreen

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class SplashLogicActivity :AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_logic)

        var random = Random.nextInt()
        if (random > 100)
        {
            var intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }
        else
        {
            var intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}