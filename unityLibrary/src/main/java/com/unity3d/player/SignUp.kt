package com.unity3d.player

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class SignUp : AppCompatActivity() {
    private lateinit var btnSignUpSU: Button
    private lateinit var btnCancelSU: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        // Register new account. Perform authentication in terms of required password length, etc...
        // After verify, log in the user and present the main menu with a logout button instead of login button.
        btnSignUpSU = findViewById(R.id.btnSignUpSU)
        // Returns to the login screen.
        btnCancelSU = findViewById(R.id.btnCancelSU)

    }

    fun buttonClick(view: View) {
        // Returns to the LoginSignUp activity screen.
        when(view) {
            btnCancelSU -> {
                finish()
            }

            // Verify information, register info, Authenticate login, then return to main menu. Login button should now be a logout button.
            btnSignUpSU -> {
                startActivity(Intent(this, MainMenuLoggedIn::class.java))
            }
        }
    }
}