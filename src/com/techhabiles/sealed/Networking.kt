package com.techhabiles.sealed

/**
 * Class - Networking
 * @author - krish@techhabiles.com
 */
class Networking {

    fun getNetworkData(success: Boolean) : Response {
        if(success){
            return SuccessResponse("This is success data from server")
        }else {
            return ErrorResponse(400, "Bad Request")
        }

    }
}