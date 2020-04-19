package com.hackerrank.betweentwosets


fun getTotalX(a: Array<Int>, b: Array<Int>): Int {
    val start = a.max() ?: 0
    val end = b.min() ?: 0

    return (start..end).filter {
        divisibleByAlla(it, a) && multipleOfAllB(it, b)
    }.size
}

fun divisibleByAlla(current: Int, a: Array<Int>) = a.filter { current % it != 0 }.size === 0

fun multipleOfAllB(current: Int, b: Array<Int>) = b.filter { it % current != 0 }.size === 0