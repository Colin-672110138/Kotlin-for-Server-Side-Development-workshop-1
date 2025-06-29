package org.example

import kotlin.test.Test
import kotlin.test.assertEquals



class WorkshopTest {

    // --- Tests for Workshop #1: Unit Converter ---

    // celsius input: 20.0
    // expected output: 68.0
    @Test
    fun `test celsiusToFahrenheit with positive value`() {
        // Arrange: ตั้งค่า input และผลลัพธ์ที่คาดหวัง
        val celsiusInput = 20.0
        val expectedFahrenheit = 68.0

        // Act: เรียกใช้ฟังก์ชันที่ต้องการทดสอบ
        val actualFahrenheit = celsiusToFahrenheit(celsiusInput)

        // Assert: ตรวจสอบว่าผลลัพธ์ที่ได้ตรงกับที่คาดหวัง
        assertEquals(expectedFahrenheit, actualFahrenheit, 0.001, "20°C should be 68°F")
    }

    // celsius input: 0.0
    // expected output: 32.0
    @Test
    fun `test celsiusToFahrenheit with zero`() {
        val input = 0.0
        val expected = 32.0
        val actual = celsiusToFahrenheit(input)
        assertEquals(expected, actual, 0.001, "0°C should be 32°F")
    }

    // celsius input: -10.0
    // expected output: 14.0
    @Test
    fun `test celsiusToFahrenheit with negative value`() {
        val input = -10.0
        val expected = 14.0
        val actual = celsiusToFahrenheit(input)
        assertEquals(expected, actual, 0.001, "-10°C should be 14°F")
    }

    // test for kilometersToMiles function
    // kilometers input: 1.0
    // expected output: 0.621371
    @Test
    fun `test kilometersToMiles with one kilometer`() {
        val input = 1.0
        val expected = 0.621371
        val actual = kilometersToMiles(input)
        assertEquals(expected, actual, 0.000001, "1 km should be approximately 0.621371 miles")
    }

    // --- Tests for Workshop #1: Unit Converter End ---


    // --- Tests for Workshop #2: Data Analysis Pipeline ---
    // ทำการแก้ไขไฟล์ Workshop2.kt ให้มีฟังก์ชันที่ต้องการทดสอบ
    // เช่น ฟังก์ชันที่คำนวณผลรวมราคาสินค้า Electronics ที่ราคา > 500 บาท
    // ในที่นี้จะสมมุติว่ามีฟังก์ชันชื่อ calculateTotalElectronicsPriceOver500 ที่รับ List<Product> และคืนค่า Double
    // จงเขียน test cases สำหรับฟังก์ชันนี้ โดยตรวจสอบผลรวมราคาสินค้า Electronics ที่ราคา > 500 บาท
    // 🚨
    @Test
    fun `test calculateTotalElectronicsPriceOver500`() {
        val products = listOf(
            Product("TV", "Electronics", 700.0),
            Product("Headphones", "Electronics", 300.0),
            Product("Laptop", "Electronics", 1000.0),
            Product("T-shirt", "Clothing", 200.0),
            Product("Smartphone", "Electronics", 499.0)
        )
        val expectedTotal = 1700.0 // 700 + 1000
        val actualTotal = calculateTotalElectronicsPriceOver500(products)
        assertEquals(expectedTotal, actualTotal, 0.001)
    }

    // จงเขียน test cases เช็คจำนวนสินค้าที่อยู่ในหมวด 'Electronics' และมีราคามากกว่า 500 บาท
    // 🚨
    @Test
    fun `test countElectronicsOver500`() {
        val products = listOf(
            Product("TV", "Electronics", 700.0),
            Product("Headphones", "Electronics", 300.0),
            Product("Laptop", "Electronics", 1000.0),
            Product("Smartphone", "Electronics", 499.0),
            Product("Shoes", "Clothing", 700.0)
        )
        val expectedCount = 2 // TV and Laptop
        val actualCount = countElectronicsOver500(products)
        assertEquals(expectedCount, actualCount)
    }

    // --- Tests for Workshop #2: Data Analysis Pipeline End ---
}

// ฟังก์ชันจาก Workshop #1
fun celsiusToFahrenheit(celsius: Double): Double {
    return celsius * 9 / 5 + 32
}

fun kilometersToMiles(km: Double): Double {
    return km * 0.621371
}

// Data และฟังก์ชันจาก Workshop #2
data class Product(val name: String, val category: String, val price: Double)

fun calculateTotalElectronicsPriceOver500(products: List<Product>): Double {
    return products
        .filter { it.category == "Electronics" && it.price > 500 }
        .sumOf { it.price }
}

fun countElectronicsOver500(products: List<Product>): Int {
    return products.count { it.category == "Electronics" && it.price > 500 }
}
