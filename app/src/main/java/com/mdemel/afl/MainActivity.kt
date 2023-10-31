package com.mdemel.afl

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.GridView
import android.widget.ImageView
import androidx.fragment.app.commit



class MainActivity : AppCompatActivity() {
    lateinit private var navigateButton: Button


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val intentToNavigateToInfoScreen = Intent(this, MainActivity4::class.java)

        navigateButton = findViewById(R.id.mainButton)

        navigateButton.setOnClickListener {
            startActivity(intentToNavigateToInfoScreen)
        }


    }
}