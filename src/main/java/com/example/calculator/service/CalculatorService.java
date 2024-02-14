package com.example.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    private final CheckService checkService;

    public CalculatorService(CheckService checkService) {
        this.checkService = checkService;
    }




    public int plus(Integer num1, Integer num2) {
        checkService.checkNumbers(num1, num2);
        return num1 + num2;
    }

    public int minus(Integer num1, Integer num2) {
        checkService.checkNumbers(num1, num2);
        return num1 - num2;
    }

    public int multiply(Integer num1, Integer num2) {
        checkService.checkNumbers(num1, num2);
        return num1 * num2;
    }

    public int divide(Integer num1, Integer num2) {
        checkService.checkNumbers(num1, num2);
        checkService.checkDivisionByZero(num2);
        return num1 / num2;
    }
}