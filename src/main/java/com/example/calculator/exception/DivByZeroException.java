package com.example.calculator.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class DivByZeroException extends IllegalArgumentException {
    public DivByZeroException() {
        super();
    }

    public DivByZeroException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return super.getMessage();
    }
}
