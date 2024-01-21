package com.techhabiles.nullsafety
/**
 * Class - NullSafetyExample
 * @author - krish@techhabiles.com
 */
class NullSafetyExample {
     val name: String? = "Krish"
     var lastName = "Chauhan"

    fun printLength(){
        var len1 = if( name != null ) name.length  else 0
        var len2 = lastName.length
        println("name length is $len1 and lastname length is $len2")

    }
}

fun main() {
    val obj = NullSafetyExample()
    obj.printLength()

}