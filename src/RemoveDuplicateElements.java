/*
Remove duplicate elements from a list using Java 8 streams

Write a Java 8 program to remove duplicate elements
 from a list using the stream API and lambda expressions.
 */

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Alice", "Charlie", "Bob",
                "David", "Eve", "Charlie");

        List<String> list = names.stream()
                .distinct()
                .toList();

        System.out.println("names : " + list);

        Set<String> collect = names.stream()
                .collect(Collectors.toSet());

        System.out.println("name set : " + collect);

    }
}
