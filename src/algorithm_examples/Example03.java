package algorithm_examples;

import java.util.Arrays;
import java.util.List;

//Java 8 ile Bir metin dizisi içindeki kelimelerin uzunluklarına göre sıralandığı bir Java programı yazın.(Arrays.asList("Java", "Python", "C++", "JavaScript", "Ruby") gibi bir list oluşturup);
public class Example03 {
    public static void main(String[] args) {
        List<String> languageList = Arrays.asList("Java", "Python", "C++", "JavaScript", "Ruby");
        languageList.stream()
                .map(e -> e.length())
                .sorted()
                .forEach(System.out::println);

    }
}
