package com.hackerrank.appleandorange

import org.junit.jupiter.api.Test
import kotlin.test.expect


class AppleAndOrangeTest {

    @Test
    fun `should return 0 and 0 when notinhg falls on the house`() {
        expect("0\n0") { countApplesAndOranges(4, 5, 2, 7, arrayOf(1),  arrayOf(1))}
    }

    @Test
    fun `should return 1 and 0 when one apple falls on the house`() {
        expect("1\n0") { countApplesAndOranges(4, 5, 2, 7, arrayOf(2),  arrayOf(1))}
    }

    @Test
    fun `should return 0 and 1 when one orange falls on the house`() {
        expect("0\n1") { countApplesAndOranges(4, 5, 2, 7, arrayOf(1),  arrayOf(-2))}
    }
}