package com.app.kotlinbasic

object MySingleton {
    const val number = 42
    fun greet(text: String) = "Hello, $text!"
}

open class Company(name: String, emp: Int) {

    init {
        println("Compnay name: $name, no of employee: $emp has")
    }

    fun admin() = println("Admin Department.")
    fun hr() = println("HR Department.")
    open fun iTs() = println("Other Department.")
}

fun main() {

    //Singleton
    println(MySingleton.number)  // no val a=MySingleton()
    println(MySingleton.greet("Kotlin"))

    val mEmp = object : Company("XXXX", 1000) {
        override fun iTs() = println("IT Department.")
    }

    mEmp.admin()
    mEmp.hr()
    mEmp.iTs()
}