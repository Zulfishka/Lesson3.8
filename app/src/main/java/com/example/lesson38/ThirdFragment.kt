package com.example.lesson38

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.example.lesson38.databinding.FragmentSecondBinding
import com.example.lesson38.databinding.FragmentThirdBinding

class ThirdFragment : Fragment() {

    private lateinit var binding: FragmentThirdBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentThirdBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        onClick()
    }

    private fun onClick() {

        val name = arguments?.getString("name2")
        val surname = arguments?.getString("surname2")
        val age = arguments?.getString("age")
        val gender = arguments?.getString("gender")

        binding.thirdButton.setOnClickListener{
            val bundle = Bundle ()
            bundle.putString("age2",age)
            bundle.putString("surname2", surname)
            bundle.putString("name2", name)
            bundle.putString("gender2", gender)
            bundle.putString("study", binding.etPlaceOfStudy.text.toString())
            bundle.putString("work", binding.etPlaceOfWork.text.toString())
            findNavController().navigate(R.id.action_thirdFragment_to_forthFragment, bundle)
        }
    }

}