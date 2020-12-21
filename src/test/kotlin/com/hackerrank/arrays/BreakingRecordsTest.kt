package com.hackerrank.arrays

import assertk.assertions.isEqualTo
import kotlin.test.Test

class BreakingRecordsTest {

    @Test
    fun `no breaking records if always same scores`() {
        assertk.assertThat(breakingRecords(arrayOf(10, 10, 10, 10))).isEqualTo(arrayOf(0, 0))
    }


}