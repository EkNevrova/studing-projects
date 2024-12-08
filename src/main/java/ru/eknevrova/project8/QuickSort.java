package ru.eknevrova.project8;

import java.util.Arrays;

// Task 2: Быстрая сортировка
//
//Напишите программу, которая будет сортировать список строк в алфавитном порядке.
//Пример входных данных:
//["apple",
// "orange",
// "grape",
// "banana"]

public class QuickSort {
    public static void quickSort () {
        String[] arr = {"apple", "orange", "grape", "banana"};
        actionSort(arr, 0, arr.length - 1);
        System.out.println("Отсортированный массив: " + Arrays.toString(arr));
    }

    public static void actionSort(String[] arr, int low, int high) {
        if (low < high) {
            String pivot = arr[high];
            int i = low - 1;
            for (int j = low; j < high; j++) {
                if (arr[j].compareTo(pivot) <= 0) {
                    i++;
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            String temp = arr[i + 1];
            arr[i + 1] = arr[high];
            arr[high] = temp;
            int partitionIndex = i + 1;
            actionSort(arr, low, partitionIndex - 1);
            actionSort(arr, partitionIndex + 1, high);
        }
    }
}
