package com.app.kotlinbasic.scop

fun main(arg:Array<String>)
{
    val mResult = with("Nandita") {
        val mSubStr = substring(1)
        mSubStr.toUpperCase()
    }
    println(mResult)


    val mMutable = mutableListOf("Kotlin", "C", "Java")
    val mResultOne = with(mMutable) {
        "The first item is ${first()}," + " the last item is ${last()}"
    }
    println(mResultOne)
}