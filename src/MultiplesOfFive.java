/*
Print the numbers from a given list of integers that are multiples of 5

Write a Java 8 program to print the numbers from a given list of integers that are multiples of 5.
 */

import java.util.Arrays;
import java.util.List;

public class MultiplesOfFive {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(22,20,5,43,10,90,55,67,89,100);

        List<Integer> list = numbers.stream()
                .filter(n -> n % 5 == 0)
                .toList();

        System.out.println("Multiples of 5 are : " + list);
    }
}
