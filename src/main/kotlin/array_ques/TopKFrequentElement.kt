package array_ques

/**
 * Input: nums = [1,2,2,3,3,3], k = 2
 * Output: [2,3]
 */
fun main() {
    val input = intArrayOf(1,2,1,2,1,2,3,1,3,2)
    topKFrequent(input, 2).forEach {
        println(it)
    }
}

fun topKFrequent(nums: IntArray, k: Int): IntArray {
    val numMap = mutableMapOf<Int, Int>()
    val output = mutableListOf<Int>()

    for (i in nums.indices) {
        numMap[nums[i]] = numMap.getOrDefault(nums[i], 0) + 1
    }
    val sorted = numMap.entries.sortedByDescending { it.value }
    for (i in 0 until k) {
        output.add(sorted[i].key)
    }

    return output.toIntArray()
}