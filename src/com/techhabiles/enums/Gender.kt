package com.techhabiles.enums

enum class Gender(val genderName: String) : ColorDefination{
    MALE("Male"){
        override fun getHeight(): Int {
            return 168
        }
        override fun isBlack(): Boolean {
            return true
        }
                },
    FEMALE("Female"){
        override fun getHeight(): Int {
            return 160
        }
        override fun isBlack(): Boolean {
            return false
        }
                    },
    OTHER("Other"){
        override fun getHeight(): Int {
            return 155
        }
        override fun isBlack(): Boolean {
            return true
        }
    }
    ;


    fun getGenderNameValue(): String{
        return genderName
    }

    abstract fun getHeight(): Int
}

fun main() {
    val female = Gender.OTHER
    val discount = getDiscount(female)
    println("Discount is $discount%")
    /*println(female.getGenderNameValue())
    println(female.getHeight())
    println(female.isBlack())

    for( gender in Gender.entries){
        println(gender.isBlack())
        println(gender.getHeight())
        println(gender.name)
        println(gender.ordinal)
    }*/
}
fun getDiscount(gender: Gender): Int{
    return when(gender){
        Gender.MALE -> 10
        Gender.FEMALE -> 20
        else -> 25
        //Gender.OTHER -> 30
    }
}