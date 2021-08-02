package com.example.myfirstunittest

import org.junit.Test

import org.junit.Assert.*

class EngineTest {

    private val engine = Engine(800,189,15, false)

    @Test
    fun engineTurnsOn() {
        engine.turnOn()
        assertEquals(engine.isTurnedOn, true)
    }
    @Test
    fun engineTurnsOff() {
        engine.turnOff()
        assertEquals(engine.isTurnedOn, false)
    }
}