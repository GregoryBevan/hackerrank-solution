package com.hackerrank.arrays

import kotlin.test.Test
import kotlin.test.expect

class MinimumBribesTest {

    @Test
    fun `for 1 person in the queue, 0 bribe`() {
        expect("0") { minimumBribes(arrayOf(1))}
    }

    @Test
    fun `for 2 person in the queue in same order 0 bribe`() {
        expect("0") { minimumBribes(arrayOf(1, 2))}
    }

    @Test
    fun `for 2 person in the queue order changed 1 bribe`() {
        expect("1") { minimumBribes(arrayOf(2, 1))}
    }

    @Test
    fun `for 3 person in the queue order changed 0 bribe`() {
        expect("0") { minimumBribes(arrayOf(1, 2, 3))}
    }

    @Test
    fun `for 3 person in the queue order changed 1 bribe`() {
        expect("1") { minimumBribes(arrayOf(1, 3, 2))}
    }

    @Test
    fun `for 3 person in the queue order changed 2 bribes`() {
        expect("2") { minimumBribes(arrayOf(3, 1, 2))}
    }

    @Test
    fun `2 1 5 3 4`() {
        expect("3") { minimumBribes(arrayOf(2, 1, 5, 3, 4))}
    }

    @Test
    fun `2 5 1 3 4`() {
        expect("Too chaotic") { minimumBribes(arrayOf(2, 5, 1, 3, 4))}
    }

    @Test
    fun `5 1 2 3 7 8 6 4`() {
        expect("Too chaotic") { minimumBribes(arrayOf(5, 1, 2, 3, 7, 8, 6, 4))}
    }

    @Test
    fun `1 2 5 3 7 8 6 4`() {
        expect("7") { minimumBribes(arrayOf(1, 2, 5, 3, 7, 8, 6, 4))}
    }
}