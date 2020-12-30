package com.app.kotlinbasic

import java.util.*

fun main() {

    //  Non-nullable
    val nonNull = "Nandita Saha"
    println(nonNull.length)

    //  Null
    var maybeNull: String? = null
    println(maybeNull?.length)

    maybeNull = "Nandita Saha"
    println(maybeNull.length)

    val nullable: String? = null
    println(nullable?.toUpperCase(Locale.getDefault()))
    println(nullable!!.toUpperCase(Locale.getDefault())) // throw exception
}