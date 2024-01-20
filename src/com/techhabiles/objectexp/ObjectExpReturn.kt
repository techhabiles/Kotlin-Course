package com.techhabiles.objectexp

/**
 * Class - ObjectExpReturn
 * @author - krish@techhabiles.com
 */

interface X {
    fun fromX()
}

interface Y {
    fun fromY()
}
class ObjectExpReturn {
     fun myObj() = object {
        val name = "Krish"
         fun fromAnonymous() {
            println("From X")
        }
    }

    /*fun myObj1(): X {
        return object : X{
            override fun fromX() {
                println("From X")
            }
        }
    }*/
}

fun main() {
    val obj = ObjectExpReturn()
   // obj.myObj().name
    //obj.myObj().fromAnonymous()
}