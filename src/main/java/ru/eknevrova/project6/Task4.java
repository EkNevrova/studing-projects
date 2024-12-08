package ru.eknevrova.project6;

//Выведете на экран последовательность чисел 1 2 4 8 16 32 64 128 256 512,
//сначала используя цикл while, а затем do..while.

public class Task4 {
    public static void printNum() {
        int num1 = 1;
        while (num1 <= 512) {
            System.out.println(num1);
            num1 = num1 * 2;
        }
        int num2 = 1;
        do {
            System.out.println(num2);
            num2 = num2 * 2;
        } while (num2 <= 512);
    }
}