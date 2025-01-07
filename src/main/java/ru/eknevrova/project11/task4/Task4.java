package ru.eknevrova.project11.task4;

//Создайте программу, которая будет имитировать гонки на машине. У вас есть две машины, каждая из которых
//может двигаться со случайной скоростью в диапазоне от 1 до 5 метров в секунду. Заезд должен начинаться
//одновременно для обеих машин, и победитель определяется той машиной, которая пройдет заранее заданное расстояние.

public class Task4 {
    public static void main(String[] args) throws InterruptedException {
        int raceDistance = 50;

        Car carFirst = new Car("Первая машина", raceDistance);
        Car carSecond = new Car("Вторая машина", raceDistance);

        Thread carFirstThread = new Thread(carFirst);
        Thread carSecondThread = new Thread(carSecond);

        System.out.println("Гонка начинается!");
        carFirstThread.start();
        carSecondThread.start();

        carFirstThread.join();
        carSecondThread.join();

        System.out.println("Гонка завершена!");
    }
}
