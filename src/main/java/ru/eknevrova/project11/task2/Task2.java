package ru.eknevrova.project11.task2;

//Task 2: Напишите программу, которая создает два потока и выводит на экран числа от 1 до 10,
//сначала из первого потока, затем из второго потока. Каждое число должно быть выведено в формате
// "Поток X: число Y", где X - номер потока (1 или 2), а Y - число от 1 до 10.

public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();

        Thread firstThread = new Thread(
                () -> printNumbers("Поток 1", lock)
        );

        Thread secondThread = new Thread(
                () -> printNumbers("Поток 2", lock)
        );

        firstThread.start();
        secondThread.start();
    }

    private static void printNumbers(String threadName, Object lock) {
        synchronized (lock) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(threadName + ": число " + i);
                lock.notify();
                try {
                    if (i < 10) {
                        lock.wait();
                    }
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    System.out.println(threadName + " был прерван");
                }
            }
        }
    }
}
