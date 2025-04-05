package org.example.practice

fun main(){
    print("Enter number = ")
    var number: Int = readln().toInt()
    println("Sum of the cube of the digits = ${cubeSum(number)}")
}

fun cubeSum(num: Int): Int {
    var sum = 0
    var temp: Int = num

    while(temp != 0){
        val digit = temp % 10
        sum = sum + (digit * digit * digit)
        temp = temp / 10
    }

    return sum
}
