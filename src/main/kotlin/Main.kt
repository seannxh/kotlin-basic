


fun main() {
    println("Please Enter a Number: ")
    val input = readln()
    val inputAsInteger = input.toIntOrNull()

//    if (inputAsInteger != null) {
//        val output = when {
//            inputAsInteger.rem(2) == 0 -> "The number is even"
//            inputAsInteger < 10 -> "The number is odd and less than 10"
//            else -> "The number is odd and greater than 10"
//        }
//        println(output)
//    }

//    if (inputAsInteger != null) {
    val output = when (inputAsInteger) {
        null -> "Enter a valid number please."
        3 -> "Number is 3"
        5 -> "Number is 5"
        in 10..20 -> "Number is between 10 and 20"
        else -> "The number is odd and at least 11"
    }
//        }
//        println(output)
//    } else {
//        println("Please Enter a Number.")
//    }
    println(output)
}
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