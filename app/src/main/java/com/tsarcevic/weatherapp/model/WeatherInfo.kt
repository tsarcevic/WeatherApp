package com.tsarcevic.weatherapp.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class WeatherInfo(
    @SerializedName("dt_txt")
    @Expose
    val currentDate: String,
    @SerializedName("main")
    @Expose
    val mainInfo: CurrentWeatherInfo
)
