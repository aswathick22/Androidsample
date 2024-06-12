package com.example.sample.fragments.firstpage

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.sample.R
import com.example.sample.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    private lateinit var binding : FragmentFirstBinding
    private val firstFragmentViewModel by viewModels<FirstFragmentViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        //findNavController().navigateUp()
        binding = FragmentFirstBinding.inflate(inflater, container, false)
        firstFragmentViewModel.nameValue3.observe(viewLifecycleOwner){
            print(it)
        }
        binding.firstButton1.setOnClickListener {
            findNavController().navigate(R.id.action_firstFragment_to_secondFragment)
        }
        binding.firstButton2.setOnClickListener {
            findNavController().navigate(R.id.action_firstFragment_to_thirdFragment)
        }
        binding.bnRecyclerview.setOnClickListener {
            findNavController().navigate(R.id.action_firstFragment_to_recyclerViewFragment2)
        }
        binding.bnRetrofitRecyclerview.setOnClickListener {
            findNavController().navigate(R.id.action_firstFragment_to_retrofitRecyclerViewFragment)
        }
        return binding.root
    }


}
