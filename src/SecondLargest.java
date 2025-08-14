
/*
Find the second largest number in an integer array

Write a Java 8 program to find the second largest number in an integer array.
 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {23,3,25,57,88,67};

        Optional<Integer> secondLargest = Arrays.stream(arr)
                .boxed()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();

        System.out.println("second largest : " + secondLargest.get());

        String[] strings = {"Alice", "Bob","a", "animals", "Elephant", "Parrot", "Hippopotamus"};
        Optional<String> secondLargestLengthString = Arrays.stream(strings)
                .distinct()
                .sorted(Comparator.comparingInt(String::length).reversed())
                .skip(1)
                .findFirst();

        System.out.println("Sting with second largest length : " + secondLargestLengthString.get());
    }
}
