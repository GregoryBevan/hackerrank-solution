package com.leetcode

import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

class TwoSumTest {

    @Test
    fun `should return 6 for (3, 3)`() {
        assertTrue(intArrayOf(0,1).contentEquals(twoSum(intArrayOf(3, 3), 6)))
    }

    @Test
    fun `should return 9 for (2,7,11,15)`() {
        assertTrue(intArrayOf(0,1).contentEquals(twoSum(intArrayOf(2, 7, 11, 15), 9)))
    }

    @Test
    fun `should return 6 for (3,2,4)`() {
        assertTrue(intArrayOf(1,2).contentEquals(twoSum(intArrayOf(3,2,4), 6)))
    }
}