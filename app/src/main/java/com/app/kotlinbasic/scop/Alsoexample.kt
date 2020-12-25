package com.app.kotlinbasic.scop

fun main(arg:Array<String>)
{
    val mNumbers = mutableListOf("one", "two", "three")
    mNumbers
        .also { println("The list elements before adding new one: $it") }
        .add("four")
    println(mNumbers)

}