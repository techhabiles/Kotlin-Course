package com.techhabiles.generics

/**
 * Class - Box
 * @author - krish@techhabiles.com
 */

/*class Box(val values: ArrayList<String> = ArrayList()) {
    fun add(x: String){
        values.add(x)
    }

    fun remove(x: String){
        values.remove(x)
    }

    fun printBox(){
        for( v in values){
            println(" Value is $v")
        }
    }
}

class NewsBox(val values: ArrayList<News> = ArrayList()) {
    fun add(x: News){
        values.add(x)
    }

    fun remove(x: News){
        values.remove(x)
    }

    fun printBox(){
        for( v in values){
            println(" Value is $v")
        }
    }
}*/
class GenericBox<T> (val values: ArrayList<T> = ArrayList()) {
    fun add(x: T){
        values.add(x)
    }

    fun remove(x: T){
        values.remove(x)
    }

    fun printBox(){
        for( v in values){
            println(" Value is $v")
        }
    }
}


class News( val title: String) {
    override fun toString(): String {
        return title
    }
}

fun main() {
    val box = GenericBox<News>()
    box.add(News("News 1"))
    box.add(News("News 2"))
    box.printBox()
    /* val b = NewsBox()
     b.add(News("News 1"))
     b.add(News("News 2"))
     b.add(News("News 3"))
     b.printBox()
     val b = Box()
     b.add("25")
     b.add("27")
     b.add("29")
     b.remove("27")
     b.printBox()*/
}