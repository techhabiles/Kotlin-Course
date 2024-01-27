package com.techhabiles.equality

 class User(val name: String, val  age: Int) {
     override fun equals(other: Any?): Boolean {
         val user1 = other as User
         return  name == user1.name && age == user1.age
     }
}


fun main() {

    val a = 4
    val b  = 4
    println( a === b)
    // == , ===
    val user = User("Krish", 34)
    val user1 = User("Amit", 40)
    val userList = setOf(user, user1)
    val userList1 = setOf(user1, user)
    //println(userList !== userList1)
    /*val userList = listOf(user, user1)
    val userList1 = listOf(user,user1)
    println(userList == userList1)
    /val user2 = user
    println(user == user1)
    println(user.equals(user1))
    println(user === user1)
    println(user2 === user)*/
}


/**
 * Class - EqualityTest
 * @author - krish@techhabiles.com
 */