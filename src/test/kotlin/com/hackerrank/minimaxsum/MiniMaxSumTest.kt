package com.hackerrank.minimaxsum

import org.junit.jupiter.api.Test
import kotlin.test.expect

class MiniMaxSumTest {

    @Test
    fun `should return 0 for array of zeros`() {
        expect("0 0") { miniMaxSum(listOf(0,0,0,0,0)) }
    }
    @Test
    fun `should return 4 4 for array of ones`() {
        expect("4 4") { miniMaxSum(listOf(1,1,1,1,1)) }
    }
    @Test
    fun `should return 10 14 for sample array`() {
        expect("10 14") { miniMaxSum(listOf(1,2,3,4,5)) }
    }

}