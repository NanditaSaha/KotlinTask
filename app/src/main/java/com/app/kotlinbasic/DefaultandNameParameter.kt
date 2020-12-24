package com.app.kotlinbasic

fun displaySeries(start: Int = 1, end: Int = 10) {
    for (i in start..end) {
        print("$i ")

    }
}
//vararg parameter
fun printAll(vararg mMessages: String) {
    for (m in mMessages) print("$m ")
}

fun main(args: Array<String>) {
    print("With argument - ")
    displaySeries()
    println()
    print("With first argument -" )
    displaySeries(5)
    println()
    print("With both arguments -")
    displaySeries(5, 5)
    println()
    printAll("Nandita","Saha")
    println()
    printAll("Hello", "Kotlin", ":", "Happy", "123")
}
