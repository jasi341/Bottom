package com.example.bottomsheet

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.bottomsheet.databinding.BottomSheetBinding
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

//class BottomSheet: BottomSheetDialogFragment(){
//

//
//    fun setContainer(layout:View,layoutId:Int){
//        val inflater = LayoutInflater.from(context)
//        val inflatedLayout = inflater.inflate(layoutId,layout as ViewGroup,false)
//        binding.containerView.addView(inflatedLayout)
//    }
//
//
//    override fun onCreateView(
//        inflater: LayoutInflater,
//        container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View {

//    }
//
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//
//        // Get the BottomSheetBehavior
//        val bottomSheet: View = coordinatorLayout.findViewById(R.id.bottom_sheet)
//        val sheetBehavior = BottomSheetBehavior.from(bottomSheet)
//
//// Set the peek height
//        sheetBehavior.peekHeight = 200
//
//        // Set the peek height
//        sheetBehavior.peekHeight = 2000
//    }
//
//
//
//}

class BottomSheetFragment : BottomSheetDialogFragment() {
    private lateinit var binding: BottomSheetBinding
    private var title = ""



    fun setTitle(title: String) {
        this.title = title
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = BottomSheetBinding.inflate(layoutInflater)
        binding.textView.text = title
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//      sheet behavior
        val bottomSheetBehavior= BottomSheetBehavior.from(view.parent as View)
        bottomSheetBehavior.state = BottomSheetBehavior.PEEK_HEIGHT_AUTO

        val layout = view.findViewById<View>(R.id.bottomSheetLayout)

        assert(layout != null)
        layout.minimumHeight = (resources.displayMetrics.heightPixels)

    }

}