package com.app.kotlinbasic

class MOuter {
    private var name: String = "Nandita"

    inner class MInner {
        var message: String = "i am inside inner"
        private var age: Int = 10
        fun desc() {
            println("Name - $name Age - $age") //  outer class member

        }
    }
}

fun main() {
    println(MOuter().MInner().message)
    val mObject = MOuter().MInner()
    mObject.desc()

}