package com.mdemel.afl.components

import android.database.DataSetObserver
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.mdemel.afl.MainActivity8
import com.mdemel.afl.R
import com.mdemel.afl.models.Category
import com.mdemel.afl.models.Course


class CategoryAdapter3(private val context: MainActivity8, private val courses: List<Course>) :
    RecyclerView.Adapter<com.mdemel.afl.components.ListItem2>(), ListAdapter {


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): com.mdemel.afl.components.ListItem2 {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_category, parent, false)
        return ListItem2(itemView)
    }


    override fun getItemCount(): Int = courses.size

    override fun onBindViewHolder(ListItem2:com.mdemel.afl.components.ListItem2, position: Int) {
        val course = courses[position]

        ListItem2.nameTextView.text = course.name
        ListItem2.durationTextView.text = course.duration
        ListItem2.instructorTextView.text = course.instructor
        ListItem2.descriptionTextView.text = course.description
        ListItem2.locationTextView.text = course.location


    }
    override fun registerDataSetObserver(p0: DataSetObserver?) {
        TODO("Not yet implemented")
    }

    override fun unregisterDataSetObserver(p0: DataSetObserver?) {
        TODO("Not yet implemented")
    }

    override fun getCount(): Int {
        TODO("Not yet implemented")
    }

    override fun getItem(p0: Int): Any {
        TODO("Not yet implemented")
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        TODO("Not yet implemented")
    }

    override fun getViewTypeCount(): Int {
        TODO("Not yet implemented")
    }

    override fun isEmpty(): Boolean {
        TODO("Not yet implemented")
    }

    override fun areAllItemsEnabled(): Boolean {
        TODO("Not yet implemented")
    }

    override fun isEnabled(p0: Int): Boolean {
        TODO("Not yet implemented")
    }
//    fun setCategories(newCategories: List<Category>) {
//        categories = newCategories
//        notifyDataSetChanged()
//    }
}
