package ru.eknevrova.project5;

public class Elephant extends MammalAnimal {
    @Override
    void nurse() {
        System.out.println("Я слониха - млекопитающее животное, вскармливаю молоком своего слонёнка");
    }

    @Override
    void bathing() {
        System.out.println("Я слониха и я люблю купаться, особенно поливать водой из хобота");
    }
}
