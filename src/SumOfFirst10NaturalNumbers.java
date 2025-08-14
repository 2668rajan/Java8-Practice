import java.util.stream.IntStream;

public class SumOfFirst10NaturalNumbers {
    public static void main(String[] args) {

        int sum = IntStream.rangeClosed(1, 10).sum();
        System.out.println("sum of first 10 natural numbers : " + sum);
    }
}
