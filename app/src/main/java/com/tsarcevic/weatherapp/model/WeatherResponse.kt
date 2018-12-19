package com.tsarcevic.weatherapp.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class WeatherResponse(
    @SerializedName("city")
    @Expose
    var city: City
)