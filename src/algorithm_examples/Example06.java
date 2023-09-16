package algorithm_examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
Bir liste içindeki tüm pozitif tam sayıları alarak bu sayıları toplamak için bir Java programı yazmanız gerekiyor.
 Ancak, bu işlemi Java 8'in Stream API'si kullanarak yapmalısınız.
 */
public class Example06 {
    public static void main(String[] args) {

        int positiveSum = Stream.of(3, -1, 8, -2, 5, 12)
                .filter(e -> e > 0)
                .reduce(0,Integer::sum);
        System.out.println(positiveSum);
    }
}
