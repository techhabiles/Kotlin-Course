package com.techhabiles.sealed
/**
 * Class - Response
 * @author - krish@techhabiles.com
 */
sealed class Response {
}
fun main() {
   val net = Networking()
    val response = net.getNetworkData(true)
     when(response){
         is SuccessResponse -> println(" Response is  ${response.data}")
         is ErrorResponse -> println("Response error code is ${response.errorCode}")
     }
}