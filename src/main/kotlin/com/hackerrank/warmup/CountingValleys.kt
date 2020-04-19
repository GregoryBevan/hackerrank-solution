package com.hackerrank.warmup


fun countingValleys(n: Int, s: String): Int = s.fold(Pair(0, 0)) { acc, next ->
    if (next == 'D') Pair(acc.first - 1, if (acc.first == 0) acc.second + 1 else acc.second)
    else Pair(acc.first + 1, acc.second) }.second;
