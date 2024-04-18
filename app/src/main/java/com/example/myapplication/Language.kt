package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Language : AppCompatActivity() {
    private lateinit var buttonRus: Button
    private lateinit var buttonEng: Button
    private lateinit var buttonChoose: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.language)


        buttonRus = findViewById(R.id.russianbtn)
        buttonEng = findViewById(R.id.englishbtn)
        buttonChoose = findViewById(R.id.choosebtn)

        buttonRus.setOnClickListener {
            buttonRus.backgroundTintList = getColorStateList(R.color.language_background_true)
            buttonEng.backgroundTintList = getColorStateList(R.color.language_background)
        }

        buttonEng.setOnClickListener {
            buttonRus.backgroundTintList = getColorStateList(R.color.language_background)
            buttonEng.backgroundTintList = getColorStateList(R.color.language_background_true)
        }

        buttonChoose.setOnClickListener { startActivity(Intent(this@Language, Login::class.java)) }
    }


}