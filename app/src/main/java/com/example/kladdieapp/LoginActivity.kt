package com.example.kladdieapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        //        hide status bar
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_acivity)

        val crt_acc: TextView = findViewById(R.id.createAccount)
        crt_acc.setOnClickListener {
            val crtacc = Intent(this, SignupActivity::class.java)
            startActivity(crtacc)
        }



    }
}