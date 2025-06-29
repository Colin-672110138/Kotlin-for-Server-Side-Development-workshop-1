package workshop2

// กำหนด data class สำหรับเก็บข้อมูลสินค้า
data class Product(val name: String, val price: Double, val category: String)

// ฟังก์ชันคำนวณผลรวมราคาสินค้าหมวด Electronics ที่ราคามากกว่า 500 บาท
fun calculateTotalElectronicsPriceOver500(products: List<Product>): Double {
    return products
        .filter { it.category == "Electronics" && it.price > 500 }
        .sumOf { it.price }
}

// ฟังก์ชันนับจำนวนสินค้าหมวด Electronics ที่ราคามากกว่า 500 บาท
fun countElectronicsOver500(products: List<Product>): Int {
    return products
        .count { it.category == "Electronics" && it.price > 500 }
}

fun main() {
    // สร้างรายการสินค้าตัวอย่าง
    val products = listOf(
        Product("Laptop", 35000.0, "Electronics"),
        Product("Smartphone", 25000.0, "Electronics"),
        Product("T-shirt", 450.0, "Apparel"),
        Product("Monitor", 7500.0, "Electronics"),
        Product("Keyboard", 499.0, "Electronics"), // ราคาต่ำกว่า 500
        Product("Jeans", 1200.0, "Apparel"),
        Product("Headphones", 1800.0, "Electronics")
    )

    println("รายการสินค้าทั้งหมด:")
    products.forEach {
        println("ชื่อสินค้า: ${it.name}, ราคา: ${it.price}, หมวดหมู่: ${it.category}")
    }
    println("--------------------------------------------------")

    // ทดสอบฟังก์ชันคำนวณผลรวมราคาสินค้า
    val totalPrice = calculateTotalElectronicsPriceOver500(products)
    println("ผลรวมราคาสินค้า Electronics ที่ราคา > 500 บาท: $totalPrice บาท")

    // ทดสอบฟังก์ชันนับจำนวนสินค้า
    val count = countElectronicsOver500(products)
    println("จำนวนสินค้า Electronics ที่ราคา > 500 บาท: $count ชิ้น")
}
