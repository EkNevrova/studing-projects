package ru.eknevrova.project11.task5;

// Напишите программу, которая создает два потока: "Поток 1" и "Поток 2". Каждый поток должен выводить
// своё имя в консоль 10 раз с интервалом в 1 секунду. При этом "Поток 1" должен начать свою работу первым
// закончить последним, а "Поток 2" - наоборот: начать последним и закончить первым.

public class Task5 {
    public static void main(String[] args) throws InterruptedException {
        Thread firstThread = new Thread(
                () -> printThreadName("Поток 1")
        );
        Thread secondThread = new Thread(
                () -> printThreadName("Поток 2")
        );

        firstThread.start();
        secondThread.start();
        secondThread.join();
        firstThread.join();
    }

    private static void printThreadName(String threadName) {
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println(threadName + " - " + (i + 1));
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(threadName + " прерван.");
            }
        }
    }
}
