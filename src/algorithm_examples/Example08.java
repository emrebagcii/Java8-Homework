package algorithm_examples;

import java.util.Arrays;
import java.util.List;

/*
Bir liste içindeki sayıların karesini alarak yeni bir liste oluşturmanız gerekiyor.
Ancak bu işlemi Java 8 Stream API'sini kullanarak yapmalısınız. İşte girdi ve çıktı örnekleri:
 */

public class Example08 {
    public static void main(String[] args) {
        List<Integer> numberList1 = Arrays.asList(2, 4, 6, 8, 10);
        List<Integer> numberList2 = numberList1.stream()
                .map(e -> e * e)
                .toList();
        System.out.println(numberList2);
    }
}
