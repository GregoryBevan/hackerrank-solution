package com.leetcode

import kotlin.test.Test
import kotlin.test.expect

class AddTwoNumbers2Test {

    @Test
    fun `1 + 1`() {
        expect(ListNode(2)) { addTwoNumbers2(ListNode(1), ListNode(1)) }
    }

    @Test
    fun `12 + 23`() {
        expect(ListNode(3, ListNode(5))) { addTwoNumbers2(ListNode(1, ListNode(2)), ListNode(2, ListNode(3))) }
    }

    @Test
    fun `92 + 23`() {
        expect(ListNode(1, ListNode(6))) { addTwoNumbers2(ListNode(9, ListNode(2)), ListNode(2, ListNode(3))) }
    }

    @Test
    fun `243 + 564`() {
        expect(ListNode(7, ListNode(0, ListNode(8)))) { addTwoNumbers2(ListNode(2, ListNode(4, ListNode(3))), ListNode(5, ListNode(6, ListNode(4)))) }
    }

    @Test
    fun `243 + 1564`() {
        expect(ListNode(3, ListNode(9, ListNode(9, ListNode(4))))) { addTwoNumbers2(ListNode(2, ListNode(4, ListNode(3))), ListNode(1, ListNode(5, ListNode(6, ListNode(4))))) }
    }

    @Test
    fun `9999999 + 9999`() {
        expect(ListNode(8, ListNode(9, ListNode(9,ListNode(9,ListNode(0,ListNode(0,ListNode(0,ListNode(1))))))))) {
            addTwoNumbers2(ListNode(9, ListNode(9, ListNode(9, ListNode(9, ListNode(9, ListNode(9, ListNode(9))))))), ListNode(9, ListNode(9, ListNode(9, ListNode(9)))))
        }
    }
}