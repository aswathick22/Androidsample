package com.example.sample.fragments.thirdpage

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.sample.R
import com.example.sample.databinding.FragmentThirdBinding

class ThirdFragment : Fragment() {

    private lateinit var binding : FragmentThirdBinding
    private val thirdFragmentViewModel by viewModels<ThirdFragmentViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //findNavController().navigateUp()
        binding = FragmentThirdBinding.inflate(inflater, container, false)
        ThirdFragmentViewModel.nameValue5.observe(viewLifecycleOwner){
            print(it)
        }
        binding.thirdButton.setOnClickListener {
            findNavController().navigate(R.id.action_thirdFragment_to_firstFragment)
        }
        return binding.root
    }


}
