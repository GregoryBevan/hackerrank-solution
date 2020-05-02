package com.hackerrank.warmup

import kotlin.test.Test
import kotlin.test.expect


class RepeatedStringTest {

    @Test
    fun `should have 0 a for 'b' string and 1 considered char`() {
        expect(0)  { repeatedString("b", 1) }
    }

    @Test
    fun `should have 0 a for 'a' string and 1 considered char`() {
        expect(1)  { repeatedString("a", 1) }
    }

    @Test
    fun `should have 1 a for 'ab' string and 1 considered char`() {
        expect(1)  { repeatedString("ab", 1) }
    }

    @Test
    fun `should have 0 a for 'ba' string and 1 considered char`() {
        expect(0)  { repeatedString("ba", 1) }
    }

    @Test
    fun `should have 7 a for 'aba' string and 10 considered char`() {
        expect(7)  { repeatedString("aba", 10) }
    }


    @Test
    fun `should have 1000000000000 a for 'a' string and 1000000000000 considered char`() {
        expect(1000000000000)  { repeatedString("a", 1000000000000) }
    }

}
