package org.example.basics

import java.util.ArrayList as List // as is used for Alias

interface inter<in T>{
    // T is only consumed never produced
    fun display(value: T)
}

interface inter2<out T>{
    fun display()
}

fun main() {
    val a: Any = "1234"

    // Keywords

    //val strA: String = a.toString()
    val strA: String = a as String
    println(strA)

    val list = List<String>()

    list.add("Mango")
    list.add("Grapes")
    list.add("Banana")
    list.add("Apple")
    println(list)

    println(list::class.java.name)

    // in

    for (i in list){
        println(i)
    }
}