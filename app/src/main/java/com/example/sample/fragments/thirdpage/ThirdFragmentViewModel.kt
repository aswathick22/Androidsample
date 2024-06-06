package com.example.sample.fragments.thirdpage

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ThirdFragmentViewModel : ViewModel(){
    private val _nameValue5 = MutableLiveData<String>()
    val nameValue5 = _nameValue5
    private fun updateNameValue(){
        _nameValue5.value = "Basics of Kotlin"
    }
    init{
        updateNameValue()
    }
}