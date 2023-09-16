package algorithm_examples;

import java.util.Arrays;
import java.util.List;

/*
Bir liste içindeki çift sayıları bulan ve bu çift sayıların
karelerini hesaplayan bir Java 8 işlevi (lambda ifadesi) yazınız
 */
public class Example09 {
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        numberList.stream()
                .filter(e->e%2==0)
                .map(e->e*e)
                .forEach(System.out::println);
    }
}
