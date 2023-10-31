package com.mdemel.afl

import SharedViewModel
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.RecyclerView

import com.mdemel.afl.components.CategoryAdapter2

import com.mdemel.afl.models.DataRepository

class BlankFragment3 : Fragment() {

    private val viewModel: SharedViewModel by viewModels()
    private var dataRepository = DataRepository()
    lateinit private var input: ImageView
//    private val categoryAdapter: CategoryAdapter2 by lazy {
//        CategoryAdapter2(this, (viewModel.selectedCategories?.value ?: emptyList()).toList())
//    }
//    private lateinit var viewModel: BlankViewModel3

//    private val viewModel by lazy {
//
//    ViewModelProvider(this).get(SharedViewModel:class.java)
//    }



//    companion object {
//        fun newInstance(selectedCategories: List<Category>) = BlankFragment3().apply {
//            this.selectedCategories = selectedCategories
//        }
//    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.activity_main8, container, false)

//        viewModel.getSelectedCategories().observe(viewLifecycleOwner) { selectedCategories ->
//            // Render the selected categories in the RecyclerView
//            val recyclerView = view.findViewById<RecyclerView>(R.id.gridView2)
//            val adapter = CategoryAdapter2(this, selectedCategories)
//            recyclerView.adapter = adapter
//            adapter.notifyDataSetChanged()
//        }


        input = view.findViewById(R.id.notif)
        input.setOnClickListener{
            val bingo = Intent(activity,MainActivity10::class.java)
            startActivity(bingo)
        }
        return view
    }
}



