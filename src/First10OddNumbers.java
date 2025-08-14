import java.util.List;
import java.util.stream.IntStream;

public class First10OddNumbers {
    public static void main(String[] args) {

        //first 10 numbers
        List<Integer> odd = IntStream.iterate(1, n -> n + 2)
                .boxed()
                .limit(10)
                .toList();
        System.out.println("first 10 odd numbers : " + odd);

        //first 10 multiples of 5
        List<Integer> multiples = IntStream.iterate(5, n -> n + 5).boxed().limit(10).toList();
        System.out.println("first 10 multiples of 5 : " + multiples);
    }
}
