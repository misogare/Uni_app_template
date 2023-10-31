package com.mdemel.afl

import android.content.Intent
import androidx.fragment.app.viewModels
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class BlankFragment5 : Fragment() {
    lateinit private var rer: Button

    companion object {
        fun newInstance() = BlankFragment5()
    }

    private val viewModel: BlankViewModel5 by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // TODO: Use the ViewModel
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.activity_main12, container, false)

        rer = view.findViewById(R.id.mace)
        rer.setOnClickListener{
            val bingo = Intent(activity,MainActivity8::class.java)
            startActivity(bingo)
        }
        return view
    }
}
