package com.example.calculator.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandlerEx {
    @ExceptionHandler(InputErrorException.class)
    public ResponseEntity<String> handleInputErrorException(InputErrorException e) {
        return ResponseEntity
                .badRequest()
                .body(e.getMessage());
    }

    @ExceptionHandler(DivByZeroException.class)
    public ResponseEntity<String> handleDivByZeroException(DivByZeroException e) {
        return ResponseEntity
                .badRequest()
                .body(e.getMessage());
    }


}
