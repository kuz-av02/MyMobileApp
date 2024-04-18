package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
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

        first_btn.setOnClickListener {
            // Получение текущей темы
            val currentNightMode =
                resources.configuration.uiMode and android.content.res.Configuration.UI_MODE_NIGHT_MASK

            // Изменение темы
            when (currentNightMode) {
                android.content.res.Configuration.UI_MODE_NIGHT_YES -> {
                    // Если текущая тема - темная, то установить светлую тему
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
                }

                android.content.res.Configuration.UI_MODE_NIGHT_NO -> {
                    // Если текущая тема - светлая, то установить темную тему
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
                }
            }

            // Перезагрузка активити для применения изменений
            recreate()
        }
        second_btn.setOnClickListener { startActivity(Intent(this@Profile, Language::class.java)) }
        third_btn.setOnClickListener { startActivity(Intent(this@Profile, MyImage::class.java)) }
        fourth_btn.setOnClickListener { startActivity(Intent(this@Profile, Login::class.java)) }
    }
}