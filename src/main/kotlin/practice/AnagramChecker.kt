package org.example.practice

// Anagram Checker
fun main() {
    print("Enter word/string 1 -> ")
    val string1: String = readln()

    print("Enter word/string 2 -> ")
    val string2: String = readln()

    if(checkAnagram(string1, string2)) {
        println("$string1 & $string2 are anagrams")
    }
    else {
        println("$string1 & $string2 are not anagrams")
    }
}

fun checkAnagram(str1: String, str2: String) : Boolean {
    // Remove empty spaces and converting them to lowercase
    var str1 = str1.replace(" ", "").toLowerCase()
    var str2 = str2.replace(" ", "").toLowerCase()

    // check if the length is same or not
    if (str1.length != str2.length) return false

    // Sorting the characters in both strings and compare them
    str1 = str1.toCharArray().sorted().toString()
    str2 = str2.toCharArray().sorted().toString()

    return str1 == str2
}