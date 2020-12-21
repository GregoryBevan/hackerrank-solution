package com.leetcode


fun lengthOfLongestSubstring(s: String): Int {
    if(s.length < 2) {
        return s.length
    }
    var longest = 0;
    val window = mutableListOf<Char>();

    for (rightWindow in s.indices) {
        if (window.contains(s[rightWindow]) || window.toSet().size != window.size) {
            window.add(s[rightWindow])
            window.removeAt(0)
            continue
        }
        window.add(s[rightWindow])

        longest = maxOf(longest, window.size)
    }

    return longest
}

//fun lengthOfLongestSubstring(s: String): Int {
//    var max = 0
//    var startRange = 0
//
//    for(endRange in s.indices) {
//        val window = s.substring(startRange..endRange)
//        if(window.toSet().size == window.length) {
//            max = window.length
//            continue
//        }
//        if((s.length - startRange) < max) {
//            break;
//        }
//        startRange++
//    }
//    return max
//}