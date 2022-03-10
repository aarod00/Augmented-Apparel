package com.unity3d.player

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainMenuLoggedIn : AppCompatActivity() {
    private lateinit var btnScan: Button
    private lateinit var btnLogout: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu_logged_in)

        // Set buttons with respective ids.
        btnScan = findViewById(R.id.btnScan)
        btnLogout = findViewById(R.id.btnLogout)
    }

    // Button listeners for each button.
    fun buttonClick(view: View) {
        when(view) {
            // Opens augmentation camera.
            btnScan -> {
                startActivity(Intent(this, UnityPlayerActivity::class.java))
            }

            // Opens the MainMenu activity. "Logout" the user.
            btnLogout -> {
                startActivity(Intent(this, MainMenu::class.java))
            }
        }
    }
}