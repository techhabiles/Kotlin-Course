package com.techhabiles.data

/**
 * Class - PariExample
 * @author - krish@techhabiles.com
 */
class PairExample {

    fun getTwoValues(): Pair<Int, String> {
        return Pair(2, "String Result")
    }

    fun getThreeValues(): Triple<Int, Int, String> {
        return Triple(2, 4, "Triple Result")
    }
}

fun main() {
    val tripleExample = PairExample()
    val result = tripleExample.getThreeValues()
    println(result.first)
    println(result.second)
    println(result.third)
    /*val pairExample = PairExample()
     val result = pairExample.getTwoValues()
     println(result.first)
    println(result.second)*/
}