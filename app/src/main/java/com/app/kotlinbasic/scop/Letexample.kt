package com.app.kotlinbasic.scop


fun main(arg:Array<String>)
{
    val mPerson = Person().let {
        return@let "Person name is- ${it.name} and email is- ${it.email}"

    }
    println(mPerson)

    val mPersonOne = Person().let { personDetails ->
        personDetails.name = "Nandita Saha"
        "Person full name is- ${personDetails.name}"
    }
    println(mPersonOne)

    // null-safe  with let
    val number: Int? = null


    val mNumberOne = number?.let { it + 10 }
    val mNumberTwo = number?.let { it * 2 }

    println("Addition result- $mNumberOne Multiplication result- $mNumberTwo")
}