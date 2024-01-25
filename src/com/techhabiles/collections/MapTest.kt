package com.techhabiles.collections


fun main() {
    val map = mapOf("One" to 1, "two" to 2)
    for( a in map.keys){
        println("Key is $a")
    }

    for( b in map.values){
        println("value is $b")
    }

    for ((a, b ) in map.entries){
        println("Key is $a and value is $b")
    }

    map.forEach { (t, u )->
        println("Key is $t and value is $u")
    }
 //LinkedHashMap
    val map1 = mutableMapOf<String?, Int>("one" to 1, "two" to 2).also {
        it.put("three", 3)
        it.put(null, 4)
        it.put(null, 5)
        it.put("four", 5)
    }

    map1.forEach{(a , b ) ->
        println("Key is $a and value is $b")
    }

    // HashMap

    val map2 = HashMap<String, String>().also {
        it.put("one","One")
    }




}
/**
 * Class - MapTest
 * @author - krish@techhabiles.com
 */
