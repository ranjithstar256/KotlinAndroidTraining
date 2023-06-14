package com.example.kotlinbasicsconcepts

class ExplRange {
}

fun main() {
    val range = 1..9

    val rangetwo = 1.rangeTo(9)

    if (1 in range)
        println("1 is in $range")
    if(10 in range)
        println("10 is in $range")

    var lowerCase = 'a'..'z'          // Range for lowercase alphabet
    var upperCase = 'A'..'Z'          // Range for uppercase alphabet
    var digit = 0..9                 // Range for digits


    //Kotlin Step in Range
    val rangethree = 1..10 step 2
     for (number in rangethree)
        println(number)

    //downto
    val rangefour = 10 downTo 1
    for (number in rangefour)
        println(number)
}