package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.text.Layout
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.LinearLayout.LayoutParams
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintSet
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val avatar =findViewById<ImageView>(R.id.avatar)
        avatar.setOnClickListener { startActivity(Intent(this@MainActivity, Profile::class.java)) }
        val first_game =findViewById<LinearLayout>(R.id.first_game)
        first_game.setOnClickListener { startActivity(Intent(this@MainActivity, Game_one::class.java)) }
        val second_game =findViewById<LinearLayout>(R.id.second_game)
        second_game.setOnClickListener { startActivity(Intent(this@MainActivity, Game_two::class.java)) }
        val third_game =findViewById<LinearLayout>(R.id.third_game)
        third_game.setOnClickListener { startActivity(Intent(this@MainActivity, Game_three::class.java)) }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}