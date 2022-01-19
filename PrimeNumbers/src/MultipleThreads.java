import java.util.stream.IntStream;

public class MultipleThreads implements Runnable {
    final private int start;
    final private int end;

    public MultipleThreads(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        printNumber(start, end);
    }

    public void printNumber(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isPrimeNumber(i)) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
            }
        }
    }

    public boolean isPrimeNumber(int number) {
        return IntStream.rangeClosed(2, number / 2).noneMatch(i -> number % i == 0);
    }
}
