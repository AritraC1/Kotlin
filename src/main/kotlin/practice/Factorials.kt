package org.example.practice

// Write a function that computes the factorial of a number
fun main(){
    val num: Int = readln().toInt()
    val ans = factorial(num)
    println("The factorial $num = $ans")
}

fun factorial(num: Int): Int {

    // base case
    if (num == 0 || num == 1) return 1

    return num * factorial(num - 1)

    // Iterative Approach
    /*
    var ans = 1

    // Iteratively calculate the factorial
    for (i in 1..num) {
        ans *= i
    }

    return ans
    */
}