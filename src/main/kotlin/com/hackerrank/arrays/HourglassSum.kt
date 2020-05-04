package com.hackerrank.arrays

fun hourglassSum(array: Array<Array<Int>>): Int {
    val hourglass: Array<Array<Int>> =
        arrayOf(arrayOf(0, 0), arrayOf(0, 1), arrayOf(0, 2), arrayOf(1, 1), arrayOf(2, 0), arrayOf(2, 1), arrayOf(2, 2))

    return (0..3).flatMap { row ->
        (0..3).map { col ->
            hourglass.fold(0) { acc, next ->
                acc + array[next[0] + row][next[1] + col]
            }
        }
    }.max() ?: 0
}