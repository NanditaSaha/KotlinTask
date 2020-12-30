package com.app.kotlinbasic

val String.lastChar
    get() = this[length - 1]

fun <T> T.addString(b: T): String {    // Generics
    return this.toString() + b.toString()
}

class Operation {
    var x = 10
    infix fun minus(num: Int) {
        this.x = this.x - num
    }
}

inline fun myInline(myFunc: () -> Unit) {
    myFunc()
    print("Under inline ......")
}

fun main() {
    print("Last Character is - ")
    println("Hi Kotlin".lastChar)
    println("Kotlin".addString("Example"))
    println(127.addString(" is a Int"))
    print("infix Result - ")
    val mOpr = Operation()
    mOpr minus 5
    println(mOpr.x)
    myInline { println("Calling inline functions") }
}