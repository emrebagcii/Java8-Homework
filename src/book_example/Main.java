package book_example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();
        books.add(new Book("Suç ve Ceza", "Dostoyevski"));
        books.add(new Book("Karamazov Kardeşler", "Dostoyevski"));
        books.add(new Book("Savaş ve Barış", "Tolstoy"));
        books.add(new Book("Anna Karenina", "Tolstoy"));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Yazar adı giriniz...");
        String author = scanner.nextLine();

        List<String> authors = books.stream()
                .filter(book -> book.getAuthor().equalsIgnoreCase(author))
                .map(Book::getTitle)
                .collect(Collectors.toList());

        if (authors.isEmpty()) {
            System.out.println("Aradığınız yazarın kitabı bulunamadı");
        } else {
            System.out.println("Aradığınız yazarın kitapları: ");
            authors.forEach(System.out::println);
        }
    }
}
