package com.hackerrank.warmup

import kotlin.test.Test
import kotlin.test.expect

class CountingValleysTest {

    @Test
    fun `should count 0 valley for UD path`() {
        expect(0) { countingValleys(2, "UD") }
    }

    @Test
    fun `should count 1 valley for DU path`() {
        expect(1) { countingValleys(2, "DU") }
    }

    @Test
    fun `should count 1 valley for UDDDUDUU`() {
        expect(1) { countingValleys(8, "UDDDUDUU") }
    }
}