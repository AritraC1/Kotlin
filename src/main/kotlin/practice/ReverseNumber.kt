package org.example.practice

fun main(){
    print("Enter number = ")
    var number: Int = readln().toInt()
    println("Reverse number = ${reverseNumber(number)}")
}

fun reverseNumber(num: Int): Int {
    var rev: Int = 0
    var temp = num

    while (temp != 0){
        val digit = temp % 10 // % or modulo is used for checking divisibility or for extracting the last digit of any number or generating random numbers within a range
        rev = (rev * 10) + digit
        temp = temp/10
    }
    return rev
}