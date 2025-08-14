/*
Sort a list of strings according to the increasing order of their length

Write a Java 8 program to sort a given list of strings according to the increasing order of their length.
 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortListArrayByLength {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Alice", "Bob","a", "animals", "Elephant", "Parrot", "Hippopotamus");

        List<String> list1 = list.stream()
                .sorted(Comparator.comparingInt(String::length))
                .toList();

        System.out.println("sorted list : " + list1);
    }
}
