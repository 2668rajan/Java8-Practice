/*
Sort a given list of decimals in reverse order

Write a Java 8 program to sort a given list of decimal numbers in reverse order.
 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortDecimals {
    public static void main(String[] args) {
        List<Double> decimals = Arrays.asList(3.14, 2.71, 1.41, 0.577, 4.669, 1.618);

        List<Double> sortedDecimals = decimals.stream()
                .sorted(Comparator.reverseOrder())
                .toList();

        System.out.println(sortedDecimals);

    }
}
