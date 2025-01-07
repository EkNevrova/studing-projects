package ru.eknevrova.project11.task3;

// Создайте программу, которая считает сумму квадратов первых N натуральных чисел, используя многопоточность.
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение N: ");
        int N = scanner.nextInt();
        int mid = N / 2; // используем 2 потока

        SumAction taskFirst = new SumAction(1, mid);
        SumAction taskSecond = new SumAction(mid + 1, N);

        Thread firstThread = new Thread(taskFirst);
        Thread secondTthread = new Thread(taskSecond);

        firstThread.start();
        secondTthread.start();

        try {
            firstThread.join();
            secondTthread.join();
        } catch (InterruptedException e) {
            System.out.println("Поток прерван: " + e.getMessage());
        }

        long totalSum = taskFirst.getResult() + taskSecond.getResult();
            System.out.println("Сумма квадратов первых " + N + " натуральных чисел: " + totalSum);
    }
}