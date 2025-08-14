/*
Find the frequency of each character in a string using Java 8 streams

Write a Java 8 program to find the frequency of each character
 in a given string using the stream API and collectors
 */

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FrequencyOfCharacter {
    public static void main(String[] args) {
        String name = "ElephantisPizza";

        Stream<Character> characterStream = name.chars()
                .mapToObj(c -> (char) c);

        Map<Character, Long> collect = characterStream.collect(
                Collectors.groupingBy(
                        Function.identity(), //uses each element as its own key
                        Collectors.counting() //tallies the occurrences
                ));

        System.out.println(collect);
    }
}
