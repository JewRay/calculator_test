package com.example.calculator;

import com.example.calculator.service.CalculatorService;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorServiceTest {
    private final CalculatorService calculatorService;

    public CalculatorServiceTest(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }


    @Test
    public void plus_test(){
        int num1 = 5;
        int num2 = 2;
        Number expected= num1+num2;
        Number actual = calculatorService.plus(num1,num2);
        Assertions.assertEquals(expected,actual);
    }
}


