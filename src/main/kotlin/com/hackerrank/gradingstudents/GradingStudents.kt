package com.hackerrank.gradingstudents


fun gradingStudents(grades: List<Int>) = grades.map {
    when {
        it in 38..100 && it.rem(5) in 3..4 -> it.div(5).times(5) + 5
        else -> it
    }
}

fun main(args: Array<String>) {
    (1..readLine()!!.trim().toInt())
        .map{ readLine()!!.trim().toInt() }
        .let(::gradingStudents)
        .joinToString("\n")
        .also(::print)
}