package com.hackerrank.verybigsum

import org.junit.jupiter.api.Test
import kotlin.test.expect

class VeryBigSumTest {

    @Test
    fun `should return 2 for 1 plus 1`() {
        expect(2) { VeryBigSum().aVeryBigSum(arrayOf(1L,1L)) }
    }
    @Test
    fun `should sum all numbers in array`() {
        expect(3) { VeryBigSum().aVeryBigSum(arrayOf(1L, 1L, 1L)) }
    }
    @Test
    fun `should sum big integers`() {
        println(Int.MAX_VALUE)
        val intMaxValue = Int.MAX_VALUE.toLong()
        expect(6_442_450_941) { VeryBigSum()
            .aVeryBigSum(arrayOf(intMaxValue,intMaxValue, intMaxValue)) }
    }
}