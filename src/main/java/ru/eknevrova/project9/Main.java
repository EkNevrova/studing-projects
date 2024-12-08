package ru.eknevrova.project9;

import java.util.*;
import java.util.stream.Collectors;


public class Main {
    public static  void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("cow", 1));
        animals.add(new Animal("pig", 2));
        animals.add(new Animal("cat", 3));
        animals.add(new Animal("dog", 4));
        animals.add(new Animal("duck", 5));
        animals.add(new Animal("tiger", 6));
        animals.add(new Animal("zebra", 7));
        animals.add(new Animal("elephant", 8));
        animals.add(new Animal("hippo", 9));
        animals.add(new Animal("horse", 10));
        //animals.add(new Animal("lion", 11));

        // task1: Если в коллекции есть лев, то выведите его возраст, если нет -
        // выбросите исключение IllegalArgumentException
        System.out.println("task 1");
        Optional<Animal> lions = animals.stream()
                .filter(animal -> animal.getName().equalsIgnoreCase("lion"))
                .findAny();
        try {
            int lionAge = lions.orElseThrow(() -> new IllegalArgumentException("Льва нет")).getAge();
            System.out.println("Возраст льва: " + lionAge);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


        // task2: Выведите на экран всех животных из коллекции в порядке возрастания их возраста
        System.out.println("---------------");
        System.out.println("task 2");
        animals.stream()
                .sorted(Comparator.comparing(Animal::getAge))
                .forEach(animal -> System.out.println(
                "Животное: " + animal.getName() + "; возраст: " + animal.getAge()));

        // task 3: Посчитайте сколько животных в коллекции, у которых возраст больше 4
        System.out.println("---------------");
        System.out.println("task 3");
        long count = animals.stream()
                .filter(animal -> animal.getAge() > 4)
                .count();
        System.out.println("Количество животных старше 4-х лет: " + count);


        // task 4: Создайте Map из коллекции животных. Ключ - название животного, значение - экземпляр животного.
        // Выведите все пары ключ-значение в консоль
        System.out.println("---------------");
        System.out.println("task 4");
        Map<String, Animal> animalMap = animals.stream()
                .collect(Collectors.toMap(
                        Animal::getName,
                        animal -> animal
                ));
        animalMap.forEach((name, animal) ->
                System.out.println("Ключ: " + name + ", Значение: " + animal.getName() + " (возраст: " + animal.getAge() + ")"));

        // task 5: Выведите названия всех животных одной строкой (используйте reduce())
        System.out.println("---------------");
        System.out.println("task 5");
        String allNames = animals.stream()
                .map(Animal::getName)
                .reduce("", (name1, name2) -> name1 + "," + name2);

        System.out.println("Названия всех животных: " + allNames);
    }
}
