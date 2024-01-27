package com.techhabiles.collections

data class User(val name:String, val age:Int): Comparable<User>{
    override fun compareTo(other: User): Int {
        // positive - greater
        // negative - less than
        // zero == equal
        if( name.length > other.name.length)
            return 1
        else if( name.length < other.name.length)
            return -1
        else
            return  0
    }

}

class UserGroup(val users: List<User>){}

fun getUserList() : ArrayList<User>{
    return ArrayList<User>().apply {
        add(User("Krish",45))
        add(User("Ravi", 25))
        add(User("Amit", 30))
        add(User("Anees", 20))
        add(User("Rupesh", 22))
    }
}
fun getSecondUserList() : List<User>{
    return mutableListOf<User>().apply {
        add(User("Arjun",35))
        add(User("Bheem", 25))
        add(User("Ram", 12))
        add(User("Bharat", 10))
    }
}
fun printClassName(obj: Any){
    println("Class name is ${obj::class.simpleName}")
}
fun main() {
    val num1 = listOf("one", "two","Three","Four")
     val result = num1.joinToString(separator = "| ", prefix = "Start: ",
         postfix = " :End", limit =  5, truncated = "???", transform = {it.last().uppercase()})
    println(result)
    printClassName(result)
    /*
     val num2 = listOf("Five", "Siz","Seven")
     val num3 = listOf(num1, num2)
     //println(num3)
     val result = num3.flatten()
     println(result)

     val result = num1.associateBy(keySelector = { it.first().uppercase()}, valueTransform = {it.length})
     printClassName(result)
     println(result)
      val result = num1.associateBy { it.first().uppercase() }
     printClassName(result)
     println(result)

     val result = num1.associateWith { it.length }
     printClassName(result)
     println(result)

     val num2 = listOf(1, 2, 3, 4)

      val result = num1.zip(num2)
     println(result)
     var result1 = result.unzip()
     println(result1)
     val userList = getUserList()

      val list = mutableListOf<String>()
      for(user in userList){
          list.add(user.name)
      }
      println(list)
      val indexUserList = userList.mapIndexed{ index, user ->
           "User index is $index and user name is ${user.name}"
      }
      println(indexUserList)
      printClassName(userList)
      val mappedUser = userList.mapNotNull {
          if(it.name.startsWith("K"))
              null
          else
              it.name
      }
      println(mappedUser)
      userList.map {
          it.name.length
      }.also {
          printClassName(it)
          println(it)
      }*/
}