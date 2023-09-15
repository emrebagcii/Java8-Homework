package algorithm_examples;

import java.util.Arrays;
import java.util.List;

public class Example06 {
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(3, -1, 8, -2, 5, 12);
        int sum = numberList.stream()
                .filter(e -> e > 0)
                .reduce(0, Integer::sum);
        System.out.println(sum);
    }
}
