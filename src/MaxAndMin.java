/*
Find the maximum and minimum of a list of integers

Given a list of integers, write a Java 8 program to find the maximum and minimum numbers in the list.
 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MaxAndMin {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(22,20,5,43,10,90,109,55,67,89,100);

//        Optional<Integer> min = numbers.stream()
//                .distinct()
//                .sorted()
//                .findFirst();

        Optional<Integer> min = numbers.stream().min(Integer::compareTo);

        System.out.println("min : " + min.get());

//        Optional<Integer> max = numbers.stream()
//                .distinct()
//                .sorted(Comparator.reverseOrder())
//                .findFirst();

        Optional<Integer> max = numbers.stream().max(Integer::compareTo);

        System.out.println("max : " + max.get());
    }
}
