package ru.eknevrova.project6;

//Создайте Enum для дней недели. Присвойте любое значение дня недели переменной i
//и выведете на экран, какой день был задан - будний или выходной. Проверка должна быть
//корректна для каждого дня недели. Используйте оператор switch..case.

public class Task3 {
    enum Week {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY};
    public static void determineDay() {
        Week week = Week.WEDNESDAY;
        switch (week) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY:
                System.out.println("Будний день");
                break;
            case SATURDAY, SUNDAY:
                System.out.println("Выходной день");
                break;
            default:
                System.out.println("День не выбран");
                break;
        }
    }
}