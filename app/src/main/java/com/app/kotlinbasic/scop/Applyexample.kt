package com.app.kotlinbasic.scop

fun main() {
    val mPerson = Person().apply {
        this.name = "Mon Saha"
        this.email = "xxx@gmail.com"
        description()
    }
    println(mPerson)
}