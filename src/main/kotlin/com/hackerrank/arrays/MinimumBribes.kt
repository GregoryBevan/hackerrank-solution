package com.hackerrank.arrays

import kotlin.math.max

fun minimumBribes(q: Array<Int>): String {

    val finalQueueState = q.map { it - 1 }
    var bribes = 0

    for (personWithIndex in finalQueueState.withIndex()) {
        if (personWithIndex.value - personWithIndex.index > 2) return "Too chaotic"
        for (currentIndex in (max(personWithIndex.value - 1, 0)..personWithIndex.index)) {
            if (finalQueueState[currentIndex] > personWithIndex.value) bribes += 1
        }
    }
    return bribes.toString()
}