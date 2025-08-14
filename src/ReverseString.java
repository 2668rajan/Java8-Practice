/*
Reverse each word of a string using Java 8 streams

Write a Java 8 program to reverse each word of a given string using the stream API and lambda expressions.

 */

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseString {
    public static void main(String[] args) {

        //reversing a string
        String str = "Rajan";
        Optional<String> reversedString = str.chars()
                .mapToObj(c -> (char) c)
                .map(c -> String.valueOf(c))
                .reduce((a, b) -> b+a);

        System.out.println(reversedString.get());

        //reversing using IntStream
        String reversedUsingIntSream = IntStream.range(0, str.length())
                .mapToObj(i -> str.charAt(str.length() - 1 - i))
                .map(String::valueOf)
                .collect(Collectors.joining());
        System.out.println("reversed using IntStream : " + reversedUsingIntSream);
    }
}
