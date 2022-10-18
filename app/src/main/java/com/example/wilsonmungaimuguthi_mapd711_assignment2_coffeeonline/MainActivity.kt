package com.example.wilsonmungaimuguthi_mapd711_assignment2_coffeeonline

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Get started button//
        val buttonClick = findViewById<Button>(R.id.get_started_btn)
        buttonClick.setOnClickListener {
            val intent = Intent(this, Order::class.java)
            startActivity(intent)

        }
    }
}