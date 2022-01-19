import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> listOfJavaWords = javaWords();

        Pattern pattern = Pattern.compile("[aoueiy]{2,}", Pattern.CASE_INSENSITIVE) ;

        List<String> list = listOfJavaWords.stream()
                .map(x -> pattern.matcher(x))
                .filter(Matcher::find)
                .collect(Collectors.toList());
        System.out.println();
    }


    /*public static void regexChecker(String regex, String checkString) {


        Pattern checkRegex = Pattern.compile(regex);


        Matcher regexMatcher = checkRegex.matcher(checkString);

        while(regexMatcher.find()) {
            if(regexMatcher.group().length() != 0) {
                System.out.println(regexMatcher.group().trim());
            }
        }
    }*/

    // List of words
    private static List<String> javaWords() {
        return List.of(
                "1. Polymorphism",
                "2. Inheritance",
                "3. get",
                "4. Encapsulation",
                "5. Abstraction",
                "6. List",
                "7. Design patterns",
                "8. Separation of concerns",
                "9. Class",
                "10. Superclass",
                "11. Interface",
                "12. Override",
                "13. Collection",
                "14. set"
        );
    }
}
