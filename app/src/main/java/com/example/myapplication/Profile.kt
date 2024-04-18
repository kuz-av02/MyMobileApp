package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profile)
        val first_btn =findViewById<Button>(R.id.switch_theme)
        val second_btn =findViewById<Button>(R.id.change_language)
        val third_btn =findViewById<Button>(R.id.change_image)
        val fourth_btn =findViewById<Button>(R.id.Logout)
        first_btn.setOnClickListener { startActivity(Intent(this@Profile, MainActivity::class.java)) }
        second_btn.setOnClickListener { startActivity(Intent(this@Profile, Language::class.java)) }
        third_btn.setOnClickListener { startActivity(Intent(this@Profile, MyImage::class.java)) }
        fourth_btn.setOnClickListener { startActivity(Intent(this@Profile, Login::class.java)) }
    }
}