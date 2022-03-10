package com.unity3d.player

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton

class LoginSignUp : AppCompatActivity() {
    private lateinit var btnBackLSU: ImageButton
    private lateinit var btnSignUp: Button
    private lateinit var btnLogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_sign_up)

        // Set buttons with respective ids.
        btnBackLSU = findViewById(R.id.btnBackLSU)
        btnSignUp = findViewById(R.id.btnSignUp)
        btnLogin = findViewById(R.id.btnLogin)
    }

    fun buttonClick(view: View) {
        // Returns to the LoginSignUp activity screen.
        when(view) {
            btnBackLSU -> {
                onBackPressed()
            }

            // Verify information, register info, Authenticate login, then return to main menu. Login button should now be a logout button.
            btnSignUp -> {
                startActivity(Intent(this, SignUp::class.java))
            }

            // Authenticate login, then return to main menu. Login button should now be a logout button.
            btnLogin -> {
                startActivity( Intent(this, MainMenuLoggedIn::class.java))
            }
        }
    }
}