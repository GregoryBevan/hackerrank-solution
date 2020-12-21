package com.leetcode

data class ListNode(var `val`: Int, var next: ListNode? = null)

fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
    val vl1: Int = l1?.`val`?:0
    val vl2: Int = l2?.`val`?:0
    val carry = (vl1 + vl2) / 10
    return ListNode((vl1 + vl2) % 10, if(l1?.next != null || l2?.next != null || carry > 0 ) addTwoNumbers(l1?.next, l2?.next, carry) else null)
}

fun addTwoNumbers(l1: ListNode?, l2: ListNode?, carry: Int ): ListNode? {
    val vl1: Int = (l1?.`val`?:0) + carry
    val vl2: Int = l2?.`val`?:0
    val newCarry = (vl1 + vl2) / 10
    return ListNode((vl1 + vl2) % 10, if(l1?.next != null || l2?.next != null || newCarry > 0) addTwoNumbers(l1?.next, l2?.next, newCarry) else null)
}