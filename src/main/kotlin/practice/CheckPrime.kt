package org.example.practice

fun main(){
    print("Enter number = ")
    var number: Int = readln().toInt()

    println(checkPrime(number))
}

fun checkPrime(num: Int): Boolean {
    var c = 2

    if (num <= 1) return false

    while(c * c < num){
        if (num % c == 0) {
            return false
        }
        c++
    }
    return true
}
