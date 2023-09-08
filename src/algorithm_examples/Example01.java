package algorithm_examples;

//1-Java 8 ile bir liste (List) içindeki sayıların toplamını hesaplayan bir Java programı yazın.(List'i elinizle oluşturabilirsiniz. Arrays.asList(....))

import java.util.Arrays;
import java.util.List;

public class Example01 {
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numberList.stream().mapToInt(Integer::intValue).sum();

        System.out.println(sum);
    }
}
