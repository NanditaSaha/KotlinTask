package com.app.kotlinbasic


class Example<T>(text: T) {
    private var x = text

    init {
        println(x)
    }
}

fun main() {
    var name = Example("Nandita Saha")
    var mobile = Example(124567890)
    var objectInt = OutExample<Int>(10)
    var objectDouble = OutExample<Double>(10.00)
}

class OutExample<out T>(text: T) {
    init {
        println("Value $text")
    }
}
