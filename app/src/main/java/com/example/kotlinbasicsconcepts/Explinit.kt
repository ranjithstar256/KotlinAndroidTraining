package com.example.kotlinbasicsconcepts

import java.util.Locale
/*In the primary constructor, the values provided are directly assigned to the class properties.
If we want to change the values before assigning them or add some logic to the primary constructor,
we can use the init block.*/
class Explinit (brand: String, model: String, mrp: Float, discount: Float) {
    var brand: String
    var model: String
    var mrp: Float
    var discount: Float

    // init function
    init {
        println("In init")
        this.brand = "android"
        this.model = model.uppercase(Locale.ROOT)
        this.mrp = mrp
        this.discount = discount
    }

    fun getActualPrice():Float{
        return mrp - discount
    }

    fun printDetails(){
        println("Mobile details:")
        println("Brand: $brand")
        println("Model: $model")
        println("MRP: $mrp")
        println("Discount: $discount")

    }
}
fun main() {
    //val mobile: Explinit = Explinit("iPhone", "11 pro", 100000f, 1000f)
    //println("Discounted price is: ${mobile.getActualPrice()}")
   // mobile.printDetails()
    Subject("a1")
}
/*
The primary constructor cannot contain any code.
https://kotlinlang.org/docs/reference/classes.html

the init{..} blocks allow adding code to the primary constructor.*/

/*initializer blocks are executed in the same order as they appear in the class body, interleaved with the property initializers*/


class Element {
    constructor(message: String) {
        println(message+"i am secondary constructor ")
    }
    init {
        println("Element init block 1")
    }

    init {
        println("Element init block 2")
    }

}

class Subject(private val name: String, e: Element = Element("$name: first element")) {

    private val field1: Int = 1

    init {
        println("$name: first init")
    }

    val e2 = Element("$name: second element")

    init {
        println("$name: second init")
    }

    val e3 = Element("$name: third element")
    }
