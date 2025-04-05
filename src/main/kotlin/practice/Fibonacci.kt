package org.example.practice

// To print the nth Fibonacci number
fun main(){
    val n: Int = readln().toInt()

    val num = fibNum(n)
    println("The fibonacci number at $n is $num")

}

fun fibNum(n: Int): Int {

    // Base Case
    if (n == 0) return 0
    if (n == 1) return 1

    var a = 0
    var b = 1

    // Iterative Approach
    for (i in 2..n){
        val temp = a + b
        a = b
        b = temp
    }

    // Recursive Approach
    // return fibNum(n - 1) + fibNum(n - 2)

    return b
}