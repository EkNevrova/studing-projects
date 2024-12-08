package ru.eknevrova.project6;

// Напишите программу, в которой пользователь вводит целое число и она выводит на экран,
// является ли целое число записанное в переменную n, чётным либо нечётным. Используйте
// тернарный оператор.

import java.util.Scanner;

public class Task2 {
    public static void determineEvenOdd() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String result = n % 2 == 0 ? "Чётное число" : "Нечётное число";
        System.out.println(result);
    }
}