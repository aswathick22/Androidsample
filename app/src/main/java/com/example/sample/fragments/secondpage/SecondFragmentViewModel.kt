package com.example.sample.fragments.secondpage

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SecondFragmentViewModel : ViewModel(){
    private val _nameValue4 = MutableLiveData<String>()
    val nameValue4 = _nameValue4
    private fun updateNameValue(){
        _nameValue4.value = "Basics of Android Studio"
    }
    init{
        updateNameValue()
    }
}