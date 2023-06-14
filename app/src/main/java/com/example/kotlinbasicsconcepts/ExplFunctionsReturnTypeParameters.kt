package com.example.kotlinbasicsconcepts

class ExplFunctionsReturnTypeParameters {
}

/*

public String add (String a , String b){

return "Awesome";
}

 */

fun main() {
    Hello()
    recpara("Great",6)
}
fun sayHello(){
    println("Hello World!!")
}

fun recpara(s: String, i :Int ):String{
    println("received parameters $s \n $i ")
    return "i am result"
}

fun retpara() :String {
    return "i am result"
}

fun both(s: String, i :Int) :String {
    return "i am result"
}

fun Hello(): Unit{
    println(sayHello())
    println(retpara())

}