package at.thealoofpotato.retrofitcoroutines.API

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object API {

    val BASE_URL = "https://cat-fact.herokuapp.com"

    val api = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(APIRequest::class.java)
}