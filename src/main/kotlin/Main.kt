


fun main() {

//    val is for no change like const and var is for change like let
    var x: Int = 5
    val y: Boolean = true
    val z: String = "Sean"
    var a: Double = 5.12
    val b: Float = 5.555F
    //a = 5;
    x = 6;
    var c = "First Line"
    c = "Overrided"
    println(c)

    //&& is for and comparison || for or
    val isBothTrue = x % 2 == 0 && (a % 2).toInt() == 0
    val isEitherOrEven = x % 2 == 0 || (a % 2).toInt() == 0

    println(isBothTrue)
    println(isEitherOrEven)
    println("Is Both a even number? $isBothTrue")
    // $ or ${}

//
//
//    println("Is x an even number? ${x % 2 == 0}")
//
////    val areNumberTheSame = x.toDouble() == a;
////
////    println(areNumberTheSame)
//
//    println(x)
//    println(y)
//    println(z)
//    println(a)
//    println(b)
}