package com.example.calculator.service;

import com.example.calculator.exception.DivByZeroException;
import com.example.calculator.exception.InputErrorException;
import org.springframework.stereotype.Service;


@Service
public class CheckServiceImpl implements CheckService {
    public void checkNumbers(Integer num1, Integer num2) {
        if (num1 == null) {
            throw new InputErrorException("Необходимо ввести значение num1.");
        } else if (num2 == null) {
            throw new InputErrorException("Необходимо ввести значение num2.");
        } else if (num1 == null && num2 == null) {
            throw new InputErrorException("Необходимо ввести значения num1 и num2.");
        }
    }

    @Override
    public void checkDivisionByZero(Integer num2) {
        if (num2 == 0) {
            throw new DivByZeroException("На ноль делить нельзя!");
        }
    }


}
