package com.example.currencyconverter

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    fun onLoginClick(view: View?) {
        val Name = findViewById<EditText>(R.id.editTextName)
        val country = findViewById<EditText>(R.id.editTextCountry)
        Toast.makeText(this, "Welcome " + Name.text.toString(), Toast.LENGTH_SHORT).show()
        val intent = Intent()
        intent.setClass(this, currencyConvert::class.java)
        intent.putExtra("Name", Name.text.toString())
        intent.putExtra("Country", country.text.toString())
        startActivity(intent)
        finish()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}