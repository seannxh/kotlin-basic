import jdk.internal.org.jline.utils.AttributedStringBuilder.append

fun main() {
    println("Enter a string")
    val input = readln()
    //Reversing String
    //Named parameters
    val reversed = input.reversed()

    if (input == reversed){
        println("Its a Palindrome!")
    }

    println("Enter a Number you want to reverse: ")
    val input2 = readln().toInt()
    val reversedNumber = input2.reversed()
    val result = reversedNumber + input2
    println(result)
}


//fun reversed(stringInput: String){
//    val finalString = buildString {
//        for (i in stringInput.lastIndex downTo  0) {
//            append(stringInput[i])
//        }
//    }
//    println(finalString)
//}

//this@reversed says — "I mean the this from the reversed function, not the inner one".
//The @reversed is a label pointing to the outer scope.

fun String.reversed() : String {
    val finalString = buildString {
        for(i in this@reversed.lastIndex downTo 0){
            append(this@reversed[i])
        }
    }
    return finalString
}

fun Int.reversed(): Int {
    return this.toString().reversed().toInt()
}