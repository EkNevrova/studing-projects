package ru.eknevrova.project4;

public class Fish implements Swimable {
    @Override
    public void swim() {
        eat();
        System.out.println("Рыбка плавает в воде");
    }

    private void eat() {
        System.out.println("Рыбка поела");
    }
}