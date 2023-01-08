package com.example.splashscreen

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class SplashThemeActivity :AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.AppTheme)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_theme)
    }
}