package com.techhabiles.exceptionhandling

/**
 * Class - MyException
 * @author - krish@techhabiles.com
 */
class MyException(val msg: String) : Exception(msg) {
}

fun testCustomError(num: Int){
    if( num == 0)
        throw MyException("Parameter can not be 0")
}

fun main() {
    try {
        testCustomError(0)
    }catch(ex: MyException){
        println("Cuse is ${ex.localizedMessage}")
        ex.printStackTrace()
    }
}