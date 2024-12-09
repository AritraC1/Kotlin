package org.example.basics

fun main(){
    var name = "Tony Stark"
    println(name)

    val userId = 2424
    println(userId)

    // Val vs Var

    /*
        * Use val when you want to ensure that the reference to the variable cannot change i.e. it cannot be reassigned to a different value. (Immutable Reference)
        * Use var (stands for variable) when you need to be able to reassign the variable. (Mutable Reference)
    */

    // String interpolation using '$'
    println("I am $name")

    var a = 10
    var b = 20
    println("Before: The sum of $a and $b is ${a+b}")

    a = 50
    b = 40
    println("After: The sum of $a and $b is ${a+b}")
}