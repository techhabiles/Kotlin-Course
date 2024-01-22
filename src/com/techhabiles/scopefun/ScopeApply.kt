package com.techhabiles.scopefun

/**
 * Class - ScopeApply
 * @author - krish@techhabiles.com
 */
class ScopeApply {
    private lateinit var name: String
    fun setName(name: String){
        this.name = name
    }

    fun printName(){
        println("Name is $name")
    }
}

fun main() {
     /*val obj = ScopeApply().apply {
         setName("Krish")
     }*/

    val obj = ScopeApply()
    obj.run {
        setName("Krish")

    }
    obj.printName()
}