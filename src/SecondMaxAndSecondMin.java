/*
Find the maximum and minimum of a list of integers

Given a list of integers, write a Java 8 program to find the second maximum and second minimum numbers in the list.
 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondMaxAndSecondMin {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(22,20,5,43,10,90,109,55,67,89,100);

        Optional<Integer> secondMin = numbers.stream()
                .distinct()
                .sorted()
                .skip(1)
                .findFirst();

        System.out.println("Second Min : " + secondMin.get());

        Optional<Integer> secondMax = numbers.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();

        System.out.println("Second Max : " + secondMax.get());
    }
}
