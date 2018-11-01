package com.hackerrank.appleandorange

fun countApplesAndOranges(s: Int, t: Int, a: Int, b: Int, apples: Array<Int>, oranges: Array<Int>)=
    arrayOf(apples.map { a + it }.filter { it in s..t }.count(),
        oranges.map { b + it }.filter { it in s..t }.count()).joinToString("\n")