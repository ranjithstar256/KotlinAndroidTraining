package com.example.kotlinbasicsconcepts
 

fun main() {

    // Arithmetic operator
    var num1: Int = 25
    var num2: Int = 6

    println("Sum: " + (num1 + num2))
    println("Difference: " + (num1 - num2))
    println("Multiplication: " + (num1 * num2))
    println("Division: " + (num1 / num2))
    println("Modulus: " + (num1 % num2))



    //Comparison operator
    var num3: Int = 25
    var num4: Int = 6

    println("Less than: " + (num3 < num4))
    println("Greater than: " + (num4 > num4))
    println("Less than or equal to: " + (num4 <= num4))
    println("Greater than or equal to: " + (num4 >= num4))

    //Assignment operators

    var num5: Int = 25
    var addAndAssign: Int = 50
    addAndAssign += num5
    println(addAndAssign)

    var subAndAssign: Int = 40
    subAndAssign -= num5
    println(subAndAssign)

    var multiplyAndAssign: Int = 1
    multiplyAndAssign *= num5
    println(multiplyAndAssign)

    var divideAndAssign: Int = 50
    divideAndAssign /= num5
    println(divideAndAssign)

    var modulusAndAssign: Int = 30
    modulusAndAssign %= num5
    println(modulusAndAssign)


    //Equality operators
    val num6: Int = 25
    var num7: Int = 25

    println(num6 == num7)
    println(num6 != num7)

    num7 = num6
   // println(num6 === num7)
  //  println(num6 !== num7)


    //Unary operators
    var num8: Int = 25
    var num9: Int = 10

    println("+num8 :"+ +num8)
    println("-num9 :"+ -num9)
    println("++num8 :"+ ++num8)
    println("--num9 :"+ --num8)


    // Logical operators
    var num10: Int = 25
    var num11: Int = -10

    var andResult = num10 > 0 && num11 > 0
    var orResult = num10 > 0 || num11 > 0
    var notResult = !true
    println("Check if both are positive: " + andResult)
    println("Check if either one is positive: "+ orResult)
    println("Not operator on true: "+ notResult)
}