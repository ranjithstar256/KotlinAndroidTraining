package com.example.kotlinbasicsconcepts

class ExplClassnObj {
    // brand of type String
    var brand: String = ""
    // model of type String
    var model: String = ""
    // mrp of type float
    var mrp: Float = 0f
    // discount of type float
    var discount: Float = 0f

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
    val mobile = ExplClassnObj()
    mobile.brand = "iPhone"
    mobile.model = "11 pro"
    mobile.mrp = 100000f
    mobile.discount = 1000f

    println("Discounted price is: ${mobile.getActualPrice()}")

    mobile.printDetails()
}