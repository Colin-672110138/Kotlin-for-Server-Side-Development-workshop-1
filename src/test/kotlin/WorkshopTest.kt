package org.example

import kotlin.test.Test
import kotlin.test.assertEquals

import workshop1.celsiusToFahrenheit
import workshop1.kilometersToMiles

import workshop2.Product
import workshop2.calculateTotalElectronicsPriceOver500
import workshop2.countElectronicsOver500

class WorkshopTest {

    // Workshop1: Celsius to Fahrenheit

    @Test
    fun `test celsiusToFahrenheit with positive value`() {
        val input = 20.0
        val expected = 68.0
        val actual = celsiusToFahrenheit(input)
        assertEquals(expected, actual, 0.001)
    }

    @Test
    fun `test celsiusToFahrenheit with zero`() {
        val input = 0.0
        val expected = 32.0
        val actual = celsiusToFahrenheit(input)
        assertEquals(expected, actual, 0.001)
    }

    @Test
    fun `test celsiusToFahrenheit with negative value`() {
        val input = -10.0
        val expected = 14.0
        val actual = celsiusToFahrenheit(input)
        assertEquals(expected, actual, 0.001)
    }

    // Workshop1: Kilometers to Miles

    @Test
    fun `test kilometersToMiles with one kilometer`() {
        val input = 1.0
        val expected = 0.621371
        val actual = kilometersToMiles(input)
        assertEquals(expected, actual, 0.000001)
    }

    // Workshop2: Total Electronics Price Over 500

    @Test
    fun `test calculateTotalElectronicsPriceOver500`() {
        val products = listOf(
            Product("TV", 700.0, "Electronics"),
            Product("Headphones", 300.0, "Electronics"),
            Product("Laptop", 1000.0, "Electronics"),
            Product("T-shirt", 200.0, "Clothing")
        )
        val expected = 1700.0 // 700 + 1000
        val actual = calculateTotalElectronicsPriceOver500(products)
        assertEquals(expected, actual, 0.001)
    }

    // Workshop2: Count Electronics Over 500

    @Test
    fun `test countElectronicsOver500`() {
        val products = listOf(
            Product("TV", 700.0, "Electronics"),
            Product("Headphones", 300.0, "Electronics"),
            Product("Laptop", 1000.0, "Electronics"),
            Product("T-shirt", 200.0, "Clothing")
        )
        val expected = 2 // TV กับ Laptop
        val actual = countElectronicsOver500(products)
        assertEquals(expected, actual)
    }
}
