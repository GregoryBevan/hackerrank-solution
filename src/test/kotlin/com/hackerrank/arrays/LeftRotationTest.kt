package com.hackerrank.arrays

import kotlin.test.Test
import kotlin.test.assertTrue

class LeftRotationTest {

    @Test
    fun `rotate 1`() {
        assertTrue(arrayOf(2, 3, 4, 5, 1) contentEquals rotLeft(arrayOf(1, 2, 3, 4, 5), 1))
    }

    @Test
    fun `rotate 2`() {
        assertTrue(arrayOf(3, 4, 5, 1, 2) contentEquals rotLeft(arrayOf(1, 2, 3, 4, 5), 2))
    }
}