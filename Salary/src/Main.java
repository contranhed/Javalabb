import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = listOfPersons();

        // Print out average salary for males and females, respectively
        Map<String, Double> averageSalaryGenderBased = persons.stream()
                .collect(Collectors.groupingBy(
                        Person::getGender, 
                        Collectors.averagingDouble(Person::getSalary)));
        System.out.println("The average salary based on gender: " + averageSalaryGenderBased);

        // Find and print the name of best paid person
        Optional<String> bestPaid = persons.stream()
                .max(Comparator.comparing(Person::getSalary))
                .map(Person::getName);
        System.out.println("The best paid person is:");
        bestPaid.ifPresent(System.out::println);

        // Find and print the name of crappiest paid person
        Optional<String> crappiestPaid = persons.stream()
                .min(Comparator.comparing(Person::getSalary))
                .map(Person::getName);
        System.out.println("The crappiest paid person is:");
        crappiestPaid.ifPresent(System.out::println);
    }

    private static List<Person> listOfPersons() {
        return List.of(
                new Person("Sebastian Persson", 30000, "male"),
                new Person("Max Stolpe", 26000, "male"),
                new Person("Connie Tran Hedberg", 38000, "female"),
                new Person("Malin Eriksson", 33000, "female"),
                new Person("Andreas Lundberg", 28000, "male"),
                new Person("Pavel Drepalov", 29000, "male"),
                new Person("Alexander Tenghamn", 36000, "male"),
                new Person("Semir Pecar", 28000, "male"),
                new Person("Suad Pecar", 28000, "male"),
                new Person("Hassan Daabas", 47000, "male")
        );
    }
}
