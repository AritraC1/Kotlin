package org.example.oop

// Enum class representing Days of the Week
enum class Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

fun main() {
    // Accessing enum constants
    val today = Day.MONDAY
    println("Today is: $today")  // Output: Today is: MONDAY

    // Using enum in a when expression
    when (today) {
        Day.MONDAY -> println("Start of the week!")
        Day.FRIDAY -> println("Almost weekend!")
        Day.SATURDAY, Day.SUNDAY -> println("Weekend!")
        else -> println("Weekday")
    }
}
