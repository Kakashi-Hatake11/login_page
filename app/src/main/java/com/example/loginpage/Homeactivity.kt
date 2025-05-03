package com.example.loginpage

import android.content.Context
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home)

        val userDetails = findViewById<TextView>(R.id.UserDetails)

        val sharedPreferences = getSharedPreferences("UserDetails", Context.MODE_PRIVATE)
        val name = sharedPreferences.getString("Name", "")
        val age = sharedPreferences.getString("Age", "")
        val email = sharedPreferences.getString("Email", "")

        val details = "Name: $name\nAge: $age\nEmail: $email"
        userDetails.text = details
    }
}
