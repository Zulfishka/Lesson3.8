package com.example.lesson38

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.widget.AppCompatButton
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.lesson38.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    private lateinit var binding: FragmentFirstBinding

       override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        onClick()
    }

        private fun onClick() {
            binding.firstButton.setOnClickListener{
            val bundle = Bundle ()
            bundle.putString("name", binding.etName.text.toString())
            bundle.putString("surname", binding.etSurname.text.toString())
            findNavController().navigate(R.id.action_firstFragment3_to_secondFragment2, bundle)
        }
    }

}

