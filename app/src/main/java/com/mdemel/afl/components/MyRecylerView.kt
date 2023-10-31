//package com.mdemel.afl.components
//
//import android.annotation.SuppressLint
//import android.content.Context
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.BaseAdapter
//import android.widget.CheckBox
//import android.widget.ImageView
//import android.widget.TextView
//import com.mdemel.afl.R
//import com.mdemel.afl.models.Category
//
//
//class CategoryAdapter(private val context: Context, private val categories: List<Category>) : BaseAdapter() {
//    private val checkedCategories = mutableSetOf<String>() // Store the checked categories
//
//    override fun getCount(): Int = categories.size
//
//    override fun getItem(position: Int): Any = categories[position]
//
//    override fun getItemId(position: Int): Long = position.toLong()
//
//    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
//        val category = getItem(position) as Category
//        val inflater = LayoutInflater.from(context)
//        val view = inflater.inflate(R.layout.grid_item_layout, null)
//        val categoryTextView = view.findViewById<TextView>(R.id.categoryTextView)
//        val categoryCheckBox = view.findViewById<CheckBox>(R.id.categoryCheckBox)
//        val categoryImageView = view.findViewById<ImageView>(R.id.categoryImageView)
//        val coursesTextView = view.findViewById<TextView>(R.id.coursesTextView)
//        categoryTextView.text = category.name
//        categoryImageView.setImageResource(category.imageResourceId)
//        coursesTextView.text = category.courses.joinToString(", ") { it.name }
//        categoryCheckBox.isChecked = checkedCategories.contains(category.name)
//        categoryCheckBox.setOnCheckedChangeListener { _, isChecked ->
//            if (isChecked) {
//                checkedCategories.add(category.name)
//            } else {
//                checkedCategories.remove(category.name)
//            }
//        }
//        return view
//    }
//}
