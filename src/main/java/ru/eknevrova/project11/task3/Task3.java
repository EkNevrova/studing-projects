package ru.eknevrova.project11.task3;

// Создайте программу, которая считает сумму квадратов первых N натуральных чисел, используя многопоточность.

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) throws InterruptedException {
        int N = 100; // Суммируем квадраты первых N чисел
        int numberOfThreads = 4; // Количество потоков
        int range = N / numberOfThreads; // Диапазон чисел для каждого потока

        List<Thread> threads = new ArrayList<>();
        List<SquareSum> tasks = new ArrayList<>();

        // Создаем задачи и потоки
        for (int i = 0; i < numberOfThreads; i++) {
            int start = i * range + 1;
            int end = (i == numberOfThreads - 1) ? N : start + range - 1;

            SquareSum task = new SquareSum(start, end);
            tasks.add(task);
            Thread thread = new Thread(task);
            threads.add(thread);
        }

        // Запускаем потоки
        for (Thread thread : threads) {
            thread.start();
        }

        // Ожидаем завершения потоков
        for (Thread thread : threads) {
            thread.join();
        }

        // Суммируем результаты
        long totalSum = 0;
        for (SquareSum task : tasks) {
            totalSum += task.getPartialSum();
        }

        System.out.println("Сумма квадратов первых " + N + " чисел: " + totalSum);
    }
}
