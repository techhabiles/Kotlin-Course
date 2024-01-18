package com.techhabiles.any

/**
 * Class - TestAny
 * @author - krish@techhabiles.com
 */
open class SuperAny {

}
class TestAny  : SuperAny(){
    override fun equals(any: Any?) : Boolean {
        return false
    }
}

fun main() {
    val test = TestAny()
    println(test.equals(test))
    println(test.toString())
    println(test.hashCode())
}