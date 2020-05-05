package com.hackerrank.arrays

fun rotLeft(a: Array<Int>, d: Int): Array<Int> {
    val toMutableList = a.filterIndexed{ index, _ -> index >= d }.toMutableList()
    toMutableList.addAll(a.take(d))
    return toMutableList.toTypedArray()
}