package algorithm_examples;

import java.util.Arrays;
import java.util.List;

//Bir liste içindeki tamsayıları alın ve bu tamsayıların karelerini toplayan bir Java programı yazın. (Arrays.asList(1,2,3,5,6,7...)) en son kareleri toplarken belki reduce kullanabilriiz hııhhh? ? :)
public class Example04 {
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int sum = numberList.stream()
                .map(e -> e * e)
                .reduce(0, (Integer::sum));

        System.out.println(sum);
    }
}
