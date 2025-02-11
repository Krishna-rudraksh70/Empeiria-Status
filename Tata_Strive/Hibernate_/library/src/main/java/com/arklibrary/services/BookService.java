package com.arklibrary.services;

import java.util.List;
import java.util.Scanner;

import com.arklibrary.dao.AuthorDao;
import com.arklibrary.dao.BookDao;

import com.arklibrary.model.Author;
import com.arklibrary.model.Book;

public class BookService {

    private static final Scanner scanner = new Scanner(System.in);
    
    public static void addBook() {
        System.out.print("Enter Book Title: ");
        String title = scanner.nextLine();

        System.out.print("Enter Book Price: ");
        double price = scanner.nextDouble();

        System.out.print("Enter Publication Year: ");
        int year = scanner.nextInt();

        System.out.print("Enter Number of Copies: ");
        int copies = scanner.nextInt();
        scanner.nextLine();

        AuthorDao.showAllAuthors();

        System.out.print("Enter Author ID: ");
        int authorId = scanner.nextInt();
        scanner.nextLine();

        Author author = AuthorDao.getAuthorById(authorId);
        if (author == null) {
            System.out.println("Author not found!");
            return;
        }

        Book book = new Book();
        book.setBTitle(title);
        book.setBPrice(price);
        book.setPublicationYear(year);
        book.setCopies(copies);
        book.setBAuthor(author);

        BookDao.insertBook(book);
        System.out.println("Book added successfully!");
    }

    public static void updateBook() {
        System.out.print("Enter Book ID to update: ");
        int bookId = scanner.nextInt();
        scanner.nextLine();

        Book book = BookDao.getBookById(bookId);
        if (book == null) {
            System.out.println("Book not found.");
            return;
        }

        System.out.println("What would you like to update?");
        System.out.println("1. Book Title");
        System.out.println("2. Book Price");
        System.out.println("3. Publication Year");
        System.out.println("4. Copies");
        System.out.println("5. Author");
        System.out.print("Select an option (1-5): ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1 -> {
                System.out.print("Enter new Book Title: ");
                String newTitle = scanner.nextLine();
                book.setBTitle(newTitle);
            }
            case 2 -> {
                System.out.print("Enter new Book Price: ");
                double newPrice = scanner.nextDouble();
                book.setBPrice(newPrice);
            }
            case 3 -> {
                System.out.print("Enter new Publication Year: ");
                int newYear = scanner.nextInt();
                book.setPublicationYear(newYear);
            }
            case 4 -> {
                System.out.print("Enter new number of Copies: ");
                int newCopies = scanner.nextInt();
                book.setCopies(newCopies);
            }
            case 5 -> {
                AuthorDao.showAllAuthors();
                System.out.print("Enter new Author ID: ");
                int authorId = scanner.nextInt();
                Author newAuthor = AuthorDao.getAuthorById(authorId);
                if (newAuthor != null)
                    book.setBAuthor(newAuthor);
                else
                    System.out.println("Author not found.");
            }
            default -> {
                System.out.println("Invalid option.");
                return;
            }

        }

        BookDao.updateBook(book);
        System.out.println("Book updated successfully!");
    }

    public static void getBookById() {
        System.out.print("Enter Book ID: ");
        int bookId = scanner.nextInt();
        scanner.nextLine();

        Book book = BookDao.getBookById(bookId);
        if (book != null)
            System.out.println(book);
        else
            System.out.println("Book not found!");
    }

    public static void getBooksByTitle() {
        System.out.print("Enter Book Title to search: ");
        String title = scanner.nextLine();

        List<Book> books = BookDao.getBooksByTitle(title);
        if (books.isEmpty())
            System.out.println("No books found!");
        else
            books.forEach(book -> System.out.println(book));
    }

    public static void allBooks() {

        BookDao.showAllBooks();

    }

}
