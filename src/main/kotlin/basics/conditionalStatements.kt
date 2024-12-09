package org.example.basics

fun main(){

    // Odd Even
    print("Enter number = ")
    val num: Int = readln().toInt()

    // Various Methods to write if else

    // Method 1
    if (num%2 == 0) {
        println("Even")
    }
    else {
        println("Odd")
    }

    // Method 2: Inverted If condition
    if (num%2 != 0) {
        println("Odd")
    } else {
        println("Even")
    }

    // Method 3
    println(
        if (num % 2 == 0) {
            "Even"
        } else {
            "Odd"
        }
    )

    // Method 4
    if (num%2 == 0) println("Even")
    else println("Odd")

    // Method 5: Using When
    when {
        num%2 == 0 -> {
            println("Even")
        }
        else -> {
            println("Odd")
        }
    }
}