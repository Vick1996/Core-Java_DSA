package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample
{
    public static void main(String[] args)
    {

        List<Book> books = new ArrayList<>();
        books.add(new Book("The Great Gatsby", "Lily", 1925));
        books.add(new Book("To Kill a Mockingbird", "Harper", 1960));
        books.add(new Book("1984", "George", 1949));

        System.out.println("\n Sorting using comparable by publication year\n");
        Collections.sort(books);

        for (Book book : books)
        {
            System.out.println(book);
        }
    }
}