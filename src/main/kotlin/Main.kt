fun main() {
//    println("How many numbers?")
//    val userNumber = readln().toIntOrNull() ?: run {
//        println("Invalid input")
//        return
//    }
//
//    for (i in 1..5) {
//        println("Numbers $i")
//    }
//
//    val list = mutableListOf<Int>()
//
//    for (i in 1..5){list.add(i)}
//
//    list.forEach {println(it * 2)}
//
//    repeat(3) { index ->
//        list.add(index * 3)
//    }
//    println(list.joinToString(" | "))


    do {
        println("Enter a Number: ")
        val input = readln().toIntOrNull()
        println("Your number is $input")
    } while (input == null)

    val list = listOf("Sean", "John", "Mike")
    list.forEachIndexed { index, name ->
        println("$index: $name")
    }

    val map = mapOf("name" to "Sean", "City" to "Houston", "Job" to "Affirm")
    for((key, value) in map){
        println("$key = $value")
    }

}
