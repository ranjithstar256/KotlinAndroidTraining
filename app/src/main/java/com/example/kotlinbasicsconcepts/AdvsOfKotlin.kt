package com.example.kotlinbasicsconcepts

/*

Features of Kotlin

Kotlin provides many features over Java. The main features why Kotlin is preferred over other languages are:

1. Concise code

The size of the code plays an important role in developer’s life. Suppose you joined a company where you’re assigned a task to replace an old functionality with new one or probably fix it. The first thing you’re required to do is to go through the codebase. As said earlier, If the size of codebase is huge, you’ll spend more time understanding the code than writing it. The simpler and concise the code is, the faster you’ll understand it.

Kotlin makes sure that each line of code carries some meaning with it. All the boilerplate code which is required in case of Java like getters, setters, assigning constructor parameter to fields etc is not required in Kotlin.

2. Null Safe

Kotlin make sure that our program does not throw NullPointerException at runtime. The type system of Kotlin tracks values that can be null. If any operation is performed on that value, which can lead to NullPointerException, Kotlin forbids it and gives error to avoid the error. We’ll discuss more about null safety in a separate section.

3. Interoperable

This is one of the most admired features of Kotlin.
Kotlin is fully interoperable with Java. It means you can use Java libraries,
call Java methods, extend Java classes, implement Java interfaces etc in your Kotlin codebase. You can have one class of your project written in Java and other one in Kotlin. They both will be able to use each other’s functionality.

4. JavaScript Transpilation

You can transpile your Kotlin code to JavaScript code. So, we can write our code in Kotlin, transpile it to JavaScript and run it on browsers. It has one disadvantage though. When we transpile Kotlin code to JS, all the code in the project as well as standard libraries used are converted into JS code. But it will exclude any Java framework or library used. So, this might cause problem if you’re using Java libraries.

Kotlin has other features also like extension functions, named arguments and default arguments, data classes etc. We’ll cover them in later sections.


*/