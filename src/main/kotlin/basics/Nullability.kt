package org.example.basics

fun main(){

    //// Nullability

    // Non-nullable variable (cannot hold null - i.e. can't assign null to a non-nullable variable)
    var name: String = "Alice" // name = null, This will give a compile-time error

    // Nullable variable (can hold null)
    var lastName: String? = null // can be assigned null to a nullable variable

    lastName = "Smith"

    println("Name: $name, Last Name: $lastName")

    //// Null Safety

    // Safe Call (?.)
    // The safe call operator (?.) allows you to safely call methods or access properties on a nullable object.
    // If the object is null, it won't throw an exception and will return null instead.

    var password: String? = null
    // Safe call: Will not throw NullPointerException
    println("Last Name Length: ${password?.length}") // Output - Last Name Length: null

    // Elvis Operator(?:)
    // The Elvis operator(?:) is used to provide a default value when a nullable expression is null.
    // Elvis operator: If lastName is null, use "Unknown"
    println("Last Name: ${password?:"Unknown"}") // Outputs - Last Name: Unknown

    // Null Check (if statement)
    // explicitly check if a variable is null using an if statement
    if (lastName != null) {
        println("Last Name Length: ${lastName.length}")  // Safe to access 'lastName.length'
    } else {
        println("Last Name is null")
    }

    // Non-null Assertion (!!)
    // If you're sure a variable is not null, you can use the !! operator to assert it. If the variable is null, it will throw a NullPointerException.
    // Non-null assertion: You must be sure 'lastName' is not null.
    println("Last Name Length: ${lastName!!.length}")  // Outputs: Last Name Length: 5

    // If lastName was null, this would throw an exception:
    // lastName = null
    // println(lastName!!.length) // Throws NullPointerException
}