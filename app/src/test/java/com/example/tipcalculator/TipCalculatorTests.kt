package com.example.tipcalculator

import org.junit.Assert.assertEquals
import org.junit.Test
import java.text.NumberFormat

class TipCalculatorTests {

    @Test
    fun calculateTip_20PercentNoRoundup() {
        val amount: Double = 10.00
        val tipPercent: Double = 20.00

        var expectedTip = NumberFormat.getCurrencyInstance().format(2.00)
        val actualTip = calculateTipAmount(amount = amount, tipPercent = tipPercent, false)

        assertEquals(expectedTip, actualTip)
    }
}