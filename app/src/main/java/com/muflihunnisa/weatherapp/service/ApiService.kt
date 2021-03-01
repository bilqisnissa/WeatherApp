package com.muflihunnisa.weatherapp.service

import com.muflihunnisa.weatherapp.model.ResponseWeather
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET ("weather?")
    fun getWeather(
        @Query("q") name : String?,
        @Query("appid") apiKey : String?
    ):Call<ResponseWeather>
}