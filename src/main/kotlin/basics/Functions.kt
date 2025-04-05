package org.example.basics

fun main() {
    println("Enter a string: ")
    val input = readln()
    // val inputAsInteger = input.toInt()

    val reverse = reversed(input)
    println(reverse)

    if (input == reverse) {
        println("Palindrome")
    }
    else {
        println("Not a palindrome")
    }

}

// Normal Functions
// A normal function in Kotlin is a function that is defined within a class, object, or as a standalone top-level function.
// It can be called like any regular function.
fun reversed(input: String): String{
    val finalString = buildString {
        for (i in input.lastIndex downTo 0) {
            append(input[i])
        }
    }

   // println(finalString)
    return finalString
}

// Extended Function (using '.' dot symbol)
// An extended function, or extension function, allows you to "add" new functionality to an existing class without modifying its source code.
// Extension functions are defined outside the class and are called like regular member functions.
fun String.reversed(): String {
    val finalString = buildString {
        for (i in this@reversed.lastIndex downTo 0) {
            append(this@reversed[i])
        }
    }

    return finalString
}

// Note: Extended Functions don’t actually modify the class itself but are syntactic sugar that allows for a cleaner and more concise way to work with existing classes.