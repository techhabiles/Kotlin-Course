package com.techhabiles.objectexp

/**
 * Class - ObjectExpWithSuper
 * @author - krish@techhabiles.com
 */
abstract class ObjectExpWithSuper {
    abstract fun printClassName()
}

interface PrintExtraInfo {
    fun printExtra()
}

val obj = object : ObjectExpWithSuper(){
    override fun printClassName() {
        println(" Class name is ObjectExpWithSuper")
    }
}

val obj1 = object : PrintExtraInfo{
    override fun printExtra() {
        println("this is extra info")
    }
}

val obj2:PrintExtraInfo  = object : ObjectExpWithSuper(), PrintExtraInfo {
    override fun printClassName() {
        println(" Class name is ObjectExpWithSuper")
    }
    override fun printExtra() {
        println("this is extra info")
    }
}

fun main() {
    obj1.printExtra()
    obj.printClassName()
    obj2.printExtra()
}