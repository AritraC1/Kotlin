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
}

fun cube(number: Int, callBack: (message: String) -> Unit){
    println("Cube is = ${number * number * number}")
    callBack("Cube Calculated")
}