package com.example.outsideintddexample.acceptancetests

import com.example.outsideintddexample.Car
import com.example.outsideintddexample.Engine
import junit.framework.TestCase.assertEquals
import junit.framework.TestCase.assertTrue
import org.junit.Test

class CarFeature {

    private val engine = Engine(false, 30)
    private val car = Car(6.0, engine)

    @Test
    fun carIsLosingFuelWhenItTurnsOn() {
        car.turnOn()
        assertEquals(5.5, car.fuel)

    }

    @Test
    fun carIsTurningOnItsEngineAndIncreasingTheTemperature() {
        car.turnOn()
        assertEquals(95, car.engine.temperature)
        assertTrue(car.engine.isTurnedOn)
    }
}