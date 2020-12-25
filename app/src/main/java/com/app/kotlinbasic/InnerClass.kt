package com.app.kotlinbasic

class mOuter{
    private  var name: String = "Nandita"
    inner class  mInner{
        var message: String = "i am inside inner"
        private var age: Int = 10
        fun desc(){
            println("Name - ${name} Age - ${age}") //  outer class member

        }
    }
}
fun main(args: Array<String>){
    println(mOuter().mInner().message)
    var mObject = mOuter().mInner()
    mObject.desc()

}