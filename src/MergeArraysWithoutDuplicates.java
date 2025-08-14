/*
Merge two unsorted arrays into a single sorted array without duplicates

Write a Java 8 program to merge two unsorted arrays into a single sorted array without duplicates.


 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class MergeArraysWithoutDuplicates {
    public static void main(String[] args) {
        Integer[] array1 = new Integer[]{
                12, 45, 23, 12, 67, 89, 45, 90, 23, 12, 34, 56, 78, 90, 67, 89, 12, 45, 23, 34,
                56, 78, 90, 12, 67, 89, 45, 23, 12, 34, 56, 78, 90, 67, 89, 12, 45, 23, 34, 56
        };

        Integer[] array2 = new Integer[]{
                11, 22, 33, 44, 55, 66, 77, 88, 99, 11, 22, 33, 44, 55, 66, 77, 88, 99, 11, 22,
                33, 44, 55, 66, 77, 88, 99, 11, 22, 33, 44, 55, 66, 77, 88, 99, 11, 22, 33, 44
        };

        //in ascending order
        Integer[] mergedArrayWithoutDuplicates = Stream.concat(
                        Arrays.stream(array1),
                        Arrays.stream(array2)
                )
                .distinct()
                .sorted()
                .toArray(Integer[]::new);

        System.out.println("merged array without duplicates : " + Arrays.toString(mergedArrayWithoutDuplicates));

        //in descending array
        Integer[] reversedMergedArray = Stream.concat(
                        Arrays.stream(array1),
                        Arrays.stream(array2)
                )
                .distinct()
                .sorted(Comparator.reverseOrder())
                .toArray(Integer[]::new);

        System.out.println("reversed merged array without array : " + Arrays.toString(reversedMergedArray));
    }
}
