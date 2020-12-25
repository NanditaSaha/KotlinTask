package com.app.kotlinbasic


//  lambda
var sum = {a: Int , b: Int -> a + b }
// higher order function
fun higherOrder( sum: (Int, Int) -> Int) {   //lambda as parameter

    var mResult = sum(10,5)
    println("The sum  is: $mResult")
}



fun multiplication(a: Int, b: Int): Int{
    return a*b
}
fun higherOrderSecond() : ((Int,Int)-> Int){
    return ::multiplication   // returning function
}


fun main(args: Array<String>) {
    higherOrder(sum)
    val mMultiply = higherOrderSecond()
    val mResult = mMultiply(10,5)
    println("The multiplication : $mResult")
}