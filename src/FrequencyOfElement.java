/*
Find the frequency of each element in an array or a list

Write a Java 8 program to find the frequency of each element
    in an array or a list using streams and collectors.
 */

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfElement {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charles", "Rajan", "Anu", "Alice","Charles",
                "Ayush","Bob", "Bob");

        Map<String, Long> collect = names.stream()
                .collect(
                        Collectors.groupingBy(
                                Function.identity(), //uses each element as its own key
                                Collectors.counting() // tallies the occurrences
                        ));
        System.out.println(collect);

        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 3, 3, 4);
        Map<Integer, Long> collect1 = numbers.stream()
                .collect(
                        Collectors.groupingBy(
                                Function.identity(), //uses each number as its own key
                                Collectors.counting() //tallies the occurrences
                        ));
        System.out.println(collect1);

        int[] arr = {1, 2, 2, 3, 3, 3, 4};
        Map<Integer, Long> collect2 = Arrays.stream(arr)
                .boxed() //converts the IntStream into Stream<Integer>
                .collect(
                        Collectors.groupingBy(
                                Function.identity(), //uses each element as its own key
                                Collectors.counting() //tallies the occurrences
                        )
                );
        System.out.println(collect2);

    }

}
