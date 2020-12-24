package com.app.kotlinbasic

import java.util.logging.Logger

class MyClass {
    companion object {
        val LOG = Logger.getLogger(MyClass::class.java.name)
    }

    fun foo() {
        LOG.warning("Hello from MyClass")
    }
}

fun main(arg:Array<String>)
{
    val a=MyClass()

    println( a.foo())
}