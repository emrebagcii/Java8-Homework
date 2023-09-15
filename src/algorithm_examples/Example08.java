package algorithm_examples;

import java.util.Arrays;
import java.util.List;


public class Example08 {
    public static void main(String[] args) {
        List<Integer> numberList1 = Arrays.asList(2, 4, 6, 8, 10);
        List<Integer> numberList2 = numberList1.stream()
                .map(e -> e * e)
                .toList();
        System.out.println(numberList2);
    }
}
