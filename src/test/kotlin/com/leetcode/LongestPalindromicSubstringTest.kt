package com.leetcode

import kotlin.test.Test
import kotlin.test.expect

class LongestPalindromicSubstringTest {

    @Test
    fun `a`() {
        expect("a") { longestPalindromicSubstring("a") }
    }

    @Test
    fun `ab`() {
        expect("a") { longestPalindromicSubstring("a") }
    }

    @Test
    fun `bb`() {
        expect("bb") { longestPalindromicSubstring("bb") }
    }

    @Test
    fun `babad`() {
        expect("bab") { longestPalindromicSubstring("babad") }
    }

    @Test
    fun `cbbd`() {
        expect("bb") { longestPalindromicSubstring("cbbd") }
    }
}

