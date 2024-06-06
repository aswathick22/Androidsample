package com.example.sample.fragments.welcome

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.sample.R
import com.example.sample.databinding.FragmentWelcomeBinding
import com.example.sample.fragments.welcome.WelcomeViewModel

class WelcomeFragment : Fragment() {

    private lateinit var binding : FragmentWelcomeBinding
    private val welcomeViewModel by viewModels<WelcomeViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //findNavController().navigateUp()
        binding = FragmentWelcomeBinding.inflate(inflater, container, false)
        WelcomeViewModel.nameValue.observe(viewLifecycleOwner){
            print(it)
        }
        binding.bnLogin.setOnClickListener {
            findNavController().navigate(R.id.action_welcomeFragment_to_loginFragment)
        }
        binding.bnSignup.setOnClickListener {
            findNavController().navigate(R.id.action_welcomeFragment_to_signupFragment)
        }
        return binding.root
    }


}
