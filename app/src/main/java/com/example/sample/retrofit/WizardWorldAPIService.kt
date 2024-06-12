package com.example.sample.retrofit

import com.example.sample.data.Feedback
import com.example.sample.data.House
import com.example.sample.data.Wizard
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST
import retrofit2.http.Query

interface WizardWorldAPIService {
    @GET("/Houses")
    suspend fun getHouses():List<House>

    @Headers("accept: text/plain")
    @GET("/Wizards")
    suspend fun getWizards(
        @Query("FirstName") firstName : String? = null,
        @Query("LastName") lastName : String? = null
    ):List<Wizard>

    @POST("/Feedback")
    suspend fun submitFeedback(@Body feedback : Feedback): Response<Void>
}
/*class WizardWorldApiServiceImpl(private val wizardWorldAPIService : WizardWorldAPIService) : WizardWorldAPIService{
    override suspend fun getHouses(): List<House> {
       return wizardWorldAPIService.getHouses()
    }

    override suspend fun getWizards(firstName: String?, lastName: String?): List<Wizard> {
        TODO("Not yet implemented")
    }

    override suspend fun submitFeedback(feedback: Feedback): Response<Void> {
        TODO("Not yet implemented")
    }

}*/
