package com.hackerrank.timeconversion

import java.time.LocalTime
import java.time.format.DateTimeFormatter


fun timeConversion(time: String): String =
    LocalTime.parse(time, DateTimeFormatter.ofPattern("hh:mm:ssa")).format(DateTimeFormatter.ISO_TIME)

fun main(args: Array<String>) {
    LocalTime.parse(readLine()!!, DateTimeFormatter.ofPattern("hh:mm:ssa")).format(DateTimeFormatter.ISO_TIME).also(::print)
}

