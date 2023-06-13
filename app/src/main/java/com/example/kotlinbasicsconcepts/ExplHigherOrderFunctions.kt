package com.example.kotlinbasicsconcepts

class ExplHigherOrderFunctions {
}

/* Kotlin Higher order function

A function which takes another function as an argument or returns a function
is known as a higher order function.
Often lambda expressions are passed as an argument to a higher order function
or returned from it.
An anonymous function can be used for the same also. */

fun Normalfn(name: String){
    println("In Normalfn() function")
    println("Say hello to $name")
}

//passing function as parameter
fun higherOrderFunction(functionName: (name: String)-> Unit, name: String){
    println("In higher order function")
    println("Calling Normalfn() function...")
    functionName(name)
}


// function as return type
fun higherOrderReturnFunction(): (name:String) -> Unit{
    println("In higher order function")
    // return the Normalfn function
    return ::Normalfn
}


// lamda as argument
fun higherOrderLamdaAsArgumentFunction(functionName: (name: String)->Unit, name: String){

    println("In higher order function")
    println("Calling received function...")
    functionName(name)
}


// lamda as return value
fun higherOrderlamdaAsRetunFunction(): (name:String) -> Unit{
    println("In higher order function")
    return {
            name ->
        println("Inside the lambda function")
        println("Say hello to $name")
    }
}


fun main() {
    //as function
    higherOrderFunction(::Normalfn, "K P RANJITH")

    //function as return type
    val functionasreturn = higherOrderReturnFunction()
    functionasreturn("Ranjith Kumar")

    // Lambda as argument
    higherOrderLamdaAsArgumentFunction({ name: String ->
        println("Inside the lambda function")
        println("Say hello to $name")
    }, "Android")


    //lamda as return type
    val lammdaasreturn = higherOrderlamdaAsRetunFunction()
    lammdaasreturn("Lambda as return type")
}
