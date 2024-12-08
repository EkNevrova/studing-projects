package ru.eknevrova.project5;

public class Bear extends MammalAnimal {
    @Override
    void nurse() {
        System.out.println("Я медведица - млекопитающее животное, вскармливаю молоком своего медвежонка");
    }

    @Override
    void bathing() {
        System.out.println("Я медведица и я люблю купаться");
    }
}
