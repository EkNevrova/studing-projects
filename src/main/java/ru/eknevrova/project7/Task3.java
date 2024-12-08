package ru.eknevrova.project7;
//Написать программу, которая будет подсчитывать количество повторений каждого символа в заданной строке.
//Результат необходимо вывести в виде пар "символ - количество повторений".
import java.util.HashMap;

public class Task3 {
    public static void calcSymbols() {
        String str = "hello world";
        HashMap<Character, Integer> quantitySymbolsMap = new HashMap<>();
        for (char symbol : str.toCharArray()) {
            if (quantitySymbolsMap.containsKey(symbol)) {
                quantitySymbolsMap.put(symbol, quantitySymbolsMap.get(symbol)+1);
            } else {
                quantitySymbolsMap.put(symbol, 1);
            }
        }
        for (char key : quantitySymbolsMap.keySet()) {
            System.out.println(key + " - " + quantitySymbolsMap.get(key));
        }
    }
}