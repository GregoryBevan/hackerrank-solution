package com.hackerrank.tripletcomparison

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class TripletComparisonTest {
    @Test
    fun `should return zero to zero array if all equals`() {
        assertArrayEquals(arrayOf(0,0), TripletComparison().compareTriplets(arrayOf(1,1,1), arrayOf(1,1,1)))
    }

    @Test
    fun `should return 1 to zero array if first wins one time`() {
        assertArrayEquals(arrayOf(1,0), TripletComparison().compareTriplets(arrayOf(2,1,1), arrayOf(1,1,1)))
    }

    @Test
    fun `should return zero to one array if second wins one time`() {
        assertArrayEquals(arrayOf(0,1), TripletComparison().compareTriplets(arrayOf(2,1,1), arrayOf(3,1,1)))
    }

}