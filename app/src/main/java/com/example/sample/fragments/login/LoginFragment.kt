package com.example.sample.fragments.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.sample.R
import com.example.sample.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {
    private val loginViewModel by viewModels<LoginViewModel>()
    private lateinit var binding : FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentLoginBinding.inflate(inflater, container, false)
        loginViewModel.nameValue2.observe(viewLifecycleOwner){
            print(it)
        }
        binding.bnLogin.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_firstFragment)
        }
        return binding.root
    }

}