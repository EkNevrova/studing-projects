package ru.eknevrova.project5;

public class Calf {
    void nursingCalf(MammalAnimal mammalAnimal) {
        System.out.println("Я детёныш и прошу маму меня покормить");
        mammalAnimal.nurse();
    }

    void bathingCalf(MammalAnimal mammalAnimal) {
        System.out.println("Я детёныш и хочу искупаться с мамой");
        mammalAnimal.bathing();
    }
}
