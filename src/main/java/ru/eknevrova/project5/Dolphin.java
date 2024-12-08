package ru.eknevrova.project5;

public class Dolphin extends MammalAnimal{
    @Override
    void nurse() {
        System.out.println("Я самка дельфина - млекопитающее животное, вскармливаю молоком своего детёныша");
    }

    @Override
    void bathing() {
        super.bathing();
        System.out.println("Я дельфин, с удоводльствием купаюсь и умею очень быстро плавать");
    }
}
