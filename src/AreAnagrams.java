/*
Check if two strings are anagrams or not using Java 8 streams

Write a Java 8 program to check if two strings are anagrams or not using the stream API and lambda expressions.
 */

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AreAnagrams {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        Stream<Character> characterStream1 = str1.chars().
                mapToObj(c -> (char) c);

        Map<Character, Long> collect = characterStream1.collect(
                Collectors.groupingBy(
                        Function.identity(), //uses each element as its own key
                        Collectors.counting() //tallies the occurrences
                ));

        System.out.println("collect : " + collect);

        Stream<Character> characterStream2 = str2.chars()
                .mapToObj(c -> (char) c);

        Map<Character, Long> collect1 = characterStream2.collect(
                Collectors.groupingBy(
                        Function.identity(), //uses each element as it own key
                        Collectors.counting() //tallies the occurrences
                ));

        System.out.println("collect1 : " + collect1);

        System.out.println(collect.equals(collect1));

        //calling reusable method
        System.out.println("str1 and str2 are anagrams : " + areAnagrams(str1,str2));
    }

    public static boolean areAnagrams(String str1, String str2){
        Function<String, Map<Character, Long>> charFrequencyMap = str ->
                str.chars()
                        .mapToObj(c->(char)c)
                        .collect(Collectors.groupingBy(
                                        Function.identity(),
                                        Collectors.counting()));

        return charFrequencyMap.apply(str1).equals(charFrequencyMap.apply(str2));
    }
}
