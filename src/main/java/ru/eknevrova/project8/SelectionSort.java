package ru.eknevrova.project8;

import java.util.Arrays;

//Task 5:Сортировка выбором
//Вы - учитель математики и хотите написать программу, которая будет помогать вашим ученикам сортировать список формул по сложности.
// Каждая формула представляет собой строку, содержащую числа, знаки операций (+, -, *, /) и скобки. Сложность формулы определяется
// числом операций, которые нужно выполнить, чтобы вычислить ее значение. Напишите программу, которая будет сортировать список формул по возрастанию сложности.
//Пример входных данных:
//
//["5+6+32=43",
// "1+1=2",
// "(3+5)*4*21=483",
// "((21-20)*(32-30))/2=1"]

public class SelectionSort {
    public static void selectionSort() {
        String[] formulas = {
                "5+6+32=43",
                "1+1=2",
                "(3+5)*4*21=483",
                "((21-20)*(32-30))/2=1"
        };
        for (int i = 0; i < formulas.length - 1; i++) {
            int minIndex = i;
            int minComplexity = countOperations(formulas[i]);

            for (int j = i + 1; j < formulas.length; j++) {
                int currentComplexity = countOperations(formulas[j]);
                if (currentComplexity < minComplexity) {
                    minIndex = j;
                    minComplexity = currentComplexity;
                }
            }

            if (minIndex != i) {
                String temp = formulas[i];
                formulas[i] = formulas[minIndex];
                formulas[minIndex] = temp;
            }
        }

        System.out.println("Отсортированные формулы: " + Arrays.toString(formulas));
    }

    public static int countOperations(String formula) {
        int count = 0;
        for (char c : formula.toCharArray()) {
            if (c == '+' || c == '-' || c == '*' || c == '/') {
                count++;
            }
        }
        return count;
    }
}