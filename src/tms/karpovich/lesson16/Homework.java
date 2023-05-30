package tms.karpovich.lesson16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Homework {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(new Book("Hemingway", "Hemingway's first", 1933),
                new Book("Hemingway", "Hemingway's second", 1939),
                new Book("Hemingway", "Hemingway's third", 1945),
                new Book("Twain", "Twain's first", 1927),
                new Book("Twain", "Twain's second", 1933),
                new Book("Fitzgerald", "Fitzgerald's first", 1918),
                new Book("Fitzgerald", "Fitzgerald's second", 1925),
                new Book("Fitzgerald", "Fitzgerald's third", 1927),
                new Book("Fitzgerald", "Fitzgerald's fourth", 1933),
                new Book("King", "King's first", 1946));
        var booksByYearOfPublishing = books.stream().collect(Collectors.groupingBy(Book::getYearOfPublishing));
        var authorsYearsOfPublishing = books.stream().collect(Collectors.groupingBy(Book::getAuthor, Collectors.mapping(Book::getYearOfPublishing, Collectors.toList())));
        var bookAmountForEveryYear = books.stream().collect(Collectors.groupingBy(Book::getYearOfPublishing, Collectors.counting()));
        var bookAmountForEveryAuthor = books.stream().collect(Collectors.groupingBy(Book::getAuthor, Collectors.counting()));
        Map<Character, List<Book>> result = books.stream().collect(Collectors.groupingBy(book -> book.getBookTitle().charAt(0)));

        System.out.println(bookAmountForEveryAuthor);
    }
    
  
}
