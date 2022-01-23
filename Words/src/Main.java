import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        Predicate<String> regex = Pattern
                .compile("(?i)[aoueiy][^ ]*[aoueiy](?i)")
                .asPredicate();

        List<String> javaWords = Arrays.asList(
                "Polymorphism",
                "Inheritance",
                "get",
                "encapsulation",
                "Abstraction",
                "List",
                "Design patterns",
                "Separation of concerns",
                "Superclass",
                "Interface",
                "override",
                "Collection",
                "set"
        );

        List<String> wordsWithOneOrMoreVowels = javaWords.stream()
                .filter(regex)
                .toList();
        wordsWithOneOrMoreVowels.forEach(System.out::println);
    }
}
