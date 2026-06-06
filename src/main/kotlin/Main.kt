fun main() {
    println("How many numbers?")
    val userNumber = readln().toIntOrNull() ?: run {
        println("Invalid input")
        return
    }

    val numbersList = mutableListOf<Int>()
    var i = 0
    while (i < userNumber) {
        println("Please Enter a number ${i + 1}")
        val number = readln().toIntOrNull()
        if (number != null) {
            numbersList.add(number)
            i++
        }
        println("Numbers: $numbersList")
    }
//    repeat(userNumber) { index ->
//        println("Enter number ${index + 1}:")
//        val number = readln().toIntOrNull()
//        if (number != null) {
//            numbersList.add(number)
//        }
//    }
//
//    println("Numbers: $numbersList")
}