package com.app.kotlinbasic.scop

import java.util.*

fun main() {
    val result = run {
        val x = 10
        val y = x + 3
        y - 5
    }
    println(result)

    val mResult = "Nandita".run {
        val mSubStr = substring(1)
        mSubStr.toUpperCase(Locale.getDefault())
    }
    println(mResult)
}