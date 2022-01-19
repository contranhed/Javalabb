import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        MultipleThreads multiThreads = new MultipleThreads();
        Thread firstThread = new Thread(multiThreads);
        firstThread.start();
    }



/*
    // Check if the passed int is a prime number
    public static boolean isPrimeNumber(int number) {
        // Class IntStream that streams int-valued elements within a defined and closed range
        return IntStream.rangeClosed(2, number / 2).noneMatch(i-> number % i == 0);
    }

    public static void main(String[] args) {

        // Function Interface with two parameters - take in an Integer object and return a List of Integer objects
        // The parameter sets the end of range
        Function<Integer, List<Integer>> firstHalfOfNumbers = number -> IntStream.rangeClosed(2, number)
                // Filter the list one element at a time and check if it is a prime number (method call)
                .filter(Main::isPrimeNumber)
                // Box the type Integer in this stream
                .boxed()
                // Save the filtered elements in the List
                .collect(Collectors.toList());
        // Pass the parameter into the default method in Function Interface and print out the list with stored prime numbers
        System.out.println("All prime numbers between 0 and 350 000 are: " + firstHalfOfNumbers.apply(350000));
        System.out.println("");

        // Same as above, only a different range of numbers
        Function<Integer, List<Integer>> secondHalfOfNumbers = number -> IntStream.rangeClosed(350001, number)
                .filter(Main::isPrimeNumber)
                .boxed()
                .collect(Collectors.toList());
        System.out.println("All prime numbers between 350 001 and 500 000 are: " + secondHalfOfNumbers.apply(500000));
    }*/
}
