package com.mdemel.afl

import android.content.Intent
import androidx.fragment.app.viewModels
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView

class BlankFragment6 : Fragment() {
    lateinit private var input: Button
    lateinit private var input1: Button
    lateinit private var input2: Button
    lateinit private var input3: Button

    companion object {
        fun newInstance() = BlankFragment6()
    }

    private val viewModel: BlankViewModel6 by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // TODO: Use the ViewModel
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.activity_main15, container, false)

        input = view.findViewById(R.id.kr)
        input1 = view.findViewById(R.id.kr1)
        input2 = view.findViewById(R.id.kr2)
        input3 = view.findViewById(R.id.kr3)
        input.setOnClickListener{
            val bingo = Intent(activity,MainActivity11::class.java)
            startActivity(bingo)
        }
        input1.setOnClickListener{
            val bingo1 = Intent(activity,MainActivity12::class.java)
            startActivity(bingo1)
        }
        input2.setOnClickListener{
            val bingo2 = Intent(activity,MainActivity13::class.java)
            startActivity(bingo2)
        }
        input3.setOnClickListener{
            val bingo3 = Intent(activity,MainActivity14::class.java)
            startActivity(bingo3)
        }
        return view
    }
    }
