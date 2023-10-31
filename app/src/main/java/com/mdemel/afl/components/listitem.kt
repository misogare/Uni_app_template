package com.mdemel.afl.components

import android.view.LayoutInflater
import android.view.View
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.TextView

import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.mdemel.afl.R


class ListItem(itemView: View) : ViewHolder(itemView) {

    val categoryImageView: ImageView = itemView.findViewById(R.id.categoryImageView)
    val categoryTextView: TextView = itemView.findViewById(R.id.categoryTextView)
    val categoryCheckBox: CheckBox = itemView.findViewById(R.id.categoryCheckBox)
    val coursesTextView: TextView = itemView.findViewById(R.id.coursesTextView)
}