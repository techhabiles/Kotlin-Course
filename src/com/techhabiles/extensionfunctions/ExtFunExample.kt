package com.techhabiles.extensionfunctions

/**
 * Class - ExtFunExample
 * @author - krish@techhabiles.com
 */
class ExtFunExample {
    fun printInt(x: Int){
        println(" Int is $x")
    }
}

fun <T> ExtFunExample.printValue(y: T){
    println("String is $y and this is $this")
}

fun main() {
    val obj = ExtFunExample()
    println(obj)
    obj.printInt(4)
    obj.printValue(98)
}