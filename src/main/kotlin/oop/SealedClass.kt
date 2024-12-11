package org.example.oop

// Sealed class definition
sealed class Result

// Subclasses of the sealed class
data class Success(val data: String) : Result()
data class Error(val message: String) : Result()
object Loading : Result()

// Usage example
fun fetchData(): Result {
    // Simulate a network request
    return Loading // For example, you can return Loading, Success, or Error based on the situation
}

fun handleResult(result: Result) {
    when (result) {
        is Success -> println("Data fetched successfully: ${result.data}")
        is Error -> println("Error occurred: ${result.message}")
        is Loading -> println("Loading data...")
    }
}

fun main() {
    val result = fetchData()
    handleResult(result)
}
