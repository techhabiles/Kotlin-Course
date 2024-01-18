package com.techhabiles.data

 data class News(val title: String, val desc: String) {

     var isSportsNews = false
     override fun equals(other: Any?): Boolean {
         val news = other as News
         return news.isSportsNews == isSportsNews && news.desc == desc && news.title == title
     }
    /* fun isEqual(news: News): Boolean {
         return  news.title == title && news.desc == desc
     }

     fun getString(): String{
         return "News(title=$title , desc=$desc)"
     }*/
}

fun main() {
    val news1 = News("news", "news desc")
    /*val news2 = news1.copy()
    news2.isSportsNews = true
   // val news2 = News("news", "news desc")
    println(news1.equals(news2))
    println(news2.title)
    println(news1.component1())
    println(news1.component2())
    //println(news1.component3())*/

    val (a, b) = news1
    println("a is $a and b is $b")
}