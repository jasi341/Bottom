package com.example.bottomsheet

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.bottomsheet.databinding.BottomSheetBinding
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
class BottomSheetFragment : BottomSheetDialogFragment() {
    private lateinit var binding: BottomSheetBinding
    private var title = ""
    private lateinit var bottomSheetBehavior: BottomSheetBehavior<*>



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

        val bottomSheet = binding.bottomSheet
        bottomSheetBehavior = BottomSheetBehavior.from(bottomSheet)

        bottomSheetBehavior.isDraggable = true
        bottomSheetBehavior.halfExpandedRatio = 0.9f


        bottomSheetBehavior.setBottomSheetCallback(object : BottomSheetBehavior.BottomSheetCallback() {
            override fun onStateChanged(bottomSheet: View, newState: Int) {


            }

            override fun onSlide(bottomSheet: View, slideOffset: Float) {
            }
        })
        return binding.root
    }

    override fun onStart() {
        super.onStart()
        bottomSheetBehavior.state = BottomSheetBehavior.STATE_EXPANDED
    }

}