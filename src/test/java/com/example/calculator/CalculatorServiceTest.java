package com.example.calculator;

import com.example.calculator.exception.DivByZeroException;
import com.example.calculator.service.CalculatorService;
import com.example.calculator.service.CheckService;
import com.example.calculator.service.CheckServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorServiceTest {
    private final CheckService checkService = new CheckServiceImpl();
    private final CalculatorService calculatorService = new CalculatorService(checkService);


    @Test
    public void plus_test() {
        int num1 = 5;
        int num2 = 2;
        Number expected = num1 + num2; // expected = 7
        Number actual = calculatorService.plus(num1, num2);
        Assertions.assertEquals(expected, actual);

        num1 = 0;
        num2 = -2;
        expected = num1 + num2; // expected = -2
        actual = calculatorService.plus(num1, num2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minus_test() {
        int num1 = 5;
        int num2 = 2;
        Number expected = num1 - num2; // expected = 3
        Number actual = calculatorService.minus(num1, num2);
        Assertions.assertEquals(expected, actual);

        num1 = 0;
        num2 = -2;
        expected = num1 - num2; // expected = 2
        actual = calculatorService.minus(num1, num2);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void multiply_test() {
        int num1 = 5;
        int num2 = 2;
        Number expected = num1 * num2; // expected = 10
        Number actual = calculatorService.multiply(num1, num2);
        Assertions.assertEquals(expected, actual);

        num1 = 5;
        num2 = -2;
        expected = num1 * num2; // expected = -10
        actual = calculatorService.multiply(num1, num2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void divide_positive_test() {
        int num1 = 1;
        int num2 = -1;
        Number expected = num1 / num2; // expected = -1.0
        Number actual = calculatorService.divide(num1, num2);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void divide_negative_test() {
        int num1 = 1;
        int num2 = 0;

        Assertions.assertThrows(DivByZeroException.class, () -> calculatorService.divide(num1, num2));
    }

}


