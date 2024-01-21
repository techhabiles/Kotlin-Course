package com.techhabiles.generics

/**
 * Class - MyPair
 * @author - krish@techhabiles.com
 */
data class MyPair<T,R>(private val x: T, private val y: R) {
    val first = x
    val second = y
}

fun getTwoValues(): MyPair<Int, Int>{
    return MyPair(2,3)
}

fun main() {
    val result = getTwoValues()
    println(result.first)
    println(result.second)
}