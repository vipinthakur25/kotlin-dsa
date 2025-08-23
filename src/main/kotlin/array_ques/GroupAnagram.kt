package array_ques

/**
 *  TC = O(n Log K) where n is the length of the array an K is the size of the string
 */
fun giveGroupAnagram(strs: Array<String>): List<List<String>> {
    val outputMap = mutableMapOf<String, MutableList<String>>()
    for (i in strs.indices) {
        val uniqueKey = strs[i].toCharArray().sorted().joinToString("")
        if (outputMap.containsKey(uniqueKey)) {
            outputMap[uniqueKey]?.add(strs[i])
        } else {
            outputMap[uniqueKey] = mutableListOf(strs[i])
        }
    }
    return outputMap.values.toList()

}
