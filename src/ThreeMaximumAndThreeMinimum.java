/*
Get the three maximum and three minimum numbers from a given list of integers

Write a Java 8 program to get the three maximum and three minimum numbers from a given list of integers.
 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ThreeMaximumAndThreeMinimum {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(22,20,5,43,10,90,55,67,89,100);

        List<Integer> minimums = numbers.stream()
                .distinct()
                .sorted()
                .limit(3)
                .toList();

        System.out.println("Minimums : " + minimums);

        List<Integer> maximums = numbers.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .toList();

        System.out.println("Maximums : " + maximums);
    }
}
