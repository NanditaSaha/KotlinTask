package com.app.kotlinbasic

// inheritance
open class Student(name: String, age: Int) {
    init {
        println("Name - $name\nAge - $age")
    }
}

class Science(name: String, age: Int, subject: String) : Student(name, age) {
    init {
        println("Subject - $subject")
    }
}

// interface
interface Views {
    fun clicked()
}

class Button : Views {
    override fun clicked() {
        println("Button clicked")
    }
}

class Text : Views {
    override fun clicked() {
        println("Text clicked")
    }
}

//abstraction
abstract class Vehicle {

    var name: String = "Not Specified"
    abstract var color: String
    fun description() {
        println("The vehicle, $name, color $color")
    }

    // abstract function
    abstract fun type()
}

class Car : Vehicle() {
    override var color: String = "Black"

    override fun type() {
        println("Gasoline Car.")
    }

}

//overriding
open class Base {

    open fun overridingFunction(name: String) {
        println("Name - $name")
    }
}

class Child : Base() {
    override fun overridingFunction(name: String) {
        super.overridingFunction(name)
        print("Name length ${name.length}")
    }
}

fun main() {

    println("****Example of Inheritance****")
    Science("Nandita", 15, "Math,Physics")

    println("****Example of Interface****")
    val mObject = Button()
    mObject.clicked()
    val mObjectOne = Text()
    mObjectOne.clicked()

    println("****Example of Abstraction****")
    val vehicle = Car()
    vehicle.name = "Audi"
    vehicle.description()
    vehicle.type()
    println("****Example of overriding****")
    val mChild = Child()
    mChild.overridingFunction("Nandita")
}