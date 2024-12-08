package ru.eknevrova.project6;

import java.util.Scanner;

//Попросите пользователя ввести c клавиатуры температуру целым числом. Если она меньше 0,
//выведете на экран строку “Сейчас очень холодно”. Если она от 0 до 16, выведете на экран
//строку “Сейчас прохладно”. В другом случае выведете на экран строку “Отличный летний денек!”.
// Используйте оператор if..else.

public class Task1 {
    public static void determineWeather() {
        Scanner scanner = new Scanner(System.in);
        int temperature = scanner.nextInt();
        if (temperature < 0) {
            System.out.println("Сейчас очень холодно");
        } else if (temperature >= 0 && temperature < 16) {
            System.out.println("Сейчас прохладно");
        } else {
            System.out.println("Отличный летний денек!");
        }
    }
}
