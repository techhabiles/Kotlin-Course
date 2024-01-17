package com.techhabiles.sealed

/**
 * Class - ErrorResponse
 * @author - krish@techhabiles.com
 */
class ErrorResponse(val errorCode: Int, val errorMessage: String) : Response() {
}