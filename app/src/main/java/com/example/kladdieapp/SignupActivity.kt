package com.example.kladdieapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.text.TextUtils.isEmpty
import android.view.View
import android.view.WindowManager
import android.widget.*

class SignupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        //        hide status bar
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        val logon: TextView = findViewById(R.id.already_user)
        logon.setOnClickListener {
            val login = Intent(this, LoginActivity::class.java)
            startActivity(login)
        }

        val fullname : EditText = findViewById(R.id.fullName)
        val useremail : EditText = findViewById(R.id.userEmailId)
        val mobilenumber : EditText = findViewById(R.id.mobileNumber)
        val location : EditText = findViewById(R.id.location)
        val password : EditText = findViewById(R.id.password)
        val confirmpassowrd : EditText = findViewById(R.id.confirmPassword)
        val terms : CheckBox = findViewById(R.id.terms_conditions)


        val signupbtn : Button = findViewById(R.id.signUpBtn)
        signupbtn.setOnClickListener {
            if(fullname==null or useremail==null or mobilenumber == null or location == null or password == null or confirmpassowrd == null){
                Toast.makeText(this, "Please fill in all the details", Toast.LENGTH_SHORT).show()
            }else{

            }
        }

    }
}