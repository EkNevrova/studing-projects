package ru.eknevrova.project11.task3;

public static class SquareSum implements Runnable {
    private int start; // Начало диапазона
    private int end;   // Конец диапазона
    private long partialSum; // Частичная сумма

    public SquareSumTask(int start, int end) {
        this.start = start;
        this.end = end;
        this.partialSum = 0;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            partialSum += (long) i * i; // Суммируем квадраты чисел
        }
    }

    public long getPartialSum() {
        return partialSum;
    }
}
