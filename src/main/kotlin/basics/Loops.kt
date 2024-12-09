package org.example.basics

fun main(){
    // For Loops
    // Either use until or .. both mean the same

    for (i in 0 until 10){ // in until the last number is excluded
        println(i)
    }

    println()

    for (i in 0..10){ // in .. the last number is included
        println(i)
    }

    println()

    // opposite range
    for (i in 10 downTo 1){
        println(i)
    }

    println("For Loop End")
    println()

    // While Loops
    var count = 1
    while (count<=10){
        println("Count $count")
        count++
    }

    println("While Loop End")
    println()

    // Do While Loops
    var number = 1
    do {
        println("Number $number")
        number++
    }while (number<10)

    println("Do-While Loop End")
    println()
}