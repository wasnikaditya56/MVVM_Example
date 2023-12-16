package com.aditya.wasnik.mvvm_example.model

import com.aditya.wasnik.mvvm_example.R

class CityDataProvider {

    private val cities = arrayListOf<City>()

    init {
        cities.add(City("Bangkok", R.drawable.bangkok, 10_000_000))
        cities.add(City("Beijing", R.drawable.beijing, 21_500_000 ))
        cities.add(City("London", R.drawable.london, 8_900_000))
        cities.add(City("New York", R.drawable.newyork, 8_400_000))

    }

    fun getCities() = cities
}