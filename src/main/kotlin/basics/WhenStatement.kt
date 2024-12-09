package org.example.basics


fun main(){

    // Else-If Ladder
//    print("Enter marks = ")
//    val marks: Int = readln().toInt()
//
//    val grade: Char = if (marks in 91 .. 100){
//        'A'
//    }else if (marks in 81 .. 90) {
//        'B'
//    }else if (marks in 71 .. 80) {
//        'C'
//    }else {
//        'F'
//    }
//
//    println("Grade: $grade")

    // When

    // When is used when there is multiple condition branching
    print("Enter marks = ")
    val marks: Int = readln().toInt()

    // Crisp n concise
    val grade: Char = when (marks) {
        in 91..100 -> 'A'
        in 81..90 -> 'B'
        in 71..80 -> 'C'
        else -> 'F'
    }

    println("Grade: $grade")
}