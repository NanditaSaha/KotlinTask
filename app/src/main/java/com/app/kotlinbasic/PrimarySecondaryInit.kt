package com.app.kotlinbasic

class User(user_id: Int, user_name: String) {
   private val id: Int = user_id
    val name: String = user_name

    init {
        print("Id: $id Name:  $name")
    }
}

fun main() {
    val mUser = User(1, "Nandita")
}