package com.techhabiles.collections


class Person(var name: String){}
fun main() {

    val  list =  listOf("one", "Two","Three")
    val list1 = list.plus("fours")
    val it = list.iterator()
    while(it.hasNext()){
        println("Object is ${it.next()}")
    }

    val mutableList = mutableListOf("one","Two", "Three")
    println(mutableList.size)
    mutableList.add("Four")
    println(mutableList.size)
    //val it1 = mutableList.listIterator()
    mutableList.add("Five")
    println(mutableList.size)
    mutableList.add("Five")
    mutableList.add(0, "Six")
    mutableList.forEach{
        println(it)
    }

    val mList1 = mutableList.toMutableSet()
    for (s in mList1) {
        println("To set $s")

    }



    val a = ArrayList<String>().also{
        it.add("One")
        it.add("Two")
    }
    a.remove("Two")

    println(a.size)

    val readOnly = listOf(Person("Krish"), Person("Ravi"))
    readOnly[0].name = "Amit"
    readOnly.forEach{
        println(it.name)
    }


}






/**
 * Class - CollectionsTest
 * @author - krish@techhabiles.com
 */