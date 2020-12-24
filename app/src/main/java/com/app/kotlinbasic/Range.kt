package com.app.kotlinbasic

fun main() {

    for (i in 1..30) // print 1 to 30
        print("$i ")

    println()
    for (i in 1 until 30)  // print 1 to 29
        print("$i ")

    println()
    for (i in 30 downTo 1) // print 30 to 1
        print("$i ")

    println()

    for (i in 1.rangeTo(30)) // print 1 to 30
        print("$i ")

    println()
    for (i in -30..-5 step 5) { // from -30 to -5 step value is 5
        print("$i ")
    }
    println()

}