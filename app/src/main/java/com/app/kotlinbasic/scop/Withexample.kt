package com.app.kotlinbasic.scop

import java.util.*

fun main() {
    val mResult = with("Nandita") {
        val mSubStr = substring(1)
        mSubStr.toUpperCase(Locale.getDefault())
    }
    println(mResult)

    val mMutable = mutableListOf("Kotlin", "C", "Java")
    val mResultOne = with(mMutable) {
        "The first item is ${first()}," + " the last item is ${last()}"
    }
    println(mResultOne)
}