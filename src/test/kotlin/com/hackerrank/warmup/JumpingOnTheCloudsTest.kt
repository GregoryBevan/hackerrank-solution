package com.hackerrank.warmup

import org.junit.jupiter.api.Test
import kotlin.test.expect

class JumpingOnTheCloudsTest {

    @Test
    fun `should find 1 jump for minimal {0,0} path`() {
        expect(1) { jumpingOnClouds(arrayOf(0, 0)) }
    }

    @Test
    fun `should find 1 jump for {0,0,0} path`() {
        expect(1) { jumpingOnClouds(arrayOf(0, 0, 0)) }
    }

    @Test
    fun `should find 2 jump for {0,0,0,0} path`() {
        expect(2) { jumpingOnClouds(arrayOf(0, 0, 0, 0)) }
    }

    @Test
    fun `should find 4 jump for {0, 0, 1, 0, 0, 1, 0} path`() {
        expect(4) { jumpingOnClouds(arrayOf(0, 0, 1, 0, 0, 1, 0)) }
    }

    @Test
    fun `should find 3 jump for {0, 0, 0, 0, 1, 0} path`() {
        expect(3) { jumpingOnClouds(arrayOf(0, 0, 0, 0, 1, 0)) }
    }

    @Test
    fun `should find 53 jump for path`() {
        expect(53) { jumpingOnClouds(arrayOf(0,1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0)) }
    }
}