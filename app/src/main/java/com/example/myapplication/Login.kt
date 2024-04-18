package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)
        val stealthy_button =findViewById<Button>(R.id.stealthy_button)
        stealthy_button.setOnClickListener { startActivity(Intent(this@Login, MainActivity::class.java)) }
        val text_link =findViewById<TextView>(R.id.deceptive_link)
        text_link.setOnClickListener { startActivity(Intent(this@Login, Signup1::class.java)) }
        val comeback =findViewById<ImageButton>(R.id.confusing_button)
        comeback.setOnClickListener { startActivity(Intent(this@Login, Language::class.java)) }
    }
}