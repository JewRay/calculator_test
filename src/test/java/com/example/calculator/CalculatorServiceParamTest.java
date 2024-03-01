package com.example.calculator;

import com.example.calculator.service.CalculatorService;
import com.example.calculator.service.CheckService;
import com.example.calculator.service.CheckServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CalculatorServiceParamTest {
    private final CheckService checkService = new CheckServiceImpl();
    private final CalculatorService calculatorService = new CalculatorService(checkService);

    public static Stream<Arguments> paramsForPlusTest() {
        return Stream.of(
                Arguments.of(1, 2, 3),
                Arguments.of(1, -1, 0),
                Arguments.of(5, 5, 10)
        );

    }

    @ParameterizedTest
    @MethodSource("paramsForPlusTest")
    public void plusTest(int num1, int num2, Number expected) {
        Number actual = calculatorService.plus(num1, num2);
        Assertions.assertEquals(expected, actual);
    }


    public static Stream<Arguments> paramsForMinusTest() {
        return Stream.of(
                Arguments.of(1, 2, -1),
                Arguments.of(1, -1, 2),
                Arguments.of(5, 5, 0)
        );

    }

    @ParameterizedTest
    @MethodSource("paramsForMinusTest")
    public void minusTest(int num1, int num2, Number expected) {
        Number actual = calculatorService.minus(num1, num2);
        Assertions.assertEquals(expected, actual);
    }

    public static Stream<Arguments> paramsForMultiplyTest() {
        return Stream.of(
                Arguments.of(1, 2, 2),
                Arguments.of(1, -1, -1),
                Arguments.of(5, 5, 25)
        );

    }

    @ParameterizedTest
    @MethodSource("paramsForMultiplyTest")
    public void multiplyTest(int num1, int num2, Number expected) {
        Number actual = calculatorService.multiply(num1, num2);
        Assertions.assertEquals(expected, actual);
    }

    public static Stream<Arguments> paramsForDivideTest() {
        return Stream.of(
                Arguments.of(1, -1, -1),
                Arguments.of(5, 5, 1)
        );

    }

    @ParameterizedTest
    @MethodSource("paramsForDivideTest")
    public void divideTest(int num1, int num2, Number expected) {
        Number actual = calculatorService.divide(num1, num2);
        Assertions.assertEquals(expected, actual);
    }
}
