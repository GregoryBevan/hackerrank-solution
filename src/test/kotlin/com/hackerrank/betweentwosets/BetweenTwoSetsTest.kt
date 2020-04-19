package com.hackerrank.betweentwosets

import org.junit.jupiter.api.Test
import kotlin.test.expect

class BetweenTwoSetsTest {

    @Test
    fun `should return 0 if each array contain element no divisible elements `() {
        expect(0) { getTotalX(arrayOf(2), arrayOf(3)) }
    }

    @Test
    fun `should return 1 for arrays containing same element`() {
        expect(1) { getTotalX(arrayOf(1), arrayOf(1)) }
    }

    @Test
    fun `should return 2 for first example`() {
        expect(2) { getTotalX(arrayOf(2, 6), arrayOf(24, 36)) }
    }

    @Test
    fun `should return 3 for second example`() {
        expect(3) { getTotalX(arrayOf(2, 4), arrayOf(16, 32, 96)) }
    }
}