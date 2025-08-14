/*
Merge two unsorted arrays into a single sorted array using Java 8 streams

Write a Java 8 program to merge two unsorted arrays into a single sorted array using the stream API.


 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class MergeTwoArrays {
    public static void main(String[] args) {
        Integer[] array1 = {1, 23,65,864,2, 3};
        Integer[] array2 = {23,757,40, 5, 26};

        Integer[] sortedMergedArray = Stream.concat(
                        Arrays.stream(array1),
                        Arrays.stream(array2)
                )
                .sorted()
                .toArray(Integer[]::new);

        System.out.println("sorted merge array: " + Arrays.toString(sortedMergedArray));

        //in descending order
        Integer[] reversedMergedArray = Stream.concat(
                        Arrays.stream(array1),
                        Arrays.stream(array2)
                ).sorted(Comparator.reverseOrder())
                .toArray(Integer[]::new);

        System.out.println("reversed sorted merge array : " + Arrays.toString(reversedMergedArray));
    }
}
