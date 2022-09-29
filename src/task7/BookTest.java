package task7;

import java.util.Scanner;

public class BookTest {
    public static void main(String[] args) {
        Bookshelf bookshelf = new Bookshelf();
        Book book1 = new Book("Marcel Proust","In Search of Lost Time", 1913);
        Book book2 = new Book("Herman Melville","Moby Dick", 1851);
        Book book3 = new Book("James Joyce","Ulysses", 2012);

        bookshelf.addBook(book1);
        bookshelf.addBook(book2);
        bookshelf.addBook(book3);

        int menu = 1;
        String book_author;
        String book_name;
        int publication_year;
        Book book;
        while (menu!=0) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("What to do?\n" +
                    "1 - Add a new book\n" +
                    "2 - Print the book with the earliest edition\n" +
                    "3 - Print the book with the latest edition\n" +
                    "0 - Exit\n" +
                    "Enter: ");
            menu = scanner.nextInt();
            switch (menu) {
                case 1:
                    System.out.print("Enter the name of the book: ");
                    book_name = scanner.next();
                    System.out.print("Enter the author of the book: ");
                    book_author = scanner.next();
                    System.out.print("Enter the publication year of the book: ");
                    publication_year = scanner.nextInt();
                    book = new Book(book_author, book_name, publication_year);
                    bookshelf.addBook(book);
                    break;
                case 2:
                    System.out.println(bookshelf.getBookWithEarliestEdition());
                    break;
                case 3:
                    System.out.println(bookshelf.getBookWithLatestEdition());
                    break;
                default:
                    break;
            }
        }
    }
}