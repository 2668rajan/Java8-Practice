/*
Separate odd and even numbers in a list of integers

Given a list of integers,
write a Java 8 program to separate the odd and even numbers into two separate lists.
 */

import java.util.Arrays;
import java.util.List;

public class FilterOddEven {
    public static void main(String[] args) {
      List<Integer> numbers = Arrays.asList(12, 7, 8, 3, 15, 2, 9, 10, 21, 6);

      List<Integer> even = numbers.stream()
              .filter(s->s%2==0)
              .toList();

        System.out.println("even : " + even);

        List<Integer> odd = numbers.stream()
                .filter(s->s%2==1)
                .toList();
        System.out.println("Odd : " + odd);

    }
}
