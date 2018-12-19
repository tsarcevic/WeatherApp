package com.tsarcevic.weatherapp.network

import com.tsarcevic.weatherapp.model.WeatherResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("forecast")
    fun getWeatherInfo(@Query("id") cityId: kotlin.Int): Single<WeatherResponse>
}