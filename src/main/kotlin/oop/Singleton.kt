package org.example.oop

// Singleton Class
// A singleton class ensures only one instance of the class exists throughout the application.
// This is typically achieved by restricting instance creation via a private constructor and a static method to access the instance.
object Singleton {
    var counter: Int = 0

    fun incrementCounter() {
        counter++
    }

    fun printCounter() {
        println("Counter: $counter")
    }
}

fun main() {
    // Accessing the Singleton class and its properties
    Singleton.incrementCounter()
    Singleton.printCounter()  // Output: Counter: 1

    Singleton.incrementCounter()
    Singleton.printCounter()  // Output: Counter: 2
}
