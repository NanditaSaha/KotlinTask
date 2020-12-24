package com.app.kotlinbasic

import javax.security.auth.Subject

// inheritance
open class Student(name:String,age:Int)
{
    init {
        println("Name - $name\nAge - $age")
    }

}
class Science(name:String,age:Int,subject:String):Student(name,age){
    init {
        println("Subject - $subject")
    }

}
// interface
interface Views{

    fun clicked();
}
class Button:Views{
    override fun clicked() {
        println("Button clicked")
    }
}
class Text:Views{
    override fun clicked() {
        println("Text clicked")
    }
}
//abstraction
abstract class Vehicle {

    var name : String = "Not Specified"
    abstract var color : String
    fun description() {
        println("The vehicle, $name, color $color")
    }
    // abstract function
    abstract fun Type()
}
class Car : Vehicle() {
    override var color: String = "Black"

    override fun Type() {
        println("Gasoline Car.")
    }

}
//overriding
open class Base(){

    open fun ovrridingFunction(name:String){

        println("Name - $name")
    }
}
class Child:Base(){
    override fun ovrridingFunction(name: String) {
        super.ovrridingFunction(name)
        print("Name length ${name.length}")
    }
}

fun main(arg:Array<String>)
{

    println("****Example of Inheritance****")
    Science("Nandita",15,"Math,Physics")

    println("****Example of Interface****")
    val mObject = Button()
    mObject.clicked()
    val mObjectOne = Text()
    mObjectOne.clicked()

    println("****Example of Abstraction****")
    var vehicle = Car()
    vehicle.name="Audi"
    vehicle.description()
    vehicle.Type()
    println("****Example of overriding****")
    val mChild=Child()
    mChild.ovrridingFunction("Nandita")
}