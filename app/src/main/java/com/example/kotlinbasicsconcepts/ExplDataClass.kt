package com.example.kotlinbasicsconcepts

data class ExplDataClass(var dataone:String, var somnum:Int){
    constructor(): this("Silver",6)
}
fun main() {
    var explobj = ExplDataClass()
    println("RESULT: ${explobj.dataone} ${explobj.somnum}")
    println(explobj)
}

