package com.example.lesson38

import android.graphics.Bitmap
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.lesson38.databinding.FragmentForthBinding
import com.example.lesson38.databinding.FragmentThirdBinding

class ForthFragment : Fragment() {

    private lateinit var binding: FragmentForthBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentForthBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getData()
    }

    private fun getData() {
        val bundle = arguments
        if (bundle != null){

            binding.tvFirst.text=bundle.getString("name2")
            binding.tvSecond.text = bundle.getString("surname2")
            binding.tvThird.text = bundle.getString("age2")
            binding.tvForth.text = bundle.getString("gender2")
            binding.tvFifth.text = bundle.getString("study")
            binding.tvSixth.text = bundle.getString("work")
        }
    }
}
