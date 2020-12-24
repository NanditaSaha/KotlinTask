package com.app.kotlinbasic

fun main(args:Array<String>){

    val mWord = "SampleText"
    for (letter in mWord) {
        println("Upper Text ${letter.toUpperCase()}")
    }
    println("That makes ${mWord.toUpperCase()}")


    for (char in 'a'..'z') {
        print("$char ")
    }
    println()
    val mNumbers = mutableListOf("One", "Two","Three","Four")
    val mMutableListIterator = mNumbers.listIterator()
    for (number in mNumbers) {
        println("$number is number.")
    }
    mMutableListIterator.add("Five")
    println("After $mNumbers")
    mMutableListIterator.next()
    mMutableListIterator.remove()
    print("After $mNumbers")
}