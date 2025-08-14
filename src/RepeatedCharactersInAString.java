import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class RepeatedCharactersInAString {
    public static void main(String[] args) {
        String str = "elephantasaph";

        //repeated characters
        Set<Character> set = new HashSet<>();

        List<Character> list = str.chars()
                .mapToObj(c -> (char) c)
                .filter(i -> !set.add(i))
                .distinct()
                .toList();

        System.out.println("Repeated characters in a string : " + list);

        //first repeated character in a string
        Set<Character> set1 = new HashSet<>();
        Optional<Character> first = str.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> !set1.add(c))
                .findFirst();

        System.out.print("first repeated character is : " ) ;
        first.ifPresent(System.out::println);

        //first non repeated character in a string
        Set<Character> set2 = new HashSet<>(list);
        System.out.println("set2 : " + set2);

        Optional<Character> firstNonRepeatedCharacter = str.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> !set2.contains(c))
                .findFirst();
        System.out.println("First non repeated charcte : " + firstNonRepeatedCharacter.get());
    }
}
