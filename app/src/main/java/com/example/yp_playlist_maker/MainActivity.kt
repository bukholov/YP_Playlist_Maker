package com.example.yp_playlist_maker

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonSearch = findViewById<Button>(R.id.button_search)
        buttonSearch.setOnClickListener{startActivity(Intent(this, SearchActivity::class.java)) }

        val buttonMedia = findViewById<Button>(R.id.button_media)
        buttonMedia.setOnClickListener { startActivity(Intent(this, MediaActivity::class.java))}

        val buttonSettings = findViewById<Button>(R.id.button_settings)
        buttonSettings.setOnClickListener{startActivity(Intent(this, SettingsActivity::class.java)) }

        val sharedPrefs = getSharedPreferences(THEME_PREFERENCES, MODE_PRIVATE)
        val themeIsDark = sharedPrefs.getBoolean(THEME_TEXT, false)
        if (themeIsDark) { AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES) }
        else { AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO) }
    }


}