package com.example.kotlinbasicsconcepts

class ExplLoops {
}
fun main() {
    val marks = 70
    val result: String
    if (marks > 33) {
        result = "Hurrah! You passed"
    } else {
        result = "Sorry! You failed"
    }
    println(result)

    //nested if else
    // Taking three numbers as input
    println("Enter first number: ")
    val num1 = 3

    println("Enter second number: ")
    val num2 = 4

    println("Enter third number: ")
    val num3 = 5

    val max = if (num1 > num2) {
        if (num1 > num3)
            num1
        else
            num3
    } else if (num2 > num3)
        num2
    else num3

    println("Maximum number is: $max")

    //Switch case in java
    // when in Kotlin

    val number: Int = 5
    when (number) {
        1 -> {
            println("Hello")
            println("Monday")
        }

        2 -> {
            println("Hello")
            println("Tuesday")
        }

        3 -> {
            println("Hello")
            println("Wednesday")
        }

        4 -> {
            println("Hello")
            println("Thursday")
        }

        5 -> {
            println("Hello")
            println("Friday")
        }

        6 -> {
            println("Hello")
            println("Saturday")
        }

        7 -> {
            println("Hello")
            println("Sunday")
        }

        else -> {
            println("Invalid input!!")
        }
    }


    //While loop in Kotlin

        var iterator = 1
        // when iterator becomes 10, end the loop
        while(iterator <= 10){
            println("2 * $iterator = " + 2*iterator )
            // increment value of iterator by 1
            iterator++
        }
     // another while example
    var numberone = 10               // Number whose factorial needs to be find
    var numberToIterate = numberone  // Creating a variable to use this as an iterator
    var factorial = 1
    // Iterating while loop until it reaches 0
    while (numberToIterate > 0){
        factorial *= numberToIterate
        numberToIterate--
    }
    println("Factorial of $numberone is $factorial")


    //do while

        do {
            println("i am from do loop!!")
        }while (false)


        //Another important loop is for loop in Kotlin!!

    val marksdata: Array<Int> = arrayOf(9,8,3,10,7,9)
    for (ok in marksdata){
        println(ok)
    }

    for (index in marksdata.indices)
        println("Score in subject $index is: " + marksdata[index])

    val name = "KPRanjith"
    for (letter in name){
        println(letter)
    }
}