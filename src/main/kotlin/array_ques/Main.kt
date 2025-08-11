package array_ques

fun main(args: Array<String>) {
    // is duplicate
    /*val nums = intArrayOf(1,2,3,4)
    val result = hasDuplicateOptimize(nums)
    println(result)*/

    //is valid anagram
    //val result = isValidAnagramOptimized("carrace", "racecar")
    //println(result)

    //two sum
    /* val nums = intArrayOf(5,5)
     val result = twoSumOptimize(nums = nums, target = 10)
     println("result ${result.toList()} ")*/

    //group anagram

   // val strs = arrayOf("act", "pots", "tops", "cat", "stop", "hat")
    //val strs = arrayOf("x")
    val strs = arrayOf("")
    println(giveGroupAnagram(strs))
}