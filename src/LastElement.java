import java.util.Arrays;
import java.util.stream.Stream;

public class LastElement {
    public static void main(String[] args) {
        Integer[] array2 = {23,757,40, 5, 26,45,65};

        Integer integer = Arrays.stream(array2)
                .skip(array2.length - 1).toList().get(0);

        System.out.println(integer);
    }
}
