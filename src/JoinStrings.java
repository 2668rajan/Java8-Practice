/*
Join a list of strings with '[' as prefix, ']' as suffix, and ',' as delimiter

Given a list of strings, write a Java 8 program to join the strings
with '[' as a prefix, ']' as a suffix, and ',' as a delimiter.
 */


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinStrings {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("nebula", "quantum", "flux", "echo", "pulse");

        String string = words.stream()
                .collect(Collectors.joining(",", "[", "]"));

        System.out.println("joined string : "  + string);
    }
}
