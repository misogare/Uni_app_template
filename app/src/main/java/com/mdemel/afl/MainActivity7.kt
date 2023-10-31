package com.mdemel.afl

import SharedRepository
import SharedViewModel
import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.GridView
import android.widget.ImageView
import androidx.activity.viewModels
import androidx.fragment.app.commit
import androidx.lifecycle.ViewModelProvider
import com.mdemel.afl.models.Course
import com.mdemel.afl.models.Category

class MainActivity7 : AppCompatActivity() {
    lateinit private var navigateButton: Button
    lateinit private var icon1:ImageView
    lateinit private var icon2:ImageView
    lateinit private var icon3:ImageView
    lateinit private var icon4:ImageView
    private val viewModel: SharedViewModel by viewModels()

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main7)
        var selectedCategories = intent.getSerializableExtra("selectedCategories") as Array<Category>?
        Log.d("MainActivity7", "Selected Categories: $selectedCategories")
        viewModel.setSelectedCategories(selectedCategories)



//        val fragment = BlankFragment3()
//        fragment.selectedCategories = selectedCategories
        supportFragmentManager.commit {
            add(R.id.mago, BlankFragment3::class.java, null)
            setReorderingAllowed(true)
        }


        icon1 = findViewById<ImageView>(R.id.icon1)
        icon2 = findViewById<ImageView>(R.id.icon2)
        icon3 = findViewById<ImageView>(R.id.icon3)
        icon4 = findViewById<ImageView>(R.id.icon4)
        icon1.setOnClickListener {
            supportFragmentManager.commit {
                add(R.id.mago, BlankFragment3::class.java, null)
                setReorderingAllowed(true)
            }
        }
        icon2.setOnClickListener {
            supportFragmentManager.commit {
                add(R.id.mago, BlankFragment4::class.java, null)
                setReorderingAllowed(true)
            }
        }
        icon3.setOnClickListener {
            supportFragmentManager.commit {
                add(R.id.mago, BlankFragment5::class.java, null)
                setReorderingAllowed(true)
            }
        }
        icon4.setOnClickListener {
            supportFragmentManager.commit {
                add(R.id.mago, BlankFragment6::class.java, null)
                setReorderingAllowed(true)
            }
        }

    }
}