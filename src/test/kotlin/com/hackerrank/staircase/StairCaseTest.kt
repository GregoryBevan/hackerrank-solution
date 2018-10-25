package com.hackerrank.staircase

import org.junit.jupiter.api.Test
import kotlin.test.expect

class StairCaseTest {

    @Test
    fun `should return # for size 1`() {
        expect("#") { StairCase().stairCase(1) }
    }

    @Test
    fun `should return two lines with one space on line one for size 2`() {
        expect(" #\n##") { StairCase().stairCase(2) }
    }

    @Test
    fun `should return six lines with one space on line one for size 6`() {
        expect("     #\n    ##\n   ###\n  ####\n #####\n######") { StairCase().stairCase(6) }
    }
}