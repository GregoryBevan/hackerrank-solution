package com.hackerrank.warmup

fun repeatedString(s: String, n: Long) = n / s.length.toLong() * s.filter { it == 'a' }.length.toLong() +
        s.filterIndexed { index, c -> c == 'a' && index < n.rem(s.length.toLong()) }.length.toLong()


