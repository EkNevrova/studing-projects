package ru.eknevrova.project11.task4;

import java.util.Random;

public static class Car implements Runnable {
    private String name; // Название машины
    private int distance; // Дистанция заезда
    private int progress; // Пройденное расстояние
    private Random random;

    public Car(String name, int distance) {
        this.name = name;
        this.distance = distance;
        this.progress = 0;
        this.random = new Random();
    }

    @Override
    public void run() {
        while (progress < distance) {
            // Генерируем случайную скорость (от 1 до 5 метров в секунду)
            int speed = random.nextInt(5) + 1;
            progress += speed;

            // Усыпляем поток на 1 секунду, чтобы имитировать движение
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(name + " была остановлена!");
            }

            // Выводим прогресс
            System.out.println(name + " проехала " + progress + " метров");

            // Проверяем, достигнута ли дистанция
            if (progress >= distance) {
                System.out.println(name + " пересекла финишную линию!");
            }
        }
    }
