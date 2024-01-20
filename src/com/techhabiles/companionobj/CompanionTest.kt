package com.techhabiles.companionobj

/**
 * Class - CompanionTest
 * @author - krish@techhabiles.com
 */

open class CompanionSuper{
    fun printFromCompanionSuper(){
        println("I am form CompanionSuper")
    }
}
class CompanionTest private constructor() {
    fun printTop(){
        println("From top level")
    }
    companion object Named : CompanionSuper(){
        private val instance = CompanionTest()

        fun getInstance(): CompanionTest{
            return instance
        }
        fun printCompanion(){
            println("Companion Object")
        }
    }

}

fun main() {
    CompanionTest.printCompanion()
    CompanionTest.printFromCompanionSuper()
    CompanionTest.getInstance().printTop()
}