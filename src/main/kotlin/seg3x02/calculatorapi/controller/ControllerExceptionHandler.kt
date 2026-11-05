package seg3x02.calculatorapi.controller

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
class ControllerExceptionHandler {

    @ExceptionHandler(ArithmeticException::class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    fun handleArithmetic(ex: ArithmeticException): ResponseEntity<String> =
        ResponseEntity.badRequest().body("Unable to process request: ${ex.message}")

    @ExceptionHandler
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    fun handleException(ex: Exception): ResponseEntity<String> =
        ResponseEntity.badRequest().body("Unable to process request")
}
