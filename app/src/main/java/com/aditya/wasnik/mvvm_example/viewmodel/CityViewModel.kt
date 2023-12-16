package com.aditya.wasnik.mvvm_example.viewmodel

import android.os.Looper
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.aditya.wasnik.mvvm_example.model.City
import com.aditya.wasnik.mvvm_example.model.CityDataProvider
import java.util.logging.Handler

class CityViewModel: ViewModel() {

    private val cityData = MutableLiveData<City>()
    private val cities = CityDataProvider().getCities()
    private var currentIndex = 0
    private val delay = 2000L

    init {
        loop()
    }

    fun getCityData(): LiveData<City> = cityData

    private fun loop() {
        android.os.Handler(Looper.getMainLooper()).postDelayed({
            updateCity()
        }, delay)
    }

    private fun updateCity() {
        currentIndex++
        currentIndex %= cities.size

        cityData.value = cities[currentIndex]

        loop()
    }

}