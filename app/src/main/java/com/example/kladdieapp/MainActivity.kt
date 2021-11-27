package com.example.kladdieapp

import android.content.Intent
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        //        hide status bar'
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this, "Kladdie Worldwide Welcomes You!", Toast.LENGTH_SHORT).show()

        val loginbtn: Button = findViewById(R.id.btn_welogin)
        loginbtn.setOnClickListener {
        val login = Intent(this, LoginActivity::class.java)
            startActivity(login)
        }

        val signupbtn: Button = findViewById(R.id.wel_signup)
        signupbtn.setOnClickListener {
            val signup = Intent(this, SignupActivity::class.java)
            startActivity(signup)
        }

    }
}