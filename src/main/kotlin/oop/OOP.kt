package org.example.oop

// Class
// constructor (This is a primary constructor is created at the head of the class)
class Student constructor(
    var name: String,
    var id: Int,
    var occupation: String
)
{ // class header
    // class body

//    var name: String = ""
//    var id: Int = 0
//    var occupation: String = ""
    // ...add more properties

    // Init is called when constructor is called
    init {
        println("Creating Object")
    }

    fun greeting(){
        println("Hello I am $name. My id is $id. I am the $occupation.")
    }

    fun printDetail(){
        println(id)
        println(name)
        println(occupation)
        greeting()
    }
}

fun main() {
    var student1 = Student("Gregor", 345, "Engineer") // new is not required like in java
//    student1.occupation = "Engineer"
//    println(student1.occupation)

//    student1.name = "Gregor"
//    println(student1.name)

//    student1.id = 56337
//    println(student1.id)

    student1.greeting()

    var student2 = Student("Mac", 6764, "Doctor")
//    student2.occupation = "Doctor"
//    student2.name = "Mac"
//    student2.id = 6746
//    student2.printDetail()
    student2.greeting()
}