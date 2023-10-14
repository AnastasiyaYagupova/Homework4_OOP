package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество символов, которые хотите передать в калькулятор: ");
        Integer count = scanner.nextInt();
        System.out.println("Введите числа, которые хотите посчитаь через ENTER ");
        List<Double> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            list.add(scanner.nextDouble());
        }
        Calculator calculator = new Calculator();
        System.out.println("Сумма данных чисел = " + calculator.sum(list));
        System.out.println("Произведение данных чисел = " + calculator.mult(list));
        System.out.println("Частное данных чисел = " + calculator.div(list));
        calculator.binary(list);



    }
}