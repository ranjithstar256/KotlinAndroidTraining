package com.example.kotlinbasicsconcepts

class ExplSecondryConstr {
    var brand: String = ""
    var model: String = ""
    var mrp: Float = 0f
    var discount: Float = 0f

    // first secondary constructor
    constructor(_brand: String, _model: String){
        this.brand = _brand
        this.model = _model
    }

    // second secondary constructor
    constructor(_mrp: Float, _discount: Float){
        this.mrp = _mrp
        this.discount = _discount
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
    val mobile = ExplSecondryConstr(9.0f, 9.9f)
    println("Discounted price is: ${mobile.getActualPrice()}")
    mobile.printDetails()
}