package com.app.kotlinbasic

interface Nameable {
    var name: String
}

class MyName : Nameable {
    override var name: String = "Nandita"
}

class MyRunnable : Runnable {
    override fun run() {
        println("Kotlin Delegation")
    }
}

class Person(name: Nameable, runner: Runnable) : Nameable by name, Runnable by runner

fun main() {
    val person = Person(MyName(), MyRunnable())
    println(person.name)
    person.run()
}