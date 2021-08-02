package com.example.outsideintddexample

import android.util.Log
import kotlinx.coroutines.delay

class Engine(
    var isTurnedOn: Boolean = false,
    var temperature: Int = 15
) {

    suspend fun turnOn() {
        isTurnedOn = true
        delay(6000)

        temperature = 95
        Log.d("COURSE", "Engine has turned on")

    }

}