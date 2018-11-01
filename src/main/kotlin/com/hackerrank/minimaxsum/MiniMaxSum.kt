package com.hackerrank.minimaxsum

fun miniMaxSum(input: List<Int>) = input.sorted().map { it.toLong() }.let {
    listOf(
        it.asSequence().take(4).sum(), it.takeLast(4).sum()
    )
}.joinToString(" ").also(::print)


fun main(args: Array<String>) {
    miniMaxSum(readLine()!!.split(' ').map { it.toInt() })
}
