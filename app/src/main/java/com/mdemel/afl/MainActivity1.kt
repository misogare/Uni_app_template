//package com.mdemel.afl
//
//import android.annotation.SuppressLint
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import android.util.Log
//import android.widget.Button
//import android.widget.GridView
//import android.widget.ImageView
//import androidx.recyclerview.widget.LinearLayoutManager
//import androidx.recyclerview.widget.RecyclerView
//import com.mdemel.afl.components.CategoryAdapter1
//import com.mdemel.afl.models.Course
//import com.mdemel.afl.models.Category
//
//class MainActivity1 : AppCompatActivity() {
//
//
//    @SuppressLint("MissingInflatedId")
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main5)
//        val mathCourses = listOf(Course("Geometry"), Course("Algebra"), Course("Calculus"))
//        val econCourses = listOf(Course("Accounting"), Course("Economics"), Course("Finance"))
//        val categories = listOf(Category("Mathematics", mathCourses,R.drawable.logo2), Category("Economics", econCourses,R.drawable.logo))
//        val recyclerView = findViewById<RecyclerView>(R.id.gridView1)
//        val adapter = CategoryAdapter1(this, categories)
//        recyclerView.adapter = adapter
//
//
//
//
//    }
//}