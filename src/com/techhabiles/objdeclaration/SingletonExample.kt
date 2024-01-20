package com.techhabiles.objdeclaration

/**
 * Class - SingletonExample
 * @author - krish@techhabiles.com
 */

open class Super{
    fun printSuper(){
        println("I am super")
    }
}

interface SuperInterface{
    fun printSuperInterface()
}
object SingletonExample : Super(), SuperInterface {
    fun printMe(){
        println("I am printing SingletonExample")
    }

    override fun printSuperInterface() {
        println(" I am from super interface")
    }
}

data object MyNews {
    var title: String = "News title"
}



fun main() {

    SingletonExample.printMe()
    SingletonExample.printSuper()
    SingletonExample.printSuperInterface()


}