package com.techhabiles.lateinitvslazy

/**
 * Class - LateInitLazyTest
 * @author - krish@techhabiles.com
 */
class LateInitLazyTest {
    lateinit var firstName:String
    val lastName: Int? by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        1
    }

    fun setName(name: String){
        this.firstName = name
    }

    fun print(){
        println("Value of name is $lastName")
    }

}


fun main() {
    val obj = LateInitLazyTest()
    obj.print()
    obj.setName("Krish")
    obj.print()
    obj.setName("Ravi")
    obj.print()
}