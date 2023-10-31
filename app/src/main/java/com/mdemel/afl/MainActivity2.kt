//package com.mdemel.afl
//
//import android.annotation.SuppressLint
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import android.util.Log
//import android.widget.Button
//import android.widget.GridView
//import android.widget.ImageView
//import androidx.fragment.app.commit
//import com.mdemel.afl.components.CategoryAdapter
//import com.mdemel.afl.models.Course
//import com.mdemel.afl.models.Category
//
//class MainActivity2 : AppCompatActivity() {
//
//
//    @SuppressLint("MissingInflatedId")
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main4)
//        val mathCourses = listOf(Course("Geometry"), Course("Algebra"), Course("Calculus"))
//        val econCourses = listOf(Course("Accounting"), Course("Economics"), Course("Finance"))
//        val categories = listOf(Category("Mathematics", mathCourses,R.drawable.logo2), Category("Economics", econCourses,R.drawable.logo))
//       // val gridView = findViewById<GridView>(R.id.gridView)
//        val adapter = CategoryAdapter(this, categories)
//       // gridView.adapter = adapter
//        supportFragmentManager.commit {
//            add(R.id.fragment_container_view, BlankFragment::class.java, null)
//            setReorderingAllowed(true)
//            addToBackStack("home") // Name can be null
//        }
//
//
//
//    }
//}