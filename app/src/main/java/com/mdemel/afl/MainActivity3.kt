package com.mdemel.afl

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.mdemel.afl.models.DataRepository
import androidx.recyclerview.widget.RecyclerView
import com.mdemel.afl.components.CategoryAdapter1

class MainActivity3 : AppCompatActivity() {

    lateinit private var navigateButton: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)


//        val categories = DataRepository().initializeCategories()
//
//
//        val recyclerView = findViewById<RecyclerView>(R.id.gridView1)
//
//        val adapter = CategoryAdapter1(this,categories)
//
//
//        recyclerView?.adapter = adapter
//        adapter.notifyDataSetChanged()
        val intentToNavigateTothirds = Intent(this, MainActivity7::class.java)

        navigateButton = findViewById(R.id.dad)

        navigateButton.setOnClickListener {
//            intentToNavigateTothirds.putExtra("selectedCategories", adapter.getSelectedCategories().toTypedArray())

            startActivity(intentToNavigateTothirds)
        }







    }
}