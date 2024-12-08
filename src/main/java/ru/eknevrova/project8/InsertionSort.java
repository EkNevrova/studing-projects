package ru.eknevrova.project8;

import java.util.Arrays;

// Task 4: Сортировка вставками
//
//Напишите программу, которая будет сортировать список слов по количеству гласных букв в слове.
//Пример входных данных:
//
//["cat",
// "orange",
// "elephant",
// "bird"]

public class InsertionSort {
    public static void insertionSort() {
        String[] arr = {"cat", "orange", "elephant", "bird"};
        for (int i = 1; i < arr.length; i++) {
            String key = arr[i];
            int keyVowelCount = 0;
            for (char c : key.toCharArray()) {
                if ("aeiouAEIOU".indexOf(c) != -1) {
                    keyVowelCount++;
                }
            }
            int j = i - 1;

            while (j >= 0) {
                int vowelCountJ = 0;
                for (char c : arr[j].toCharArray()) {
                    if ("aeiouAEIOU".indexOf(c) != -1) {
                        vowelCountJ++;
                    }
                }

                if (vowelCountJ > keyVowelCount) {
                    arr[j + 1] = arr[j];
                    j--;
                } else {
                    break;
                }
            }

            arr[j + 1] = key;
        }
        System.out.println("Отсортированный массив: " + Arrays.toString(arr));
    }
}

