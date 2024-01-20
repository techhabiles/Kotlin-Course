package com.techhabiles.objectexp

import kotlin.reflect.typeOf

/**
 * Class - ObjectScratch
 * @author - krish@techhabiles.com
 */
 val fullName = object {

     val firstName = "Krish"
    val lastName  = "Chauhan"

    override fun toString(): String {
        return "$firstName - $lastName"
    }
 }

fun main() {
    println(fullName.toString())

}