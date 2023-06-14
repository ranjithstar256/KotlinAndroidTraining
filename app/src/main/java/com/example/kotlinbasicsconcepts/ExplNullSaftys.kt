package com.example.kotlinbasicsconcepts

class ExplNullSaftys {
}

fun main() {
    // Nullable operator (?)
    //Kotlin doesn't allow a field to be null by default. To make a field nullable, we need to assign ? operator.

    var nullableMessage: String? = null       // No error
    //  var message: String = null       // Error
   // println(nullableMessage)


    //The !! operator

    //The null pointer assertion operator(!!) will convert any value to non-null type
    // and throws an exception if the value is null.

    val message: String? = null
    //println(message!!.length)


    //Safe call operator( ?. )

    //This operator is one of the most important operator in Kotlin.
    // It saves us from null pointer exception. As the name suggests,
    // it helps us to safely call any variable or method of an object by checking if object
    // is null or not.
    val messagetwo: String? = "null"
    //println(messagetwo?.length)       // It will return null
  //  println(messagetwo!!.length)     // It will through null pointer exception


    //Elvis operator
    //The Elvis operator in Kotlin is used to assign some other value if the reference is null.
    var messagethree: String? = "i am working"
    println(messagethree?:"Message is null")

    messagethree = "Hello World"
   // println(messagethree?:"Message is null")

    //Here in first case, when message is null, condition after elvis operator is used and "Message is null" is printed. In second case, when message is not null, message is printed itself.

}