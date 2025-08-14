/*
Print duplicate characters in a string

Write a Java 8 program to print the duplicate characters in a string.
 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicatesElementsOfArray {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(22, 22, 1, 3, 4, 5, 6, 5);

        Set<Integer> set = new HashSet<>();

        List<Integer> result = list.stream()
                .filter(integer -> !set.add(integer))
                .toList();

        System.out.println("Duplicated elements of an array : " + result);
    }
}
