package array_ques

/**
 *
 */
fun main() {
    val encode = listOf("leet", "code", "123")
    val sb = StringBuilder()
    for (str in encode) {
        sb.append(str.length).append('#').append(str)
    }

    println(decodeString(sb.toString()).toList())
}

fun decodeString(s: String): List<String> {
    val result = mutableListOf<String>()
    var i = 0
    while (i < s.length) {
        var j = i
        while (s[j] != '#') {
            j++
        }
        val length = s.substring(i, j).toInt()
        val str = s.substring(j + 1, j + 1 + length)
        result.add(str)
        i = j + 1 + length
    }
    return result.toList()
}