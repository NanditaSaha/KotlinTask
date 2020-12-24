package com.app.kotlinbasic

fun main(arg:Array<String>)
{
    val mFirst=12.52
    val mSecond=50.25
    val mResult:Int

    mResult=addVlue(mFirst,mSecond)
    println(mResult)
}

fun addVlue(m:Double,n:Double):Int
{
    val mSum= (m+n).toInt()
    return mSum
}
