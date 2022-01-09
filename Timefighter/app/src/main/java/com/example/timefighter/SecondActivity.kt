package com.example.timefighter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val dataReceived: TextView = findViewById(R.id.dataReceived)  // making a textView
        val first:String = intent?.extras?.getString("firstname").toString()
        val last:String = intent?.extras?.getString("lastname").toString()
        dataReceived.text = "Hello! ${first} ${last}"    // passing value from intent to textView
    }
}