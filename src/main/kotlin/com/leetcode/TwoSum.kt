package com.leetcode



fun twoSum(nums: IntArray, target: Int): IntArray {
    for (pos1 in nums.indices) {
        for (pos2 in (nums.size-1 downTo pos1 + 1)) {
            if (nums[pos1] + nums[pos2] == target) {
                return intArrayOf(pos1, pos2)
            }
        }
    }
    throw IllegalArgumentException("Impossible case")
}