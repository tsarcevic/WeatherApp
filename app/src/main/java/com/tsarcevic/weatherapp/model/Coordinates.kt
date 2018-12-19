package com.tsarcevic.weatherapp.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Coordinates(
    @SerializedName("lon")
    @Expose
    var longitude: kotlin.Double,

    @SerializedName("lat")
    @Expose
    var lattitude: kotlin.Double
)
