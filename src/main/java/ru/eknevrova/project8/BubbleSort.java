package ru.eknevrova.project8;
import java.util.ArrayList;

//Task 1: Сортировка пузырьком
//
//У вас есть список студентов и их средние баллы. Необходимо отсортировать список по убыванию среднего балла.
//Пример входных данных:
//
//["Иванов", 4.5],
//["Петров", 3.7],
//["Сидоров", 4.2],
//["Козлов", 5.0],
//["Смирнов", 3.9]

public class BubbleSort {
    public static void bubbleSort() {
        Student student1 = new Student("Иванов", 4.5f);
        Student student2 = new Student("Петров", 3.7f);
        Student student3 = new Student("Сидоров", 4.2f);
        Student student4 = new Student("Козлов", 5.0f);
        Student student5 = new Student("Смирнов", 3.9f);

        ArrayList<Student> studentsList = new ArrayList<>();
        studentsList.add(student1);
        studentsList.add(student2);
        studentsList.add(student3);
        studentsList.add(student4);
        studentsList.add(student5);
        System.out.println("Создан список студентов:");
        printArrayList(studentsList);

        for (int i = 0; i < studentsList.size() - 1; i++) {
            for (int j = 0; j < studentsList.size() - i - 1; j++) {
                if ((studentsList.get(j + 1)).evGrade > (studentsList.get(j)).evGrade) {
                    Student tempValue = studentsList.get(j);
                    studentsList.set(j, studentsList.get(j + 1));
                    studentsList.set(j + 1, tempValue);
                }
            }
        }
        System.out.println("Список студентов отсортирован:");
        printArrayList(studentsList);
    }

    public static void printArrayList (ArrayList <Student> studentsList) {
        for (Student student : studentsList) {
            System.out.println("[" + student.name + ", " + student.evGrade + "]");
        }
    }
}