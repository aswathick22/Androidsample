package com.example.sample.fragments.firstpage

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FirstFragmentViewModel : ViewModel(){
    private val _nameValue3 = MutableLiveData<String>()
    val nameValue3 = _nameValue3
    private fun updateNameValue(){
        _nameValue3.value = "Welcome to my page!"
    }
    init{
        updateNameValue()
    }
}