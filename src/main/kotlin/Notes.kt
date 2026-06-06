

//println("Please Enter a Number: ")
//val input = readln()
//val result = try {
//    input.toInt()           // attempt this
//} catch (e: NumberFormatException) {
//    println("Not a number: ${e.message}")
//    0                       // fallback value — try is an EXPRESSION in Kotlin
//} catch (e: Exception) {
//    println("Unexpected: ${e.message}")
//    -1
//} finally {
//    println("This ALWAYS runs, even if exception thrown")
//}
//    println("Please Enter a Number: ")
//    val input = readln()
//    val inputAsInteger = input.toIntOrNull()
//
//   if (inputAsInteger != null) {
//      val output = if (inputAsInteger.rem(2) == 0){
//          "Your Number is Even."
//      }else if (inputAsInteger > 10){
//          "Your number is Odd, and over 10"
//      }else {
//          "Your number is Odd, and less than 10"
//      }
//       println(output)
//   }else{
//       println("Please Type in a number.")
//   }



//    val is for no change like const and var is for change like let
//    var x: Int = 5
//    val y: Boolean = true
//    val z: String = "Sean"
//    var a: Double = 5.12
//    val b: Float = 5.555F
//    //a = 5;
//    x = 6;
//    var c = "First Line"
//    c = "Overrided"
//    println(c)
//
//    //&& is for and comparison || for or
//    val isBothTrue = x % 2 == 0 && (a % 2).toInt() == 0
//    val isEitherOrEven = x % 2 == 0 || (a % 2).toInt() == 0
//
//    println(isBothTrue)
//    println(isEitherOrEven)
//    println("Is Both a even number? $isBothTrue")
//    // $ or ${}
//
////
////
////    println("Is x an even number? ${x % 2 == 0}")
////
//////    val areNumberTheSame = x.toDouble() == a;
//////
//////    println(areNumberTheSame)
////
////    println(x)
////    println(y)
////    println(z)
////    println(a)
////    println(b)
//
//
//
//    println("Please Enter a Number")
//    //val input = readln().toInt()
//    //val input = readln().toIntOrNull() ?: 0 // it takes the 0 if the input is null and not a Int
//    val input = readln().toIntOrNull()
//
//    val isEven = input?.rem(2)?.equals(0) //rem is remainder
//    println("is your number even? $isEven " + "your number was $input")



//    if (inputAsInteger != null) {
//        val output = when {
//            inputAsInteger.rem(2) == 0 -> "The number is even"
//            inputAsInteger < 10 -> "The number is odd and less than 10"
//            else -> "The number is odd and greater than 10"
//        }
//        println(output)
//    }

//    if (inputAsInteger != null) {
//val output = when (inputAsInteger) {
//    null -> "Enter a valid number please."
//    3 -> "Number is 3"
//    5 -> "Number is 5"
//    in 10..20 -> "Number is between 10 and 20"
//    else -> "The number is odd and at least 11"
//}
////        }
////        println(output)
////    } else {
////        println("Please Enter a Number.")
////    }
//println(output)

//
//// ARRAY — mutable elements, fixed size
//val arr = arrayOf(1, 2, 3)
//arr[0] = 10              // ✅ change element
//// arr.add(4)            // ❌ can't resize
//
//// LIST — immutable (read only)
//val list = listOf(1, 2, 3)
//// list[0] = 10          // ❌ can't change
//// list.add(4)           // ❌ can't add
//
//// MUTABLE LIST — change and resize
//val mList = mutableListOf(1, 2, 3)
//mList[0] = 10            // ✅
//mList.add(4)             // ✅ now [10, 2, 3, 4]
//
//// MAP — immutable (Python dict equivalent)
//val map = mapOf("name" to "Sean", "age" to 25)
//// map["name"] = "other" // ❌ can't change
//
//// MUTABLE MAP
//val mMap = mutableMapOf("name" to "Sean")
//mMap["name"] = "other"   // ✅
//mMap["city"] = "Houston" // ✅ add new key
//
//// SET — unique values only, immutable
//val set = setOf(1, 2, 2, 3)   // stores {1, 2, 3}
//
//// MUTABLE SET
//val mSet = mutableSetOf(1, 2, 3)
//mSet.add(4)              // ✅
//mSet.add(2)              // no-op, already exists
//
////    When to Use What
////
////    listOf — default choice when you just need a collection to read from
////    mutableListOf — when you're building up a list dynamically
////    arrayOf — rare in app code, more common in interop with Java or performance-sensitive code
////    mapOf — config, lookup tables, API response parsing
////    mutableMapOf — building up key-value data on the fly
////    setOf — when uniqueness matters (deduplication)


//val numbersList = mutableListOf<Int>()
//var i = 0
//while (i < userNumber) {
//    println("Please Enter a number ${i + 1}")
//    val number = readln().toIntOrNull()
//    if (number != null) {
//        numbersList.add(number)
//        i++
//    }
//    println("Numbers: $numbersList")

    //    repeat(userNumber) { index ->
//        println("Enter number ${index + 1}:")
//        val number = readln().toIntOrNull()
//        if (number != null) {
//            numbersList.add(number)
//        }
//    }
//
//    println("Numbers: $numbersList")

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

//
//do {
//    println("Enter a Number: ")
//    val input = readln().toIntOrNull()
//    println("Your number is $input")
//} while (input == null)
//
//val list = listOf("Sean", "John", "Mike")
//list.forEachIndexed { index, name ->
//    println("$index: $name")
//}
//
//val map = mapOf("name" to "Sean", "City" to "Houston", "Job" to "Affirm")
//for((key, value) in map){
//    println("$key = $value")
//}

//    val results = mutableListOf<Int>()
//    val numbers = listOf(1, 2, 3)
//    for (number in numbers) {
//        val result = number * number
//        results.add(result)
//    }
//    println(results)
//println("Enter a string")
//val input = readln()
////Reversing String
//val finalString = buildString {
//    for (i in input.lastIndex downTo  0) {
//        append(input[i])
//    }
//}
//println(finalString)
//
//Mostly in Java interop — Java doesn't have default parameters so Kotlin code that needs to be callable from Java uses @JvmOverloads:
//kotlin@JvmOverloads
//fun processPayment(
//    amount: Int,
//    currency: String = "USD",
//    userId: String = "guest"
//) { }
