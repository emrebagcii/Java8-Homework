package algorithm_examples;

import java.util.Arrays;
import java.util.List;

//Java 8 ile Bir liste içindeki çift sayıları filtreleyen ve bu çift sayıların karelerini hesaplayan bir Java programı yazın
public class Example02 {
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numberList.stream()
                .filter(e -> e % 2 == 0)
                .map(e -> e * e)
                .forEach(System.out::println);
    }
}
