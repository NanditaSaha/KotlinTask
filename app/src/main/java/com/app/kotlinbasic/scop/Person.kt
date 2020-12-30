package com.app.kotlinbasic.scop

class Person {
    var name: String = "Nandita"
    var email: String = "nandita@gmail.com"
    private var mobile: String = "9999999999"
    fun description() = print(
        "\n Name: $name\n " +
                "Email: $email\n " +
                "Mobile: $mobile"
    )
}