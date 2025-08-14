/*
Find strings in a list that start with a number

Given a list of strings, write a Java 8 program to find the strings that start with a number.

 */

import java.util.Arrays;
import java.util.List;

public class StringStartsWithNumber {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Alice", "12ksf", "23jf", "Bo", "wdga");

        List<String> filteredList = list.stream()
                .filter(i -> i.charAt(0) > '0' && i.charAt(0) < '9')
                .toList();

        System.out.println("String starting with numbers : " + filteredList);
    }
}
