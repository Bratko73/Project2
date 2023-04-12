package com.example.project


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.startActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val recButton = findViewById<Button>(R.id.recButton)
        recButton.setOnClickListener {
            val intent = Intent(this, recActivity::class.java)
            startActivity(intent)
        }


        val planButton = findViewById<Button>(R.id.planButton)
        // Open new activity on button click
        planButton.setOnClickListener {
            val intent = Intent(this, planActivity::class.java)
            startActivity(intent)
        }

        val loadButton = findViewById<Button>(R.id.loadButton)
        // Open new activity on button click
        loadButton.setOnClickListener {
            val loadIntent = Intent(this, loadActivity::class.java)
            startActivity(loadIntent)
        }
    }
}

