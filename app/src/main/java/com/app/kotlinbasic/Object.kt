package com.app.kotlinbasic

object MySingleton {
    val number = 42;
    fun greet(text: String) = "Hello, $text!"
}

open class Company(name: String, emp: Int) {

    init {
        println("Compnay name: $name, no of employee: $emp has")
    }

    fun Admin() = println("Admin Department.")
    fun Hr() = println("HR Department.")
    open fun ITs() = println("Other Department.")
}

fun main(args: Array<String>) {

    //Singleton
    println(MySingleton.number)  // no val a=MySingleton()
    println(MySingleton.greet("Kotlin"))


    val mEmp = object : Company("XXXX", 1000) {
        override fun ITs() = println("IT Department.")
    }

    mEmp.Admin()
    mEmp.Hr()
    mEmp.ITs()
}