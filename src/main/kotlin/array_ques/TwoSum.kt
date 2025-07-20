package array_ques

//brute force TC - O(n`2)

fun twoSumBF(nums: IntArray, target: Int): IntArray {
    var resultArray = IntArray(2)
    for (i in nums.indices) {
        for (j in i + 1 until nums.size) {
            if (nums[i] + nums[j] == target) {
                resultArray[0] = i
                resultArray[1] = j
                return resultArray
            }
        }
    }
    return intArrayOf()
}

// two optimize approach TC - O(n)
fun twoSumOptimize(nums: IntArray, target: Int): IntArray {
    val sumMap = mutableMapOf<Int, Int>()
    for (i in nums.indices) {
        val num = target - nums[i]
        if (sumMap.containsKey(num)) {
            return intArrayOf(sumMap[num]!!, i)
        }
        sumMap[nums[i]] = i
    }
    return intArrayOf()
}