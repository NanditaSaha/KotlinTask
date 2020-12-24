package com.app.kotlinbasic

class User(user_id:Int,user_name:String)
{
    val id:Int
    val name:String
    init{
        id=user_id
        name=user_name
        print("Id: $id Name:  $name" )
    }


}
fun main(arg:Array<String>)
{
    val mUser=User(1,"Nandita")
}