package org.example.basics

fun main(){
    // For Loops
    // Either use until or .. both mean the same

    for (i in 0 until 10){
        println(i)
    }

    println()

    for (i in 0..10){
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