package com.app.kotlinbasic

fun main() {
    val mFirst = 12.52
    val mSecond = 50.25
    val mResult: Int

    mResult = addValue(mFirst, mSecond)
    println(mResult)
}

fun addValue(m: Double, n: Double): Int {
    return (m + n).toInt()
}
