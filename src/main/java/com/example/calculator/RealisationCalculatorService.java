package com.example.calculator;

import org.springframework.stereotype.Service;

/*
Контроллер не должен вычислять результат, а только делегировать его вычисление сервису.
После получения от него результата контроллер должен сформировать строку и вернуть пользователю
в браузер.
 */
@Service
public class RealisationCalculatorService implements CalculatorService {

    //Метод по адресу /calculator/plus?num1=5&num2=5 должен сложить num1 и num2 и вернуть
    // результат в формате “5 + 5 = 10”.

    @Override
    public int calculationPlus(int num1, int num2) {
        return num1 + num2;
    }

    //Метод по адресу /calculator/minus?num1=5&num2=5 должен вычесть из num1 num2 и
    // вернуть результат в формате “5 − 5 = 0”.

    @Override
    public int calculationMinus(int num1, int num2) {
        return num1 - num2;
    }

    //Метод по адресу /calculator/multiply?num1=5&num2=5 должен умножить num1 на num2 и
    //вернуть результат в формате “5 * 5 = 25”.

    @Override
    public int calculationMultiply(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Деление на ноль");
        }
        return num1 * num2;
    }

    //Метод по адресу /calculator/divide?num1=5&num2=5 должен разделить num1 на num2 и вернуть
    // результат в формате “5 / 5 = 1”.

    @Override
    public int calculationDivide(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Деление на ноль");
        }
        return num1 / num2;
    }
}
