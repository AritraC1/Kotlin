package org.example.oop

class Modifiers {
    private var userName:String=""
    private  fun display()
    {
        println(userName)
    }

    fun display2()
    {
        println(userName)
        display()
    }
}

fun main() {
    val example = Modifiers()
    println(example)
}