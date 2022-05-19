import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun commissionCalculateVkPay() {
        val card = "VkPay"
        val totalAmount = 100_000
        val amount = 1_000

        val result = commissionCalculate(cardType = card, totalAmount = totalAmount, amount = amount)

        assertEquals(0, result)

    }

    @Test
    fun commissionCalculate_MaestroTotalMin() {
        val card = "Maestro"
        val totalAmount = 1_000
        val amount = 1_000

        val result = commissionCalculate(cardType = card, totalAmount = totalAmount, amount = amount)

        assertEquals(0, result)
    }

    @Test
    fun commissionCalculate_MaestroTotalMax() {
        val card = "Maestro"
        val totalAmount = 100_000
        val amount = 1_000

        val result = commissionCalculate(cardType = card, totalAmount = totalAmount, amount = amount)

        assertEquals(26.0, result)
    }

    @Test
    fun commissionCalculate_VisaAmount35() {
        val card = "Visa"
        val totalAmount = 1_000
        val amount = 35

        val result = commissionCalculate(cardType = card, totalAmount = totalAmount, amount = amount)

        assertEquals(35, result)
    }

    @Test
    fun commissionCalculate_VisaAmountMax() {
        val card = "Visa"
        val totalAmount = 1_000
        val amount = 100_000

        val result = commissionCalculate(cardType = card, totalAmount = totalAmount, amount = amount)

        assertEquals(750.0, result)
    }

}