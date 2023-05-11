package com.example.lesson38

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.example.lesson38.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    private lateinit var binding: FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        onClick()
    }

    private fun onClick() {

        val name = arguments?.getString("name")
        val surname = arguments?.getString("surname")

                binding.secondButton.setOnClickListener{
                val bundle = Bundle ()
                bundle.putString("age", binding.etAge.text.toString())
                bundle.putString("surname2", surname)
                bundle.putString("name2", name)
                bundle.putString("gender", binding.etGender.text.toString())
                findNavController().navigate(R.id.action_secondFragment2_to_thirdFragment, bundle)
            }
        }

    }



