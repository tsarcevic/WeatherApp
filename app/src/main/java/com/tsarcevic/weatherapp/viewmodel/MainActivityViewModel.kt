package com.tsarcevic.weatherapp.viewmodel

import android.arch.lifecycle.MutableLiveData
import com.tsarcevic.weatherapp.interaction.WeatherInteraction
import com.tsarcevic.weatherapp.interaction.WeatherInteractionImpl
import com.tsarcevic.weatherapp.model.WeatherResponse

class MainActivityViewModel {

    val weatherInteracion: WeatherInteraction = WeatherInteractionImpl()

    val weatherResponse: MutableLiveData<WeatherResponse> = MutableLiveData()
    val error: MutableLiveData<Boolean> = MutableLiveData()

}
