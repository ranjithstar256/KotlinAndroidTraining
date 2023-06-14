package com.example.kotlinbasicsconcepts

class ExplArraysInKotlin {
}

fun main() {
    var marks = arrayOf(10,9,3,4,5)
    marks += 7

    val differentTypeArray = arrayOf(10,4,5,"Array string", 'c', 10.5f)

//    differentTypeArray.get(8)
    ///differentTypeArray.

    var marksInt = arrayOf<Int>(10,4,5,8,9)


    marks[3] = 2
  ///  marks.

    var marksInr=  intArrayOf(9,9,9)



    val marksarr = arrayOf<Int>(10,4,5,8,9)
    //println(marksarr.get(0))
   // println(marksarr.get(1))
    //update the value of the first element of the array
    marksarr.set(0,100)
   // println(marksarr.get(0))



   // val markseach = arrayOf<Int>(10,4,5,8,9)
    marks.forEach {
            i ->
        println(i)
    }
}