package com.techhabiles.scopefun

/**
 * Class - ScopeAlso
 * @author - krish@techhabiles.com
 */
class ScopeAlso {
    fun print(){
        println("This is also example")
    }
}

fun main() {
    val obj = ScopeAlso().also {
        println(" Object creation in process")
    }

    obj.print()
}