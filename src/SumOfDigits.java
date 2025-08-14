/*
Find the sum of all digits of a number in Java 8

Write a Java 8 program to find the sum of all digits of a given number.
 */

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfDigits {
    public static void main(String[] args) {
        int num = 39743;

        Optional<Integer> sum = String.valueOf(num) //if the num is negative then use Math.abs(num)
                .chars()
                .mapToObj(c -> c-'0')
                .reduce((a, b) -> a + b);
        System.out.println("sum of digits of a number : " + sum.get());

        //in case of list of a number -> sum of digits across all
        List<Integer> list = Arrays.asList(23,54,10,4,25);

        Optional<Integer> sumList = list.stream()
                .map(n->String.valueOf(n).chars()
                        .map(c->c-'0').sum()).reduce(Integer::sum);
        System.out.println("sum of digits across a list : " + sumList.get());

        //sum of digits of each element in a list

        List<Integer> sumDigitList = list.stream()
                        .map(n ->
                                String.valueOf(n).chars()
                                        .map(c->c-'0')
                                        .sum())
                                .toList();
        System.out.println("sum of digits across a list : " + sumDigitList);

    }
}
