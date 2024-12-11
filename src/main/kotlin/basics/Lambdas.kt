package org.example.basics

fun main() {
    // A lambda in Kotlin is a concise way to define an anonymous function, usually passed as an argument to higher-order functions. It allows you to express functionality in a more compact form using {} syntax.
    // The function that takes another function as parameter or return another function is called Higher Order Function

    val sum: (Int, Int) -> Int = { a, b -> a + b }
    println(sum(5, 2))

    println()

    cube(3){
        println(it)
    }

    val square = { x: Int -> x * x }
    val addition = { x: Int, y: Int -> x + y}


    val myVar = {
        println("hi i am lambda")
        println("sum of a and b is ${245 + 25}")
    }

    myVar()
    println(square(3))
    println("Addition using lambda function ${addition(45, 23).toString()}")

    sumNNumbers(12, 23, 12, 12)
    name("Ash Ketchum")
}

fun cube(number: Int, callBack: (message: String) -> Unit){
    println("Cube is = ${number * number * number}")
    callBack("Cube Calculated")
}

fun sumTwoNumbers(
    number1: Int,
    number2: Int,
    callBack: () -> Unit
) {
    println("Sum of two numbers is ${number1 + number2}")
    callBack()
}

fun name(vararg names: String) {
    println(names::class.java.name)

}

fun sumNNumbers(vararg nums: Int) {
    var sum = 0
    for (value in nums) {
        println(value)
        sum += value
    }
    println("sum is $sum")
}