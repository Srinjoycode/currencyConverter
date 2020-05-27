package com.example.currencyconverter

import android.content.Intent
import android.os.Bundle
import android.widget.AdapterView.OnItemClickListener
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.currencyconverter.currencyConvert

class currencyConvert : AppCompatActivity() {
    var UserCurrencySelection = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_currency_convert)
        val caller = intent
        val userName = caller.getStringExtra("Name")
        val welcome = findViewById<TextView>(R.id.welcomeText)
        welcome.text = "Welcome, $userName"
        val currency = findViewById<ListView>(R.id.currencyList)
        val currencyList = ArrayAdapter.createFromResource(this, R.array.currency, android.R.layout.simple_list_item_1)
        currency.adapter = currencyList
        currency.onItemClickListener = OnItemClickListener { parent, view, position, id ->
            val item = currencyList.getItem(position)!!
            UserCurrencySelection = item.toString()
            Toast.makeText(this@currencyConvert, "Currency  $UserCurrencySelection", Toast.LENGTH_SHORT).show()
            val intent = Intent()
            intent.setClass(view.context, answerActivity::class.java)
            intent.putExtra("currencyUser", UserCurrencySelection)
            startActivity(intent)
            finish()
        }
    }
}