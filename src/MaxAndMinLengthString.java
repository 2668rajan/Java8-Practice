import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxAndMinLengthString {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "kiwi", "orange", "banana", "pear", "kiwi");

        //getting 3 strings with maximum lengths
        List<String> maxLengthStrings = strings.stream()
                .distinct()
                .sorted(Comparator.comparingInt(String::length).reversed())
                .limit(3)
                .toList();

        System.out.println("3 strings with maximum lengths : " + maxLengthStrings);

        //getting 3 strings with minimum lengths
        List<String> minLengthStrings = strings.stream()
                .distinct()
                .sorted(Comparator.comparingInt(String::length))
                .limit(3)
                .toList();
        System.out.println("3 strings with minimum lengths : " + minLengthStrings);

    }
}
