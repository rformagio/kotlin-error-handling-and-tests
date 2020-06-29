package br.com.rformagio.person.exception

data class ApiError(val status: HttpStatus,
                    val message: String,
                    val errors: List<String>) {


    constructor(status: HttpStatus,
                message: String,
                error: String) :
            this(status, message, listOf(error))
}