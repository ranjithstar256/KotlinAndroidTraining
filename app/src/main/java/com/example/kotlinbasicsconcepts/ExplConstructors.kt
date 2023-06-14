package com.example.kotlinbasicsconcepts

class ExplConstructors (var brand: String, var model: String, var mrp: Float,
                        var discount: Float) {

    // class methods
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
    val mobile = ExplConstructors("iPhone", "11 pro", 100000f, 1000f)
    println("Discounted price is: ${mobile.getActualPrice()}")
    mobile.printDetails()
}