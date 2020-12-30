package com.app.kotlinbasic

fun main() {

    val e = A.E("Nandita")
    println(e)

    val d = A.D
    d.name()

    val p = execute(5, MOperation.Add(10))
    println("Result Add- $p")
    val p1 = execute(10, MOperation.Subtract(1))
    println("Result Subtraction- $p1")

}

sealed class MOperation {
    class Add(val value: Int) : MOperation()
    class Subtract(val value: Int) : MOperation()
    class Multiply(val value: Int) : MOperation()
    class Divide(val value: Int) : MOperation()
}

fun execute(x: Int, op: MOperation) = when (op) {
    is MOperation.Add -> x + op.value
    is MOperation.Subtract -> x - op.value
    is MOperation.Multiply -> x * op.value
    is MOperation.Divide -> x / op.value
}

sealed class A {
    object D : A() {
        fun name() {
            println("Object D")
        }
    }

    data class E(var name: String) : A()
}