package algorithm_examples;

import java.util.Arrays;
import java.util.List;

public class Example07 {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Merhaba", "Dünya", "Java", "Stream", "API");
        int totalLenght = stringList.stream()
                .mapToInt(String::length)
                .sum();
        System.out.println(totalLenght);
    }
}
