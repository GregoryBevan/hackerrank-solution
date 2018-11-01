package com.hackerrank.tripletcomparison

class TripletComparison {
    fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<out Int> {
        return a.withIndex().map { (index, value) ->
            when {
                value > b[index] -> arrayOf(1, 0)
                value < b[index] -> arrayOf(0, 1)
                else -> arrayOf(0, 0)
            }
        }.fold(arrayOf(0,0)) { result: Array<Int>, ints -> arrayOf(result[0] + ints[0], result[1] + ints[1]) }
    }
}

fun main(args: Array<String>) {
    val a = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val b = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = TripletComparison().compareTriplets(a, b)

    println(result.joinToString(" "))
}
