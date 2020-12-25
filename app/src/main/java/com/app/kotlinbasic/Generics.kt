package com.app.kotlinbasic



class Example<T> (text : T){
    var x = text
    init{
        println(x)
    }
}
fun main(arg:Array<String>)
{
    var name= Example("Nandita Saha")
    var mobile = Example(124567890)
    var objetInt = outExample<Int>(10)
    var objectDouble = outExample<Double>(10.00)

}


class outExample<out T>(text:T) {
    init {
        println("Value "+text)
    }
}
