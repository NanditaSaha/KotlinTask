package com.app.kotlinbasic

fun main(args: Array<String>) {

    val e = A.E("Nandita")
    println(e)

    var d = A.D
    d.name()

    val p=execute(5,mOperation.Add(10))
    println("Result Add- $p")
    val p1=execute(10,mOperation.Substract(1))
    println("Result Subtraction- $p1")

}

sealed class mOperation {
    class Add(val value: Int) : mOperation()
    class Substract(val value: Int) : mOperation()
    class Multiply(val value: Int) : mOperation()
    class Divide(val value: Int) : mOperation()
}


fun execute(x: Int, op: mOperation) = when (op) {
    is mOperation.Add -> x + op.value
    is mOperation.Substract -> x - op.value
    is mOperation.Multiply -> x * op.value
    is mOperation.Divide -> x / op.value
}

sealed class A{
    class B : A()
    class C : A()
    object D : A()
    {
        fun name()
        {
            println("Object D")
        }
    }
    data class E(var name: String) : A()

}