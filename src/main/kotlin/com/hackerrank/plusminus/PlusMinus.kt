package com.hackerrank.plusminus

import java.util.*

class PlusMinus {
    fun plusMinus(arr: Array<Int>) {
        arr.groupByTo(mutableMapOf("positive" to mutableListOf(), "negative" to mutableListOf(), "null" to mutableListOf())) {
            when {
                it > 0 -> "positive"
                it < 0 -> "negative"
                it == 0 -> "null"
                else -> throw Exception()
            }
        }.forEach {println(String.format(Locale.ENGLISH, "%.6f", it.value.count() / arr.size.toDouble())) }
    }
}
