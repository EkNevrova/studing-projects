package ru.eknevrova.project5;

public class ZooKindergarten {
    public static void main(String[] args) {
        Calf calf = new Calf();
        Elephant elephant = new Elephant();
        Bear bear = new Bear();
        Dolphin dolphin = new Dolphin();

        System.out.println("Детёныш хочет кушать");
        System.out.println("-------");
        calf.nursingCalf(elephant);
        System.out.println("-------");
        calf.nursingCalf(bear);
        System.out.println("-------");
        calf.nursingCalf(dolphin);
        System.out.println("       ");

        System.out.println("Детёныш просит маму искупаться");
        System.out.println("-------");
        calf.bathingCalf(bear);
        System.out.println("-------");
        calf.bathingCalf(elephant);
        System.out.println("-------");
        calf.bathingCalf(dolphin);
    }
}
