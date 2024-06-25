package com.example.calculator;

public interface CalculatorService {
    String welcome();

    String welcomeUser();

    String calculationPlus(Integer num1, Integer num2);

    String calculationMinus(Integer num1, Integer num2);

    String calculationMultiply(Integer num1, Integer num2);

    String calculationDivide(Integer num1, Integer num2);
}
