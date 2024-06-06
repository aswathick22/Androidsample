package com.example.sample.fragments.signup

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.sample.R
import com.example.sample.databinding.FragmentSignupBinding
import com.example.sample.fragments.login.LoginViewModel

class SignupFragment : Fragment() {

    private lateinit var binding : FragmentSignupBinding
    private val signupViewModel by viewModels<SignupViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSignupBinding.inflate(inflater, container, false)
        signupViewModel.nameValue1.observe(viewLifecycleOwner){
            print(it)
        }

        binding.bnSubmit.setOnClickListener {
            findNavController().navigate(R.id.action_signupFragment_to_loginFragment)
        }
        return binding.root
    }

}