package com.example.sample.retrofit

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.sample.data.Feedback
import com.example.sample.data.House
import com.example.sample.data.Wizard
import kotlinx.coroutines.launch
import retrofit2.Response
import java.util.UUID

class MyViewModel : ViewModel() {

    private val _harryPotterData = MutableLiveData<List<Wizard>>()
    val harryPotterData: LiveData<List<Wizard>> get() = _harryPotterData

    private val _feedbackData = MutableLiveData<Response<Void>>()
    val feedbackData: LiveData<Response<Void>> get() = _feedbackData

    private val _houseData = MutableLiveData<List<House>>()
    val houseData: LiveData<List<House>> get() = _houseData

    private val suggestion = Feedback(
        "Suggestion",
        feedback = "Hi Wizards",
        entityId = UUID.randomUUID().toString()
    )

    init{
        viewModelScope.launch{
              getWizard()
        }
        viewModelScope.launch{
            getHouse()
        }
        viewModelScope.launch{
            submitFeedback(suggestion)
        }
    }

    private suspend fun getHouse(){
        _houseData.value = RetrofitClient.wizardWorldAPIService.getHouses()
    }

    private suspend fun getWizard(firstName:String? = null, lastName:String? = null){
        _harryPotterData.value = RetrofitClient.wizardWorldAPIService.getWizards(firstName,lastName)
    }

    private suspend fun submitFeedback(feedback: Feedback){
        _feedbackData.value = RetrofitClient.wizardWorldAPIService.submitFeedback(feedback)
    }
}