package com.techhabiles.exceptionhandling

import kotlin.contracts.Effect

class ExceptionTest() : Exception(){
}

fun main() {
    val num1 = 0
    val num2 = 1
    val num = try {
        val a = num2 / num1
        println(a)
       // throw ExceptionTest()
       2
    }catch(ex: ArithmeticException){
        println("Error is ${ex.localizedMessage}")
        4
    }
    catch(ex1: Exception){
        println("In Exception")
        3
    }finally {
        println("In Finally")
    }

   println("Num is $num")

}




/**
 * Class - ExceptionTest
 * @author - krish@techhabiles.com
 */