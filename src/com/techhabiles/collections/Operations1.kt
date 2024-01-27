package com.techhabiles.collections

fun getUserMap(): Map<String, User>{
    return mapOf(
        "9899" to User("Krish", 34),
        "9898" to User("Ravi", 33),
        "9897" to User("Amit", 25),
        "9896" to User("Rupesh", 18),

    )
}

fun checkUser(user: User): Boolean {
    return user.age > 20
}
fun main() {
    val userList = getUserList()
    val result = userList.shuffle()
    println(userList)
    /*val result = userList.asReversed()
    userList.add(User("ABC", 30))
    println(result)
    val result = userList.reversed()
    println(result)
    val result = userList.sortedDescending()
    println(result)
    val result = userList.sortedBy { it.age }
    println(result)
    val result = userList.sorted()
    println(result)
    val data = listOf("abc","def","brt","dac")
    val result = data.sorted()
    println(result)
    val result = userList.contains(User("Krish", 45))
   println(result)
   val result  = userList.random()
   println(result)
   val result = userList.findLast { it.name.length > 4 }
   println(result)
   val result = userList.last {
       it.name.startsWith("A")
   }
   println(result)
   val result = userList.chunked(2)
   println(result)
    val result = userList.dropLast(2)
    println(result)
    val result = userList.takeLast(3)
    println(result)
    val result = userList.slice(1..2)
    println(result)
    val result = userList.groupBy { it.name.first().uppercase() }
    println(result)
    val result = userList.all { it.name.length > 3 }
   println(result)
  val result = userList.none { it.name.startsWith("K") }
   println(result)
   val result = userList.any { it.name.startsWith("K") }
   println(result)
   val (first, second) = userList.partition { it.age > 20 }
   println(first)
   println(second)
   val result = userList.filterNot {  it.age > 20 }
   println(result)
    val result = userList.filterIndexed{ index, user ->
        if (user.name.startsWith("K")) {
            true
        }
        else {
            false
        }

    }
    println(result)
    val result = userList.filter{
        it.age > 20
    }
    println(result)
    */


}