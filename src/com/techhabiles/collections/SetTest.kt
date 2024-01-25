package com.techhabiles.collections

fun main() {
    val set = setOf("One","Two","Three","Three")
    set.forEach{
        println("$it")
    }
    val it = set.iterator()
    while(it.hasNext())
    {
        println("${it.next()}")
    }

    // LinkedHashSet
    val set1 = mutableSetOf<Int>().run {
        add(1)
        add(2)
        add(3)
        this
    }
    set1.add(2)
    set1.forEach{
        println("$it")
    }

    val set2 = HashSet<Int>().also{
        it.add(1)
        it.add(2)
        it.add(3)
    }

    set2.remove(2)
    set2.add(4)
    set2.remove(1)
    set2.add(2)
    set2.forEach {
        println(it)
    }

    val set3 = mutableSetOf<Int?>(1,2,null, 3, null)
    set3.forEach {
        println(it)
    }
}

/**
 * Class - SEtTest
 * @author - krish@techhabiles.com
 */