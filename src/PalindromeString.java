import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PalindromeString {
    public static void main(String[] args) {
        String str1 = "Rajan";
        String str2 = "najaR";

        System.out.println("str1 and str2 are palindromes ? : " + isPalindrome(str1, str2));
    }
    public static boolean isPalindrome(String s1, String s2){
        Function<String , String > checkPalindrome = s -> IntStream.range(0,s.length())
                .mapToObj(i -> s.charAt(s.length()-1-i))
                .map(String::valueOf)
                .collect(Collectors.joining());
        System.out.println(checkPalindrome.apply(s1));
        return checkPalindrome.apply(s1).equals(s2);
    }
}
