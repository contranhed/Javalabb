import java.util.stream.IntStream;

public class MultipleThreads implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i <= 350000; i++) {
            if (isPrimeNumber(i)) {
                System.out.println(i);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public boolean isPrimeNumber (int number) {
        return IntStream.rangeClosed(2, number / 2).noneMatch(i-> number % i == 0);
    }
}
