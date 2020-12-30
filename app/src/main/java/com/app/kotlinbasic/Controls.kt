package com.app.kotlinbasic

fun main() {

    // print("Enter Your Age? ")
    //  var mAge: Int =Integer.valueOf(readLine())

    when (20) {
        in 0..17 -> println("You're not allowed to")
        in 18..20 -> println("You may be allowed to")
        in 21..150 -> println("Do as you please")
        else -> println("That's not a valid age")
    }

}