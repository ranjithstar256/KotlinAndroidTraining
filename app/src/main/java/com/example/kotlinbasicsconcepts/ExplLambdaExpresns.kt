package com.example.kotlinbasicsconcepts

class ExplLambdaExpresns {
}

fun main() {
    val lambda = { println("Lambdas are awesome!")}
    // Calling lambda function using ()
    lambda()
    // Calling lambda function using invoke() function
    lambda.invoke()



    val area = {length: Int, breadth: Int -> length*breadth}
    /*
        This lambda is same as:
        fun area(length: Int, breadth: Int){
            return length*breadth
        }
    */
    println("Area of rectangle of dimension 4 and 5 is: ${area(4,5)}")




        val array = arrayOf(10,2,3)
        // Long way
        array.forEach { num -> println(num * num) }
        // Shorthand
        array.forEach { println(it*it) }

}