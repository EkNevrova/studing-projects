package ru.eknevrova.project7;
//Удаление элементов из связного списка
//Описание задачи: Написать программу, которая будет удалять все элементы
//из связного списка, которые являются четными числами.
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Task4 {
    public static void removeEvenNums() {
        LinkedList<Integer> listNums = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int counter=1; counter <=number; counter++) {
            listNums.add(counter);
        }
        Iterator<Integer> iterator = listNums.iterator();
        while (iterator.hasNext()) {
            int index = iterator.next();
            if (index % 2 == 0) {
                iterator.remove();
            }
        }
        System.out.println(listNums);
    }
}