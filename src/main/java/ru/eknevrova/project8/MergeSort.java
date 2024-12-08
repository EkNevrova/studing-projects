package ru.eknevrova.project8;

import java.util.Arrays;

// Task 3: Сортировка слиянием
//
//Напишите программу, которая будет сортировать массив строк по длине слов в них.
//Пример входных данных:
//
//["cat",
// "orange",
// "elephant",
// "bird"]

public class MergeSort {
    public static void mergeSort() {
        String[] arr = {"cat", "orange", "elephant", "bird"};
        actionSort(arr, 0, arr.length - 1);
        System.out.println("Отсортированный массив: " + Arrays.toString(arr));
    }

    public static void actionSort(String[] arr, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            actionSort(arr, left, middle);
            actionSort(arr, middle + 1, right);

            int n1 = middle - left + 1;
            int n2 = right - middle;

            String[] leftArray = new String[n1];
            String[] rightArray = new String[n2];

            for (int i = 0; i < n1; i++) {
                leftArray[i] = arr[left + i];
            }
            for (int j = 0; j < n2; j++) {
                rightArray[j] = arr[middle + 1 + j];
            }

            int i = 0, j = 0, k = left;
            while (i < n1 && j < n2) {
                if (leftArray[i].length() <= rightArray[j].length()) {
                    arr[k] = leftArray[i];
                    i++;
                } else {
                    arr[k] = rightArray[j];
                    j++;
                }
                k++;
            }

            while (i < n1) {
                arr[k] = leftArray[i];
                i++;
                k++;
            }

            while (j < n2) {
                arr[k] = rightArray[j];
                j++;
                k++;
            }
        }
    }
}
