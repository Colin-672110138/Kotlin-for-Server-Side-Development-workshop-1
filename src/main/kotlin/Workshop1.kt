package org.example

// Workshop #1: Simple Console Application - Unit Converter

fun main() {
    // 2. ใช้ while (true) เพื่อให้โปรแกรมทำงานวนซ้ำ
    while (true) {
        // 1. แสดงเมนูให้ผู้ใช้เลือก
        println("===== Unit Converter =====")
        println("โปรดเลือกหน่วยที่ต้องการแปลง:")
        println("1. Celsius to Fahrenheit")
        println("2. Kilometers to Miles")
        println("พิมพ์ 'exit' เพื่อออกจากโปรแกรม")
        print("เลือกเมนู (1, 2, or exit): ")

        // 2. รับข้อมูลตัวเลือกจากผู้ใช้
        val choice = readln()

        // 3. ควบคุมการทำงานด้วย when expression
        // เลือก 1 เพื่อแปลง Celsius เป็น Fahrenheit: convertCelsiusToFahrenheit()
        // เลือก 2 เพื่อแปลง Kilometers เป็น Miles: convertKilometersToMiles()
        // เลือก 'exit' เพื่อออกจากโปรแกรม
        if (choice == "1") convertCelsiusToFahrenheit()
        else if (choice == "2") convertKilometersToMiles()
        else if (choice == "exit") break

        println() // พิมพ์บรรทัดว่างเพื่อความสวยงาม
    }
}

// ฟังก์ชันสำหรับการแปลง Celsius to Fahrenheit
fun convertCelsiusToFahrenheit() {
    print("ป้อนค่าองศาเซลเซียส (Celsius): ")
    val input = readln()

    // ตรวจสอบว่าเป็นตัวเลขที่ถูกต้องหรือไม่
    val celsius = input.toDoubleOrNull()
    if (celsius == null) {
        println("กรุณากรอกตัวเลขที่ถูกต้อง")
        return
    }

    // แปลงจาก Celsius ไป Fahrenheit
    val fahrenheit = celsius * 9.0 / 5.0 + 32
    println("ผลลัพธ์: $celsius °C เท่ากับ ${"%.2f".format(fahrenheit)} °F")
}

// ฟังก์ชันสำหรับการแปลง Kilometers to Miles
fun convertKilometersToMiles() {
    print("ป้อนค่ากิโลเมตร (Kilometers): ")
    val input = readln()

    // ตรวจสอบว่าเป็นตัวเลขที่ถูกต้องหรือไม่
    val kilometers = input.toDoubleOrNull()
    if (kilometers == null) {
        println("กรุณากรอกตัวเลขที่ถูกต้อง")
        return
    }

    // แปลงจาก Kilometers ไป Miles
    val miles = kilometers * 0.621371
    println("ผลลัพธ์: $kilometers km เท่ากับ ${"%.2f".format(miles)} miles")
}
