package com.example.kotlinbasicsconcepts

// int a = 6;



    val message = "Everything is happening Perfectly!!"
     val i =6
    lateinit var laterini: String

    val marks: Array<Int> = arrayOf(10, 9, 2, 7, 8, 6, 10)
    var isQualified = true
    val isPromoted: Boolean = false

    //val letter: Char = 65   // Error
    val letter: Char = 'p'
    val marksfloatvar: Float = 1.0f
    val percentage: Double = 1.0

    val normalNumber = 1
    val explicitlyMarkedLong = 1L
    val longByRange = 100000000000



    fun main() {

        println("Data type of normalNumber is: " + normalNumber::class.simpleName)
        println("Data type of explicitlyMarkedLong is: " + explicitlyMarkedLong::class.simpleName)
        println("Data type of longByRange is: " + longByRange::class.simpleName)

    }