package com.hackerrank.warmup

fun sockMerchant(n: Int, ar: Array<Int>): Int = ar.groupBy { it }.values.map{ it.size  / 2 }.sum();
