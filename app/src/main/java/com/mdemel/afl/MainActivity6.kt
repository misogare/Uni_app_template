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
import com.mdemel.afl.models.Course
import com.mdemel.afl.models.Category

class MainActivity6 : AppCompatActivity() {
    lateinit private var navigateButton: Button


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        val intentToNavigateTothirds = Intent(this, MainActivity4::class.java)

        navigateButton = findViewById(R.id.perd)

        navigateButton.setOnClickListener {
            startActivity(intentToNavigateTothirds)
        }


    }
}