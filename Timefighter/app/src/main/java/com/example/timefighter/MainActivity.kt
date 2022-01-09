package com.example.timefighter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

//1
class MainActivity : AppCompatActivity() {
    //2
    override fun onCreate(savedInstanceState: Bundle?) {
        //3
        super.onCreate(savedInstanceState)
        //4
        setContentView(R.layout.activity_main)

        val firstName:EditText = findViewById(R.id.firstName)    // get Id of the textView
        val lastName:EditText = findViewById(R.id.lastName)
        val btn:Button = findViewById(R.id.tap_me_button)  // get Id of Button

        btn.setOnClickListener {
            // Intent
            val intent= Intent(
                this,
                SecondActivity::class.java
            )
            // passing value in intent
            intent.putExtra("firstname", firstName.text.toString())
            intent.putExtra("lastname",lastName.text.toString())
            startActivity(intent)
        }
    }
}