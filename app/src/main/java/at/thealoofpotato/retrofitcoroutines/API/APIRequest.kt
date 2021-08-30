package at.thealoofpotato.retrofitcoroutines.API

import at.thealoofpotato.retrofitcoroutines.Model.CatsModel
import retrofit2.Call
import retrofit2.http.GET

interface APIRequest {

    @GET("/facts/random")
    fun getCatFacts(): Call<CatsModel>

}