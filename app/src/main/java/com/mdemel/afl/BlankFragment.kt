//package com.mdemel.afl
//
//import SharedViewModel
//import android.annotation.SuppressLint
//import androidx.fragment.app.viewModels
//import android.os.Bundle
//import androidx.fragment.app.Fragment
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import androidx.recyclerview.widget.RecyclerView
//import com.mdemel.afl.components.CategoryAdapter1
//import com.mdemel.afl.models.DataRepository
//
//class BlankFragment : Fragment() {
//    private var dataRepository = DataRepository()
//    private val viewModel: SharedViewModel by viewModels()
//
//    companion object {
//        fun newInstance() = BlankFragment()
//    }
//
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//
//        // TODO: Use the ViewModel
//    }
//
//    @SuppressLint("MissingInflatedId")
//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View {
//        val root = inflater.inflate(R.layout.activity_main5, container, false)
//        val categories = dataRepository.initializeCategories()
//
//
//        val recyclerView = root.findViewById<RecyclerView>(R.id.gridView1)
//
//            val adapter = CategoryAdapter1(this,categories,viewModel )
//
//
//            recyclerView?.adapter = adapter
//
//
////        root.findViewById<AppCompatButton>(R.id.mad).setOnClickListener {
////            // Add the next screen / second screen
////            activity?.supportFragmentManager?.beginTransaction()
////                ?.add(R.id.fragment_container_view, BlankFragment2::class.java, null)
////                ?.addToBackStack("second")?.commit()
////        }
//
//        return root
//    }
//
//}