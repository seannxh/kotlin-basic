import jdk.internal.org.jline.utils.AttributedStringBuilder.append

fun main() {
    println("Enter a String: ")
    val input = readln()

    val lettersOnly = input.filter {it.isLetter()}
    println(lettersOnly)

    println("Enter the size of the array")
    var i = 0
    val input2 = readln().toIntOrNull() ?: 0
    val result = mutableListOf<Int>()
    while (i < input2) {
        println("What number do you want to add to the array?")
        val input3 = readln().toIntOrNull() ?: 0
        result.add(input3)
        i++

    }
    println(result.filter { it % 2 == 0 })
}