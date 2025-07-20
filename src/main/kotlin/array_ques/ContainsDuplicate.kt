package array_ques

/**
 * Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.
 * Input: nums = [1, 2, 3, 3]
 * Output: true
 *
 * Input: nums = [1, 2, 3, 4]
 * Output: false
 */

//Brute force - TC O(n`2) and SC O(1)

fun hasDuplicateBrute(nums: IntArray): Boolean {
    for (i in nums.indices) {
        for (j in i + 1 until nums.size) {
            if (nums[i] == nums[j]) {
                return true
            }
        }
    }
    return false
}

// optimized we are using HashSet here

fun hasDuplicateOptimize(nums: IntArray): Boolean {
    val seen = HashSet<Int>()
    for (i in nums.indices) {
        if (i in seen) {
            return true
        }
        seen.add(i)
    }
    return false
}
