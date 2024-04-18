package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Game_two : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.game_two)

        val first_btn =findViewById<Button>(R.id.first_btn)
        val second_btn =findViewById<Button>(R.id.second_btn)
        val third_btn =findViewById<Button>(R.id.third_btn)
        val fourth_btn =findViewById<Button>(R.id.fourth_btn)
        val check =findViewById<Button>(R.id.check)
        val next =findViewById<Button>(R.id.next)
        check.setOnClickListener {
            check.visibility=View.GONE
            next.visibility=View.VISIBLE
            second_btn.backgroundTintList = getColorStateList(R.color.green)
            if (first_btn.backgroundTintList == getColorStateList(R.color.bluee)) {
                first_btn.backgroundTintList == getColorStateList(R.color.language_background_true)
            }
            if (third_btn.backgroundTintList == getColorStateList(R.color.bluee)) {
                third_btn.backgroundTintList == getColorStateList(R.color.language_background_true)
            }
            if (fourth_btn.backgroundTintList == getColorStateList(R.color.bluee)) {
                fourth_btn.backgroundTintList == getColorStateList(R.color.language_background_true)
            }
        }
        next.setOnClickListener {
            startActivity(Intent(this@Game_two, MainActivity::class.java))
        }

        first_btn.setOnClickListener {
            if (next.visibility!=View.VISIBLE){
                first_btn.backgroundTintList = getColorStateList(R.color.bluee)
                second_btn.backgroundTintList = getColorStateList(R.color.button_background)
                third_btn.backgroundTintList = getColorStateList(R.color.button_background)
                fourth_btn.backgroundTintList = getColorStateList(R.color.button_background)
            }
        }
        second_btn.setOnClickListener {
            if (next.visibility!=View.VISIBLE){
                first_btn.backgroundTintList = getColorStateList(R.color.button_background)
                second_btn.backgroundTintList = getColorStateList(R.color.bluee)
                third_btn.backgroundTintList = getColorStateList(R.color.button_background)
                fourth_btn.backgroundTintList = getColorStateList(R.color.button_background)
            }
        }
        third_btn.setOnClickListener {
            if (next.visibility!=View.VISIBLE){
                first_btn.backgroundTintList = getColorStateList(R.color.button_background)
                second_btn.backgroundTintList = getColorStateList(R.color.button_background)
                third_btn.backgroundTintList = getColorStateList(R.color.bluee)
                fourth_btn.backgroundTintList = getColorStateList(R.color.button_background)
            }
        }
        fourth_btn.setOnClickListener {
            if (next.visibility!=View.VISIBLE) {
                first_btn.backgroundTintList = getColorStateList(R.color.button_background)
                second_btn.backgroundTintList = getColorStateList(R.color.button_background)
                third_btn.backgroundTintList = getColorStateList(R.color.button_background)
                fourth_btn.backgroundTintList = getColorStateList(R.color.bluee)
            }
        }

        val comeback =findViewById<ImageButton>(R.id.back)
        comeback.setOnClickListener { startActivity(Intent(this@Game_two, MainActivity::class.java)) }
    }
}