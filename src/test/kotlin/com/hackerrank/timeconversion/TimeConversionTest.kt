package com.hackerrank.timeconversion

import org.junit.jupiter.api.Test
import kotlin.test.expect

class TimeConversionTest {

    @Test
    fun `should be 00 00 00 for midnight`() {
        expect("00:00:00") { timeConversion("12:00:00AM") }
    }

    @Test
    fun `should be 12 00 00 for noon`() {
        expect("12:00:00") { timeConversion("12:00:00PM") }
    }

    @Test
    fun `should be 11 59 59 before noon`() {
        expect("11:59:59") { timeConversion("11:59:59AM") }
    }

    @Test
    fun `should be 23 59 59 before noon`() {
        expect("23:59:59") { timeConversion("11:59:59PM") }
    }
}