package com.mdemel.afl.components

import android.view.LayoutInflater
import android.view.View
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.TextView

import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.mdemel.afl.R


class ListItem1(itemView: View) : ViewHolder(itemView) {

    val categoryImageView1: ImageView = itemView.findViewById(R.id.categoryImageView1)
    val categoryTextView1: TextView = itemView.findViewById(R.id.categoryTextView1)

    val coursesTextView1: TextView = itemView.findViewById(R.id.coursesTextView1)
}