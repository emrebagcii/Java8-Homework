package algorithm_examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

/*
Bir dize (string) listesi içeren bir koleksiyonunuz (örneğin, ArrayList<String>) var.
Bu dize listesindeki tüm dize uzunluklarının toplamını hesaplayan bir Java programı yazmanız gerekiyor.
Ancak bu işlemi Java 8 Stream API'sini kullanarak yapmalısınız
 */

public class Example07 {
    public static void main(String[] args) {
        int lenght = Stream.of("Merhaba", "Dünya", "Java", "Stream", "API")
                .mapToInt(String::length)
                .sum();
        System.out.println(lenght);
    }
}
