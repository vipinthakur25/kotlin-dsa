package array_ques

//brute force TC - O(nlogn)

fun isValidAnagram(s: String, t: String): Boolean {
    if (s.length != t.length) {
        return false
    }
    val str1 = s.toCharArray().sorted()
    val str2 = t.toCharArray().sorted()
    if (str1 == str2) {
        return true
    }
    return false
}

// optimized wat TC - O(n) each character is proceeds once
fun isValidAnagramOptimized(s: String, t: String): Boolean {
    if (s.length != t.length) {
        return false
    }
    val countS = mutableMapOf<Char, Int>()
    val countT = mutableMapOf<Char, Int>()
    for (i in s.indices) {
        countS[s[i]] = countS.getOrDefault(s[i], 0) + 1
        countT[t[i]] = countT.getOrDefault(t[i], 0) + 1
    }

    return countS == countT
}