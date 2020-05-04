package com.hackerrank.arrays

import kotlin.test.Test
import kotlin.test.expect

class HourglassSumTest {

    @Test
    fun `should find 0 for an all zero matrix`() {
        val matrix = (0..6).map { arrayOf(0, 0, 0, 0, 0, 0) }.toTypedArray()

        expect(0) { hourglassSum(matrix) }
    }

    @Test
    fun `should find 7 for an all one matrix`() {
        val matrix = (0..6).map { arrayOf(1, 1, 1, 1, 1, 1) }.toTypedArray()

        expect(7) { hourglassSum(matrix) }
    }

    @Test
    fun `should find 10`() {
        val matrix = mutableListOf(arrayOf(1, 1, 1, 2, 2, 2))
            matrix.addAll ((1..6).map { arrayOf(1, 1, 1, 1, 1, 1) }.toTypedArray())

        expect(10) { hourglassSum(matrix.toTypedArray()) }
    }

    @Test
    fun `should find 11`() {
        val matrix = mutableListOf(arrayOf(1, 1, 1, 2, 2, 2))
        matrix.add(arrayOf(1, 1, 1, 1, 2, 1))
        matrix.addAll ((1..4).map { arrayOf(1, 1, 1, 1, 1, 1) }.toTypedArray())

        expect(11) { hourglassSum(matrix.toTypedArray()) }
    }

    @Test
    fun `should find 12`() {
        val matrix = (0..2).map { arrayOf(1, 1, 1, 1, 2, 1) }.toMutableList()
        matrix.add(arrayOf(1, 1, 1, 2, 3, 3))
        matrix.add(arrayOf(1, 1, 1, 1, 3, 1))
        matrix.add(arrayOf(1, 1, 1, 2, 2, 2))

        expect(17) { hourglassSum(matrix.toTypedArray()) }
    }
}