package com.mdemel.afl

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.mdemel.afl.components.CategoryAdapter3
import com.mdemel.afl.models.DataRepository

class MainActivity8 : AppCompatActivity() {

//    private val recyclerView: RecyclerView by lazy {
//        findViewById(R.id.sam2)
//    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main10)

//    val courses = DataRepository().initializeMathCourses() + DataRepository().initializeEconCourses()
//    val recyclerView = findViewById<RecyclerView>(R.id.sam2)
//    val adapter = CategoryAdapter3(this, courses)
//
//    recyclerView?.adapter = adapter
    val courses = DataRepository().initializeMathCourses() + DataRepository().initializeEconCourses()

    val recyclerView = findViewById<RecyclerView>(R.id.sam2)
    val adapter = CategoryAdapter3(this,courses)
    recyclerView?.adapter = adapter
    adapter.notifyDataSetChanged()
//    }
}
}