package com.hackerrank.kangaroo

fun kangaroo(x1: Int, v1: Int, x2: Int, v2: Int) = when {
    x1 < x2 && v1 > v2 && hasCrossingPosition(x1, v1, x2, v2) -> "YES"
    else -> "NO"
}

fun hasCrossingPosition(x1: Int, v1: Int, x2: Int, v2: Int): Boolean {
    var pos1 = x1
    var pos2 = x2
    do {
        pos1 += v1
        pos2 += v2
        if(pos1 === pos2) return true
    } while (pos1 < pos2)
    return false
}