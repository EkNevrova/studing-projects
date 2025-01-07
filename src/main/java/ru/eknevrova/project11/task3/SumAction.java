package ru.eknevrova.project11.task3;

public class SumAction implements Runnable {
    private final int start;
    private final int end;
    private long result;

    public SumAction(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        result = 0;
        for (int i = start; i <= end; i++) {
            result += i * i;
        }
    }

    public long getResult() {
        return result;
    }
}
