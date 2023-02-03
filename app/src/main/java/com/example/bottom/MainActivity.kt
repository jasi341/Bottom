package com.example.bottom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bottom.databinding.ActivityMainBinding
import com.example.bottom.databinding.DemoBinding
import com.example.bottomsheet.BottomSheetFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var binding2:DemoBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        binding2 = DemoBinding.inflate(layoutInflater)

        binding.button.setOnClickListener {
            val bottomSheetFragment = BottomSheetFragment()
            bottomSheetFragment.setTitle("Bottom Sheet")
            bottomSheetFragment.show(supportFragmentManager, "BottomSheet")
        }

        setContentView(binding.root)
    }
}