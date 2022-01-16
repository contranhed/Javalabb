import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = listOfPersons();
        System.out.println(persons);

        // Find and print the name of best paid person
        Optional<String> bestPaid = persons.stream()
                .max(Comparator.comparing(Person::getSalary))
                .map(Person::getName);
        System.out.println("The best paid person is:");
        bestPaid.ifPresent(System.out::println);
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
