import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class ReverseArray {
    public static void main(String[] args) {
        Integer[] arr = {23,3,25,57,88,67};

        int[] reversed = IntStream.range(0, arr.length)
                .map(i -> arr[arr.length - 1 - i])
                .toArray();

        System.out.println("reversed array : " + Arrays.toString(reversed));
    }
}
