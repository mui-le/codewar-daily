
package NewTest;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class EnoughIsEnough {

    public static int[] deleteNth(int[] elements, int maxOccurrences) {
       Map<Integer, Integer> occurrence = new HashMap<>();

        return IntStream.of(elements)
                .filter(element -> occurrence.merge(element, 1, Integer::sum) <= maxOccurrences)
                .toArray();
    }

    public static void main(String[] args) {
        int[] elements = {1, 2, 3, 1, 1, 2, 1, 2, 3, 3, 2, 4, 5, 3, 1};
        int[] arr = deleteNth(elements, 3);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
}
