package com.app.kotlinbasic

const val mVal = 5
var mText = "SampleText"
fun main() {

    println(mVal)
    //   mVal=10  Error val can not be assigned
    println(mText)
    mText = "UpdatedSampleText"
    println(mText)
}