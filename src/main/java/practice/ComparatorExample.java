package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample
{
    public static void main(String[] args)
    {
        List<Book> books = new ArrayList<>();
        books.add(new Book("The Great Gatsby", "Lily", 1925));
        books.add(new Book("To Kill a Mockingbird", "Harper", 1960));
        books.add(new Book("1984", "George", 1949));

        // Sort books based on title using a Comparator
        System.out.println("\n\nSorting based on Title");
        Collections.sort(books, new NameComparator());
        for (Book book : books)
        {
            System.out.println(book);
        }

        //Sort books based on publication year
        System.out.println("\n\nSorting based on Publication year");
        Collections.sort(books, new YearComparator());
        for (Book book : books)
        {
            System.out.println(book);
        }


//        Collections.sort(books, Comparator.comparing(Book::getTitle));
    }

}

class NameComparator implements Comparator<Book>
{

    @Override
    public int compare(Book o1, Book o2)
    {
        return o1.getTitle().compareTo(o2.getTitle());
    }
}
 class YearComparator implements Comparator<Book>
{
    @Override
    public int compare(Book o1, Book o2)
    {
        return Integer.compare(o1.getPublicationYear(), o2.getPublicationYear());
    }
}