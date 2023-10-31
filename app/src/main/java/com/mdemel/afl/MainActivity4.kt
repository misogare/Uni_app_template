package com.mdemel.afl

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.GridView
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.commit
import com.mdemel.afl.models.Course
import com.mdemel.afl.models.Category

class MainActivity4 : AppCompatActivity() {
    lateinit private var navigateButton: Button
    lateinit private  var textv : TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main1)
        var intentToNavigateTothirds = Intent(this, MainActivity3::class.java)


        navigateButton = findViewById(R.id.button)
        textv = findViewById(R.id.textView6)


        navigateButton.setOnClickListener {
            startActivity(intentToNavigateTothirds)
        }
         var intentToNavigateTothirds1 = Intent(this,MainActivity5::class.java)
textv.setOnClickListener {
    startActivity(intentToNavigateTothirds1)
}

    }
}