package ru.eknevrova.project3._main;

public class Car {

    String color;
    String brand;

    public Car() {
    }

    public Car(String color, String brand) {
        this.color = color;
        this.brand = brand;
    }

    public static void main(String[] args) {

        Car mercedes = new Car("black", "Mercedes");

        Car volvo = new Car();
        volvo.color = "white";
        volvo.brand = "Volvo";

        Car volkswagen = new Car("dark-blue", "Volkswagen");

        Car uaz = new Car();
        uaz.color = "green";
        uaz.brand = "UAZ";

        System.out.println("The " + volvo.color + " " + volvo.brand);
        System.out.println("The " + mercedes.color + " " + mercedes.brand);
        System.out.println("The " + uaz.color + " " + uaz.brand);
        System.out.println("The " + volkswagen.color + " " + volkswagen.brand);
    }
}

