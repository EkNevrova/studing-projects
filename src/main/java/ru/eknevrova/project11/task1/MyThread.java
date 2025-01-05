package ru.eknevrova.project11.task1;

public class MyThread implements Runnable{

    private boolean evenNumber;

    public MyThread(boolean evenNumber) {
        this.evenNumber = evenNumber;
    }

    @Override
    public void run(){
        for (int i = 1; i <= 10; i++) {
            if (evenNumber && i % 2 == 0) {
                System.out.println("Чётное число: " + i);
            } else if (!evenNumber && i % 2 != 0){
                System.out.println("Нечётное число: " + i);
            }
        }
    }
}
