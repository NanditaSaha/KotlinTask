package com.app.kotlinbasic

fun main(args: Array<String>) {

    //  Non-nullable
    val nonNull: String = "Nandita Saha"
    println(nonNull.length)


    //  Null
    var maybeNull: String? = null
    println(maybeNull?.length)

    maybeNull = "Nandita Saha"
    println(maybeNull.length)

    val nullable: String? = null
    println(nullable?.toUpperCase())
    println(nullable!!.toUpperCase()) // throw exception
}