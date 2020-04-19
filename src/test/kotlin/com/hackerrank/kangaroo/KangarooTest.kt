package com.hackerrank.kangaroo

import kotlin.test.Test
import kotlin.test.expect

class KangarooTest {

    @Test
    fun `shoud be NO when x1 and v1 are greater than x2 and v2`() {
        expect("NO") { kangaroo(2, 2, 1, 1) }
    }


    @Test
    fun `shoud be NO when x1 and v1 are lesser than x2 and v2`() {
        expect("NO") { kangaroo(1, 1, 2, 2) }
    }

    @Test
    fun `shoud be NO`() {
        expect("NO") { kangaroo(21, 6, 47, 3) }
    }

    @Test
    fun `should return true for  0 3 4 2`() {
        expect(true) { hasCrossingPosition( 0, 3, 4, 2) }
    }



    @Test
    fun `should return true for 0 2 5 3`() {
        expect(false) { hasCrossingPosition(0, 2, 5, 3) }
    }

    @Test
    fun `should return false for 21 6 47 3`() {
        expect(false) { hasCrossingPosition(21, 6, 47, 3) }
    }
}
