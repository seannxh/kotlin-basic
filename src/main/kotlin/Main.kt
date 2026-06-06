import jdk.internal.org.jline.utils.AttributedStringBuilder.append
import java.util.function.Predicate

fun main() {
    println("Enter a String: ")
    val input = readln()

    val favoriteNumbers = intArrayOf(1, 2, 3, 69)
    val evenNumbers = favoriteNumbers.filter { it % 2 == 0 }
    val evenNumbers2 = favoriteNumbers.map{
        it * it
    }

    println(evenNumbers2)
    val lambda: (Char) -> Boolean = {
        it.isLetter()
    }
    val lettersOnly = input.myFilter{
        isLetter()
    }
    println(lettersOnly)
    println(evenNumbers)
}

fun String.myFilter(predicate: Char. () -> Boolean): String {

    return buildString {
        for(char in this@myFilter){
            if (predicate(char)){
                append(char)
            }
        }
    }
}