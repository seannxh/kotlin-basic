import jdk.internal.org.jline.utils.AttributedStringBuilder.append

fun main() {
//    val results = mutableListOf<Int>()
//    val numbers = listOf(1, 2, 3)
//    for (number in numbers) {
//        val result = number * number
//        results.add(result)
//    }
//    println(results)
    println("Enter a string")
    val input = readln()
    //Reversing String
    val finalString = buildString {
        for (i in input.lastIndex downTo  0) {
            append(input[i])
        }
    }
    println(finalString)
}
