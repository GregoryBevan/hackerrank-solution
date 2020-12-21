package com.leetcode

fun addTwoNumbers2(l1: ListNode?, l2: ListNode?): ListNode? {
    var currentL1 = l1?.`val`?:0
    var currentL2 = l2?.`val`?:0
    var nextL1 = l1?.next
    var nextL2 = l2?.next
    var carry = (currentL1 + currentL2) / 10
    val result = ListNode((currentL1+ currentL2) % 10)
    var currentListNode: ListNode? = result

    while(nextL1 != null || nextL2 != null || carry > 0) {
        currentL1 = (nextL1?.`val`?:0) + carry
        currentL2 = nextL2?.`val`?:0
        nextL1 = nextL1?.next
        nextL2 = nextL2?.next
        carry = (currentL1 + currentL2) / 10

        currentListNode?.next = ListNode((currentL1+ currentL2) % 10)
        currentListNode = currentListNode?.next
    }

    return result
}