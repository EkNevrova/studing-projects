package ru.eknevrova.project11.task4;

//Создайте программу, которая будет имитировать гонки на машине. У вас есть две машины, каждая из которых
//может двигаться со случайной скоростью в диапазоне от 1 до 5 метров в секунду. Заезд должен начинаться
// одновременно для обеих машин, и победитель определяется той машиной, которая пройдет заранее заданное расстояние.

public class Task4 {
    public static void main(String[] args) throws InterruptedException {
        int raceDistance = 50; // Задаём дистанцию заезда

        // Создаём машины
        Car car1 = new Car("Машина 1", raceDistance);
        Car car2 = new Car("Машина 2", raceDistance);

        // Создаём потоки для машин
        Thread car1Thread = new Thread(car1);
        Thread car2Thread = new Thread(car2);

        // Стартуем гонку
        System.out.println("Гонка начинается!");
        car1Thread.start();
        car2Thread.start();

        // Ждём завершения потоков
        car1Thread.join();
        car2Thread.join();

        System.out.println("Гонка завершена!");
    }
}
