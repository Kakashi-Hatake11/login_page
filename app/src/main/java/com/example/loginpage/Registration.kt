package com.example.loginpage

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class Registration : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.registration)

        val etName = findViewById<EditText>(R.id.etName)
        val etAge = findViewById<EditText>(R.id.etAge)
        val etEmail = findViewById<EditText>(R.id.etEmail)
        val etPassword = findViewById<EditText>(R.id.etPassword)
        val btnSave = findViewById<Button>(R.id.btnSave)

        btnSave.setOnClickListener {
            val name = etName.text.toString()
            val age = etAge.text.toString()
            val email = etEmail.text.toString()
            val password = etPassword.text.toString()

            val sharedPreferences = getSharedPreferences("UserDetails", Context.MODE_PRIVATE)
            sharedPreferences.edit().apply {
                putString("Name", name)
                putString("Age", age)
                putString("Email", email)
                putString("Password", password)
                apply()
            }

            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}
