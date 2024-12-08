package ru.eknevrova.project4;

public class MainClass {
    public static void main(String[] args) {
        Fish fish = new Fish();
        Ship ship = new Ship();

        SwimExecuter swimExecuter = new SwimExecuter();

        swimExecuter.makeSwim(fish);
        swimExecuter.makeSwim(ship);
    }
}
