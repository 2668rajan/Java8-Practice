/*
Find the sum and average of all elements in an integer array

Write a Java 8 program to find the sum and average of all elements in an integer array.


 */

import java.util.*;

public class SumAverage {
    public static void main(String[] args) {
        int[] arr = {23,3,25,57,88,67};

        Optional<Integer> sum = Arrays.stream(arr)
                .boxed()
                .reduce(Integer::sum);

        System.out.println("sum : " + sum.get());

        OptionalDouble average = Arrays.stream(arr)
                .boxed()
                .mapToInt(Integer::intValue)
                .average();
       average.ifPresent(System.out::println);

        int sum1 = Arrays.stream(arr).sum();
        System.out.println("sum1 " + sum1);


        //in case of list
        List<Integer> list = Arrays.asList(1,2,4,45);

        double average1 = list.stream()
                .mapToInt(Integer::intValue)
                .sum() * 1.0 / list.size();
        System.out.println("average : " + average1);
    }
}
