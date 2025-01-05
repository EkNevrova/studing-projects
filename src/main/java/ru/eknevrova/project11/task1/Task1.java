package ru.eknevrova.project11.task1;

//Task1: Напишите программу, которая создает два потока, каждый из которых выводит на экран числа от 1 до 10.
// Но при этом первый поток должен выводить только четные числа, а второй - только нечетные.

public class Task1 {
    public static void main (String[] args) {
        Thread firstThread = new Thread(new MyThread(true));
        Thread seconedThread = new Thread(new MyThread(false));

        firstThread.start();
        seconedThread.start();
    }
}
