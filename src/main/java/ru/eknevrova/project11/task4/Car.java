package ru.eknevrova.project11.task4;

import java.util.Random;

public class Car implements Runnable {
    private String name;
    private int distance;
    private int progress;
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
            int speed = random.nextInt(5) + 1;
            progress += speed;

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(name + " была остановлена!");
            }

            System.out.println(name + " проехала " + progress + " метров");

            if (progress >= distance) {
                System.out.println(name + " пересекла финишную линию!");
            }
        }
    }
}