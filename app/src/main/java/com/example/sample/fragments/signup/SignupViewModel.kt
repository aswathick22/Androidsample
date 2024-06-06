package com.example.sample.fragments.signup

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SignupViewModel : ViewModel(){
    private val _nameValue1 = MutableLiveData<String>()
    val nameValue1 = _nameValue1
    private fun updateNameValue(){
        _nameValue1.value = "SignUp"
    }
    init{
        updateNameValue()
    }
}