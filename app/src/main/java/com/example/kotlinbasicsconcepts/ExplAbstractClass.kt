package com.example.kotlinbasicsconcepts

abstract class ExplAbstractClass {
}
/*abstract class Shape{
    abstract fun area()
}

class Square: Shape() {
    override fun area() {
        println("Area of square: side*side")
    }
}

class Circle: Shape() {
    override fun area() {
        println("Area of circle: 3.14*r*r")
    }
}

fun main() {
    val square = Square()
    val circle = Circle()
    square.area()
    circle.area()
}
*/


abstract class Shape{
    abstract var sides: Int

    abstract fun area()

    fun sayShape(){
        println("It is a shape...")
    }
}

class Square: Shape() {
    override var sides: Int = 4
    override fun area() {
        println("Area of square: side*side")
    }
}

class Circle: Shape() {
    override var sides: Int = 0
    override fun area() {
        println("Area of circle: 3.14*r*r")
    }
}

fun main() {
    val square = Square()
    val circle = Circle()
    println("Side of square: ${square.sides}")
    println("Side of Circle: ${circle.sides}")
    square.area()
    circle.area()
    square.sayShape()
    circle.sayShape()
}

