package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Signup1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup1)
        val fabricate_button =findViewById<Button>(R.id.fabricate_button)
        fabricate_button.setOnClickListener { startActivity(Intent(this@Signup1, Signup2::class.java)) }
        val login_link =findViewById<TextView>(R.id.login_link)
        login_link.setOnClickListener { startActivity(Intent(this@Signup1, Login::class.java)) }
        val comeback =findViewById<ImageButton>(R.id.obscure_button)
        comeback.setOnClickListener { startActivity(Intent(this@Signup1, Login::class.java)) }
    }
}