package com.unity3d.player

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class LoginSignUp : AppCompatActivity() {
    private lateinit var btnBackLSU: ImageButton
    private lateinit var btnSignUp: Button
    private lateinit var btnLogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_sign_up)

        // Return to previous menu button
        btnBackLSU = findViewById(R.id.btnBackLSU)
        btnBackLSU.setOnClickListener {
            onBackPressed()
        }

        // Go to registration screen
        btnSignUp = findViewById(R.id.btnSignUp)
        btnSignUp.setOnClickListener {
            var intent = Intent(this, SignUp::class.java)
            startActivity(intent)
        }

        // Authenticate login, then return to main menu. Login button should now be a logout button.
        btnLogin = findViewById(R.id.btnLogin)
        btnLogin.setOnClickListener {
            var intent = Intent(this, MainMenuLoggedIn::class.java)
            startActivity(intent)
        }
    }
}