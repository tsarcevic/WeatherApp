package com.tsarcevic.weatherapp.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class City (
    @SerializedName("id")
    @Expose
    var id: kotlin.Int,

    @SerializedName("name")
    @Expose
    var name: String,

    @SerializedName("country")
    @Expose
    var country: String,

    @SerializedName("cod")
    @Expose
    var cod: kotlin.Int,

    @SerializedName("message")
    @Expose
    var message: Double,

    @SerializedName("cnt")
    @Expose
    var count: kotlin.Int,

    @SerializedName("coord")
    @Expose
    var coordinates: Coordinates,

    @SerializedName("list")
    @Expose
    var list: List<WeatherInfo>
)
