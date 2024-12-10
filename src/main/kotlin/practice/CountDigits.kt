package org.example.practice

fun main(){
    // Number input from user and count digits
    print("Enter number = ")
    var number: Int = readln().toInt()
    val userInput: Int = number
    var countDigit = 0

    while (number > 0){
        number = number / 10
        countDigit++
    }

    println("Number of digits in $userInput is = $countDigit")
}