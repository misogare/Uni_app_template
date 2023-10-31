package com.mdemel.afl

import androidx.fragment.app.viewModels
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.content.Intent
import androidx.recyclerview.widget.RecyclerView
import com.mdemel.afl.models.DataRepository
import com.google.android.material.textfield.TextInputEditText
import com.mdemel.afl.components.CategoryAdapter3


class BlankFragment4 : Fragment() {
    lateinit private var input: TextInputEditText
    companion object {
        fun newInstance() = BlankFragment4()
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // TODO: Use the ViewModel
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.activity_main9, container, false)



        input = view.findViewById(R.id.categoryImageView)
        input.setOnClickListener{
            val bingo = Intent(activity,MainActivity8::class.java)
        startActivity(bingo)
     }
    return view
    }
}