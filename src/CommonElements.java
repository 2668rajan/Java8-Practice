/*
Find the common elements between two arrays

Write a Java 8 program to find the common elements between two arrays using streams.
 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CommonElements {
    public static void main(String[] args) {
        Integer[] array1 = {1, 2, 3, 4, 5, 6, 7};
        Integer[] array2 = {5, 6, 7, 8, 9, 10,5};

        Set<Integer> set = new HashSet<>(List.of(array1));

        List<Integer> common = Arrays.asList(array2).stream()
                .filter(set::contains)
                .toList();
        System.out.println("common elements between two arrays ; " + common);

        //without duplicates
        List<Integer> commonWithoutDuplicates = Arrays.stream(array2)
                .filter(set::contains)
                .distinct()
                .toList();
        System.out.println("common elements between two arrays without duplicates : " + commonWithoutDuplicates );
    }
}
