package com.leetcode

fun longestPalindromicSubstring(s: String): String {
    var longuest = ""
    var window = ""
    for(startRange in s.indices) {
        for (endRange in startRange until s.length) {
            window = s.substring(startRange..endRange)
            if(window.length < longuest.length) {
                break
            }
            if (window.length > longuest.length &&  window == window.reversed()) {
                longuest = window
            }
        }
    }
    return longuest
}