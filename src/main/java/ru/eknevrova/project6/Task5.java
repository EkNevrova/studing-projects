package ru.eknevrova.project6;

//Создайте программу, вычисляющую факториал целого числа n,
//которое пользователь введёт с клавиатуры, используя цикл for.

import java.util.Scanner;

public class Task5 {
    public static void printFactorial() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int result = 1;
        for (int n = 1; n<=num; n++) {
            result = result * n;
        }
        System.out.println("Факториал = " + result);
    }
}