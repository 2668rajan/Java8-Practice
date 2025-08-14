/*
Generate the Fibonacci series

Write a Java 8 program to generate the Fibonacci series.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class FibonacciSeries {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(0,1));

        IntStream.rangeClosed(3, 10)
                .forEach(i -> list.add(list.get(list.size()-1) + list.get(list.size()-2)));

        System.out.println("Fibonacci series : " + list);
    }


}
