package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Signup2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup2)
        val registration_button =findViewById<Button>(R.id.registration_button)
        registration_button.setOnClickListener { startActivity(Intent(this@Signup2, Signup2::class.java)) }
        val login_link =findViewById<TextView>(R.id.sign_in_link)
        login_link.setOnClickListener { startActivity(Intent(this@Signup2, Login::class.java)) }
        val comeback =findViewById<ImageButton>(R.id.reverse)
        comeback.setOnClickListener { startActivity(Intent(this@Signup2, Signup1::class.java)) }
    }
}