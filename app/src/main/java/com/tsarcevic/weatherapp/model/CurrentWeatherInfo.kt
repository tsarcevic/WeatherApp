package com.tsarcevic.weatherapp.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class CurrentWeatherInfo(
    @SerializedName("temp")
    @Expose
    val temperature: kotlin.Double,
    @SerializedName("pressure")
    @Expose
    val pressure: kotlin.Double,
    @SerializedName("humidity")
    @Expose
    val humidity: kotlin.Int
)
