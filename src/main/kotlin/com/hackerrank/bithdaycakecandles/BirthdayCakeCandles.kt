package com.hackerrank.bithdaycakecandles


fun birthdayCakeCandles(candles: List<Int>): Int {
    val maxHeight = candles.max()
    return candles.filter { it == maxHeight }.size
}