package workshop1

// ฟังก์ชันแปลง Celsius เป็น Fahrenheit (รับ Double คืน Double)
fun celsiusToFahrenheit(celsius: Double): Double {
    return celsius * 9.0 / 5.0 + 32
}

// ฟังก์ชันแปลง Kilometers เป็น Miles (รับ Double คืน Double)
fun kilometersToMiles(km: Double): Double {
    return km * 0.621371
}

// ฟังก์ชันสำหรับอ่าน input และแปลง Celsius เป็น Fahrenheit พร้อมแสดงผล (สำหรับ console)
fun convertCelsiusToFahrenheit() {
    print("ป้อนค่าองศาเซลเซียส (Celsius): ")
    val input = readln()
    val celsius = input.toDoubleOrNull()
    if (celsius == null) {
        println("กรุณากรอกตัวเลขที่ถูกต้อง")
        return
    }
    val fahrenheit = celsiusToFahrenheit(celsius)
    println("ผลลัพธ์: $celsius °C เท่ากับ ${"%.2f".format(fahrenheit)} °F")
}

// ฟังก์ชันสำหรับอ่าน input และแปลง Kilometers เป็น Miles พร้อมแสดงผล (สำหรับ console)
fun convertKilometersToMiles() {
    print("ป้อนค่ากิโลเมตร (Kilometers): ")
    val input = readln()
    val km = input.toDoubleOrNull()
    if (km == null) {
        println("กรุณากรอกตัวเลขที่ถูกต้อง")
        return
    }
    val miles = kilometersToMiles(km)
    println("ผลลัพธ์: $km km เท่ากับ ${"%.2f".format(miles)} miles")
}

// main เดิมยังเหมือนเดิม
fun main() {
    while (true) {
        println("===== Unit Converter =====")
        println("โปรดเลือกหน่วยที่ต้องการแปลง:")
        println("1. Celsius to Fahrenheit")
        println("2. Kilometers to Miles")
        println("พิมพ์ 'exit' เพื่อออกจากโปรแกรม")
        print("เลือกเมนู (1, 2, or exit): ")

        val choice = readln()
        if (choice == "1") convertCelsiusToFahrenheit()
        else if (choice == "2") convertKilometersToMiles()
        else if (choice == "exit") break

        println()
    }
}
