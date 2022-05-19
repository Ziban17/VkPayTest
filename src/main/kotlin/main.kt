fun main() {
    println("Коммиссия: ${commissionCalculate("Maestro", 100_000, 1_000)}")
}

fun commissionCalculate(cardType: String = "VkPay", totalAmount: Int = 0, amount: Int) = when (cardType) {
    "MasterCard", "Maestro" -> if (totalAmount < 75_000) 0 else amount * 0.006 + 20
    "Visa", "Мир" -> if ((amount * 0.0075) < 35) 35 else amount * 0.0075
    else -> 0
}
