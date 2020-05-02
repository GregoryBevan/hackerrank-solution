package com.hackerrank.warmup

fun jumpingOnClouds(c: Array<Int>): Int = c.foldIndexed(Pair(0, 0)) { index, acc, _ ->
    if (index == acc.first) {
        if (index + 2 < c.size && c[index + 2] == 0) {
            Pair(acc.first + 2, acc.second + 1)
        } else if (index + 1 < c.size && c[index + 1] == 0) {
            Pair(acc.first + 1, acc.second + 1)
        } else acc
    } else acc
}.second