package com.example.sample.fragments.welcome

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class WelcomeViewModel : ViewModel(){
    private val _nameValue = MutableLiveData<String>()
    val nameValue = _nameValue
    private fun updateNameValue(){
        _nameValue.value = "Welcome"
    }
    init{
        updateNameValue()
    }
}