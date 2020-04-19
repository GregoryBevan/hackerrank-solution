package com.hackerrank.warmup

import kotlin.test.Test
import kotlin.test.expect

class SockMerchantTest {

    @Test
    fun `should return 0 for 1 sock`() {
        expect(0) { sockMerchant(1, arrayOf(1)) }
    }

    @Test
    fun `should return 1 for 2 socks of same color`() {
        expect(1) { sockMerchant(2, arrayOf(1, 1)) }
    }

    @Test
    fun `should return 0 for 2 socks of different color`() {
        expect(1) { sockMerchant(2, arrayOf(1, 1)) }
    }

    @Test
    fun `should return 3 for example`() {
        expect(3) { sockMerchant(9, arrayOf(10, 20, 20, 10, 10, 30, 50, 10, 20)) }
    }

}