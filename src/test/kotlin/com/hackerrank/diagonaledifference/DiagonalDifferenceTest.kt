package com.hackerrank.diagonaledifference

import org.junit.jupiter.api.Test
import kotlin.test.expect

class DiagonalDifferenceTest {

    @Test
    fun `should return zero for all zero matrix`() {
        expect(0) { DiagonalDifference().diagonalDifference(arrayOf(arrayOf(0,0,0), arrayOf(0,0,0), arrayOf(0,0,0))) }
    }

    @Test
    fun `should return zero for symetric matrix`() {
        expect(0) { DiagonalDifference().diagonalDifference(arrayOf(arrayOf(1,0,1), arrayOf(0,1,0), arrayOf(1,0,1))) }
    }

    @Test
    fun `should return sum for sample output`() {
        expect(15) { DiagonalDifference().diagonalDifference(arrayOf(arrayOf(11,2,4), arrayOf(4,5,6), arrayOf(10,8,-12))) }
    }
}