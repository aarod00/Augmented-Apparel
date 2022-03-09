package com.unity3d.player

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainMenuLoggedIn : AppCompatActivity() {
    private lateinit var btnScan: Button
    private lateinit var btnLoginSignUp: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu_logged_in)

        // Button that starts the camera view for augmentations.
        btnScan = findViewById(R.id.btnScan)
        btnScan.setOnClickListener {
            //setContentView(R.layout.activity_unityplayeractivity)
            var intent = Intent(this, UnityPlayerActivity::class.java)
            startActivity(intent)
        }

        // Button that takes user to login / Sign up screen.
        btnLoginSignUp = findViewById(R.id.btnLogout)
        btnLoginSignUp.setOnClickListener {
            //setContentView(R.layout.activity_unityplayeractivity)
            var intent = Intent(this, MainMenu::class.java)
            startActivity(intent)
        }
    }
}