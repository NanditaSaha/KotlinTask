package com.app.kotlinbasic

fun main(args:Array<String>){

   // print("Enter Your Age? ")

  //  var mAge: Int =Integer.valueOf(readLine())

    val mAge=20
    if (mAge >=18) {
        println("You are adult")
    } else {
        println("You are child")
    }


    when (mAge) {
        in 0..17 -> println("You're not allowed to")
        in 18..20 -> println("You may be allowed to")
        in 21..150 -> println("Do as you please")
        else -> println("That's not a valid age")
    }

}