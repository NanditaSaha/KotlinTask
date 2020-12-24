package com.app.kotlinbasic.interoperability

fun main(arg:Array<String>)
{
    val mCalculateSum = CalculateSum()
    val mNumArray = intArrayOf(10, 20, 30,40,50)
    val mSum = mCalculateSum.sumResult(mNumArray)
    println("Sum - "+mSum)
}