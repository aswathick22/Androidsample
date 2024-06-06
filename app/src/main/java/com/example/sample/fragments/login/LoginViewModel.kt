package com.example.sample.fragments.login

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel(){
    private val _nameValue2 = MutableLiveData<String>()
    val nameValue2 = _nameValue2
    private fun updateNameValue(){
        _nameValue2.value = "Login"
    }
    init{
        updateNameValue()
    }
}