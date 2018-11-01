package com.hackerrank.staircase

class StairCase {
    fun stairCase(n: Int) = (n downTo 1).joinToString("\n") {
        (1 until it).joinToString("") {" "} + (it .. n).joinToString(""){"#"}
    }


}

fun main(args: Array<String>) {
    println(IntRange(1, 2).joinToString { "#" })
}
