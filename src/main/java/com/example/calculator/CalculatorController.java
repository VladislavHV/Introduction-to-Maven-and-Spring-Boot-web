package com.example.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private CalculatorService welcomeService = new WelcomeService();

    @GetMapping
    public String welcome(){
        return welcomeService.welcome();
    }

    //Метод по адресу /calculator должен вернуть приветствие “Добро пожаловать в калькулятор".

    @GetMapping(path = "/calculator")
    public String welcomeUser(){
        return welcomeService.welcomeUser();
    }

    //Метод по адресу /calculator/plus?num1=5&num2=5 должен сложить num1 и num2 и вернуть
    // результат в формате “5 + 5 = 10”.

    @GetMapping(path = "/calculator/plus")
    public String calculationPlus(Integer num1, Integer num2){
        //Если какой-то из двух параметров (или оба) не поданы, нужно вернуть ошибку.
        if (num1 == null || num2 == null){
            throw new IllegalStateException("!!!Запишите переменную!!!");
        } else {
            return welcomeService.calculationPlus(num1, num2);
        }
    }

    //Метод по адресу /calculator/minus?num1=5&num2=5 должен вычесть из num1 num2 и
    // вернуть результат в формате “5 − 5 = 0”.

    @GetMapping(path = "/calculator/minus")
    public String calculationMinus(Integer num1, Integer num2){
        //Если какой-то из двух параметров (или оба) не поданы, нужно вернуть ошибку.
        if (num1 == null || num2 == null){
            throw new IllegalStateException("!!!Запишите переменную!!!");
        } else {
            return welcomeService.calculationMinus(num1, num2);
        }
    }

    //Метод по адресу /calculator/multiply?num1=5&num2=5 должен умножить num1 на num2 и
    //вернуть результат в формате “5 * 5 = 25”.

    @GetMapping(path = "/calculator/multiply")
    public String calculationMultiply(Integer num1, Integer num2) {
        //Если какой-то из двух параметров (или оба) не поданы, нужно вернуть ошибку.
        if (num1 == null || num2 == null){
        throw new IllegalStateException("!!!Запишите переменную!!!");
        //Деление на 0 в Java выкидывает ошибку.
        } else if (num1 == 0 || num2 == 0){
            return welcomeService.calculationMultiply(num1, num2);
        } else {
            return welcomeService.calculationMultiply(num1, num2);
        }
    }

    //Метод по адресу /calculator/divide?num1=5&num2=5 должен разделить num1 на num2 и вернуть
    // результат в формате “5 / 5 = 1”.

    @GetMapping(path = "/calculator/divide")
    public String calculationDivide(Integer num1, Integer num2) {
        if (num1 == null || num2 == null){
            throw new IllegalStateException("!!!Запишите переменную!!!");
            //Деление на 0 в Java выкидывает ошибку.
        } else if (num1 == 0 || num2 == 0){
            return welcomeService.calculationDivide(num1, num2);
        } else {
            return welcomeService.calculationDivide(num1, num2);
        }
    }
}
