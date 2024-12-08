package ru.eknevrova.project4;

public class Ship implements Swimable {
    @Override
    public void swim() {
        fuel();
        System.out.println("Кораблик плывёт по воде");
    }

    private void fuel() {
        System.out.println("Кораблик заправляется топливом");
    }
}