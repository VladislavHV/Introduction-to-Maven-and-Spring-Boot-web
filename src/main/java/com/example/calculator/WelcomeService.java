package com.example.calculator;

import org.springframework.stereotype.Service;

/*
Контроллер не должен вычислять результат, а только делегировать его вычисление сервису.
После получения от него результата контроллер должен сформировать строку и вернуть пользователю
в браузер.
 */
@Service
public class WelcomeService implements CalculatorService {

    public String welcome(){
        return "<b>Добро пожаловать</b>";
    }

    //Метод по адресу /calculator должен вернуть приветствие “Добро пожаловать в калькулятор".

    public String welcomeUser(){
        return "Добро пожаловать в калькулятор";
    }

    //Метод по адресу /calculator/plus?num1=5&num2=5 должен сложить num1 и num2 и вернуть
    // результат в формате “5 + 5 = 10”.

    public String calculationPlus(Integer num1, Integer num2){
        //Если какой-то из двух параметров (или оба) не поданы, нужно вернуть ошибку.
        if (num1 == null || num2 == null){
            throw new IllegalStateException("!!!Запишите переменную!!!");
        } else {
            return num1 + " + " + num2 + " = " + (num1 + num2);
        }
    }

    //Метод по адресу /calculator/minus?num1=5&num2=5 должен вычесть из num1 num2 и
    // вернуть результат в формате “5 − 5 = 0”.

    public String calculationMinus(Integer num1, Integer num2){
        //Если какой-то из двух параметров (или оба) не поданы, нужно вернуть ошибку.
        if (num1 == null || num2 == null){
            throw new IllegalStateException("!!!Запишите переменную!!!");
        } else {
            return num1 + " - " + num2 + " = " + (num1 - num2);
        }
    }

    //Метод по адресу /calculator/multiply?num1=5&num2=5 должен умножить num1 на num2 и
    //вернуть результат в формате “5 * 5 = 25”.

    public String calculationMultiply(Integer num1, Integer num2) {
        //Если какой-то из двух параметров (или оба) не поданы, нужно вернуть ошибку.
        if (num1 == null || num2 == null){
            throw new IllegalStateException("!!!Запишите переменную!!!");
            //Деление на 0 в Java выкидывает ошибку.
        } else if (num1 == 0 || num2 == 0){
            return "Умножать на ноль нельзя";
        } else {
            return num1 + " * " + num2 + " = " + (num1 * num2);
        }
    }

    //Метод по адресу /calculator/divide?num1=5&num2=5 должен разделить num1 на num2 и вернуть
    // результат в формате “5 / 5 = 1”.

    public String calculationDivide(Integer num1, Integer num2) {
        if (num1 == null || num2 == null){
            throw new IllegalStateException("!!!Запишите переменную!!!");
        //Деление на 0 в Java выкидывает ошибку.
        } else if (num1 == 0 || num2 == 0){
            return "Делить на ноль нельзя";
        } else {
            return num1 + " / " + num2 + " = " + (num1 / num2);
        }
    }
}
