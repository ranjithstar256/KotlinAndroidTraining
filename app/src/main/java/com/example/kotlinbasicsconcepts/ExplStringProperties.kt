package com.example.kotlinbasicsconcepts

import java.util.Locale

class ExplStringProperties {
}

fun main() {
    var message = "K P Ranjith!!"
    // Properties
    println("Length of string: ${message.length}")
    println("Last index number: ${message.lastIndex}")

    // Functions
    println("Character at index 0: ${message[0]}")
    println("Character at index 1: ${message.get(1)}")
    println("First character in string: ${message.first()}")
    println("Last character in string: ${message.last()}")

    println("Add Bye to message for printing: ${message.plus(" Bye")}")
    println("Subsequence from message: ${message.subSequence(0,5)}")
    println("Message contains 'll'?: ${message.contains("ll")}")

    println("Capitalize message: ${message.replaceFirstChar {
        if (it.isLowerCase()) it.titlecase(
            Locale.getDefault()
        ) else it.toString()
    }}")

    println("decapitalize message: ${message.replaceFirstChar { it.lowercase(Locale.getDefault()) }}")
    println("Reversed message: ${message.reversed()}")
    println("Message in lower case: ${message.lowercase(Locale.ROOT)}")
    println("Message in upper case: ${message.uppercase(Locale.getDefault())}")
}