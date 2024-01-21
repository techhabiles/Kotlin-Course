package com.techhabiles.nullsafety
/**
 * Class - SafeCaseExample
 * @author - krish@techhabiles.com
 */

open class A{}
class B : A(){}

class C{}

fun main() {
    val b  = B()
    val c = C()

    val a:A? = c as? A
    println(a)
}
