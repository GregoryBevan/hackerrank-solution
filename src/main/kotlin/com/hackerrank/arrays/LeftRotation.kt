package com.hackerrank.arrays

import java.util.*

fun rotLeft(a: Array<Int>, d: Int): Array<Int> {
    val toMutableList = a.filterIndexed{ index, _ -> index >= d }.toMutableList()
    toMutableList.addAll(a.take(d))
    return toMutableList.toTypedArray()
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val nd = scan.nextLine().split(" ")

    val n = nd[0].trim().toInt()

    val d = nd[1].trim().toInt()

    val a = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    println(rotLeft(a, d).joinToString(" "))
}