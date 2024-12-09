// Variables and Data Types

package org.example.basics

fun main(){

    // Type inference: Type inference in Kotlin refers to the ability of the Kotlin compiler to automatically determine the type of variable or expression based on the value it is assigned or returned from a function

    var name = "Tony Stark"
    println(name)

    val userId = 2424
    println(userId)

    // Val vs Var

    /*
        * Use val when you want to ensure that the reference to the variable cannot change i.e. it cannot be reassigned to a different value. (Immutable Reference)
        * Use var (stands for variable) when you need to be able to reassign the variable. (Mutable Reference)
    */

    // String interpolation using '$'
    println("I am $name")

    var a = 10
    var b = 20
    println("Before: The sum of $a and $b is ${a+b}")

    a = 50
    b = 40
    println("After: The sum of $a and $b is ${a+b}")

    // Explicitly specify the type
    // var nameOfVariable: Data Type = Value Of Variable

    var age: Int = 500
    var fullName: String = "Thor"
    println("I am $fullName, I am $age years old")

    // Data Types
//    val num1: Int = 1
//    val num2: Byte = 12
//    val num3: Short = 56
//    val num4: Long = 4567890876543
//    val num5: Float = 45.6f
//    val num6: Double = 67.8
//    val ch: Char = 'a'
//    val truth: Boolean = true // or false
//    val name1: String = "Steve Rogers"

    // Arrays
    // val fruits: Array<String> = arrayOf("Banana", "Mango", "Apple", "Grapes")
}