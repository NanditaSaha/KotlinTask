package com.app.kotlinbasic

fun main() {

    //immutable list
    val immutableList = listOf("Java", "Kotlin", "C")
    for (item in immutableList) {
        print("$item ")
    }
    println()
    //  no repeatition of item
    val immutableSet = setOf("Java", "Kotlin", "C", "Java", "C")
    for (item in immutableSet) {
        print("$item ")
    }
    println()
    val immutableMap = mapOf(1 to "Java", 2 to "Kotlin", 3 to "C")
    for (key in immutableMap.keys) {
        println(immutableMap[key])
    }
    // mutable list
    val mutableList = mutableListOf("Java", "Kotlin", "C++")
    mutableList[0] = "Python"
    mutableList.add("C")
    mutableList.add("Java")
    mutableList.remove("C++")
    mutableList.removeAt(0)
    for (item in mutableList) {
        print("$item ")
    }
    println()
    //filter
    val mFiter = mutableList.filter { it.length > 3 }
    println(mFiter)
    println(mFiter.any { it.endsWith("a") })  // true if at least one elements matches
    println(mFiter.none { it.endsWith("i") }) // true if none elements matches
    println(mFiter.all { it.endsWith("e") })  //true if all elements matches

    val mImmutableList = listOf("Python", "Java", "Kotlin", "C++", "C")
    println(mImmutableList.last { it.length > 3 })
    println(mImmutableList.first { it.startsWith("C") })
}