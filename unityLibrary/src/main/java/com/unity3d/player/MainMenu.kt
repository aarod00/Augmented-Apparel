package com.unity3d.player

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainMenu : AppCompatActivity() {
    private lateinit var btnScan: Button
    private lateinit var btnLoginSignUp: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)

        // Set button to respective ids.
        btnScan = findViewById(R.id.btnScan)
        btnLoginSignUp = findViewById(R.id.btnLoginSignUp)

    }

    // Button listeners for each button.
    fun buttonClick(view: View) {
        when(view) {
            // Open augmentation camera.
            btnScan -> {
                startActivity(Intent(this, UnityPlayerActivity::class.java))}
            // Open login/sign up activity.
            btnLoginSignUp -> {
                startActivity(Intent(this, LoginSignUp::class.java))
            }
        }
    }
}