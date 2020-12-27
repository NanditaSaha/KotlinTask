package com.app.kotlinbasic

val mVal=5
var mText="SampleText"
fun main(args:Array<String>){

    println(mVal)
 //   mVal=10  Error val can not be assigned
    println(mText)
    mText="UpdatedSampleText"
    println(mText)
}