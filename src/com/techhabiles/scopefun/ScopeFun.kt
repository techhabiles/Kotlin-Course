package com.techhabiles.scopefun
/**
 * Class - ScopeAlso
 * @author - krish@techhabiles.com
 */
class ScopeFun(val name: String) {
    fun printName(){
        println("Name is $name")
    }
}

fun getObject(): ScopeFun? {
    return ScopeFun("Krish")
}

fun main() {
    val obj = getObject()
    val len = obj?.let {
        it.printName()
        it.name.length
    }

    println("Length is $len")
}