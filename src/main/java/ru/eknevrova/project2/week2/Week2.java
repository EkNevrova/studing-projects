package ru.eknevrova.project2.week2;

public class Week2 {
    public static void main(String[] args) {
        int l = 5;
        int h = 8;

        int s = (l * h);
        int p = (l + h) * 2;

        System.out.println("Площадь прямоугольника = " + s);
        System.out.println("Периметр прямоугольника = " + p);

        System.out.println("Периметр больше 15? - " + (p > 15));
        System.out.println("Площадь меньше 30? - " + (s < 30));

    }
}
