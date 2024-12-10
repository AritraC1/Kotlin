package org.example.basics

fun main(){
    print("Enter value 1 = ")
    var a: Int = readln().toInt()
    print("Enter value 2 = ")
    var b: Int = readln().toInt()

    println(ops(a,b))
}

fun ops(a: Int, b: Int) {
    var num1: Int = a
    var num2: Int = b

    println()
    println("Arithmetic Operators")

    // Arithmetic Operators
    println("Addition: ${a+b}")
    println("Subtraction: ${a-b}")
    println("Multiplication: ${a*b}")
    println("Division: ${a/b}")
    println("Modulus: ${a%b}")// prints remainder

    println()
    println("Increment Decrement")

    // Increment Decrement
    num1++
    println("Increment: ${num1}")
    num2--
    println("Decrement: ${num2}")

    println()
    println("Comparison Operator")

    // Comparison Operator
    println(a==b)
    println(a!=b)
    println(a<b)
    println(a<=b)
    println(a>b)
    println(a>=b)

    println()
    println("Logical Operator")

    // Logical Operator
    val x: Boolean = true
    val y: Boolean = false

    if (x == true && y == false) println(true)
    if (x == true || y == false) println(true)
    if (x != false) println(true)
}
