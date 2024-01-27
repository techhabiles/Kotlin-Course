package com.techhabiles.scopefun

/**
 * Class - ScopeWith
 * @author - krish@techhabiles.com
 */
fun main() {
    val names = arrayOf("Krish", "Ravi", "Amit")
    val str =  with(names){
         "first name is ${first()} and last name in array is ${last()}"
    }

    println(str)
}