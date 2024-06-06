package com.example.sample.fragments.secondpage

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.sample.R
import com.example.sample.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    private lateinit var binding : FragmentSecondBinding
    private val secondFragmentViewModel by viewModels<SecondFragmentViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //findNavController().navigateUp()
        binding = FragmentSecondBinding.inflate(inflater, container, false)
        SecondFragmentViewModel.nameValue4.observe(viewLifecycleOwner){
            println(it)
        }
        binding.secondButton.setOnClickListener {
            findNavController().navigate(R.id.action_secondFragment_to_firstFragment)
        }
        return binding.root
    }


}
