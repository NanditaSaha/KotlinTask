package com.app.kotlinbasic

import java.util.logging.Logger

class MyClass {
    companion object {
        val LOG: Logger = Logger.getLogger(MyClass::class.java.name)
    }

    fun foo() {
        LOG.warning("Hello from MyClass")
    }
}

fun main() {
    val a = MyClass()
    println(a.foo())
}