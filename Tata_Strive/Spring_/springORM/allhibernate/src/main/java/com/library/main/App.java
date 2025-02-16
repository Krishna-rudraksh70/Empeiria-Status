package com.library.main;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.dao.DataIntegrityViolationException;

import com.library.config.AppConfig;
import com.library.config.HibernateConfig;
import com.library.model.Author;
import com.library.model.Book;
import com.library.service.AuthorService;
import com.library.service.BookService;

public class App {

    public static Author getExistingAuthor() {
        System.out.println("Existing Authors:");
        List<Author> authors = authorService.getAllAuthors();
        authors.forEach(author -> System.out.println(author.getAId() + ". " + author.getAName()));

        System.out.print("Choose an existing author by ID or press 0 to add a new author: ");
        int authorId = scanner.nextInt();
        scanner.nextLine();

        if (authorId == 0) {
            addAuthor();
            System.out.print("Enter the ID of the newly added author: ");
            authorId = scanner.nextInt();
            scanner.nextLine();
        }

        return authorService.getAuthor(authorId);
    }

    private static final Scanner scanner = new Scanner(System.in);

    private static BookService bookService;
    private static AuthorService authorService;

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class, HibernateConfig.class);
        bookService = context.getBean(BookService.class);
        authorService = context.getBean(AuthorService.class);

        do {

            menu();

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> addAuthor();
                case 2 -> addBook();
                case 3 -> updateAuthor();
                case 4 -> updateBook();
                case 5 -> deleteAuthor();
                case 6 -> deleteBook();
                case 7 -> getAuthor();
                case 8 -> getBook();
                case 9 -> getAuthors();
                case 10 -> getBooks();
                case 11 -> getAll();
                case 12 -> {
                    context.close();
                    return;
                }
                default -> System.out.println("Invalid choice!");
            }
        } while (true);
    }

    public static void menu() {
        System.out.println("\nARK Library");
        System.out.println("1. Add Author");
        System.out.println("2. Add Book");
        System.out.println("3. Update Author");
        System.out.println("4. Update Book");
        System.out.println("5. Delete Author");
        System.out.println("6. Delete Book");
        System.out.println("7. Get Author By Id");
        System.out.println("8. Get Book By Id");
        System.out.println("9. Get All Author");
        System.out.println("10. Get All Book");
        System.out.println("11. Get All Details");
        System.out.println("12. Exit");
        System.out.print("Enter choice: ");
    }

    public static void addAuthor() {
        System.out.print("Enter Author Name: ");
        String name = scanner.nextLine();
        authorService.addAuthor(new Author(name));
        System.out.println("Author added successfully.");
    }

    public static void addBook() {

        System.out.print("Enter book title: ");
        String title = scanner.nextLine();
        System.out.print("Enter book publication year: ");
        int publicationYear = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter book no. of copies: ");
        int copies = scanner.nextInt();
        scanner.nextLine();

        bookService.addBook(new Book(title, publicationYear, copies, getExistingAuthor()));
        System.out.println("Book added successfully!");
    }

    public static void updateAuthor() {
        System.out.print("Enter Author ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        Author author = authorService.getAuthor(id);
        if (author != null) {
            System.out.print("Enter new name (current: " + author.getAName() + "): ");
            String name = scanner.nextLine();
            author.setAName(name);
            authorService.updateAuthor(author);
            System.out.println("Author updated successfully.");
        } else {
            System.out.println("Author not found.");
        }
    }

    private static void updateBook() {
        System.out.print("Enter Book ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        Book book = bookService.getBook(id);
        if (book != null) {
            System.out.print("Enter new title (current: " + book.getBTitle() + "): ");
            String title = scanner.nextLine();
            System.out.print("Enter new book publication year (current: " + book.getPublicationYear() + "): ");
            int publicationYear = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter book updated no. of copies (current: " + book.getCopies() + "): ");
            int copies = scanner.nextInt();
            scanner.nextLine();
            bookService.updateBook(new Book(id, title, publicationYear, copies, getExistingAuthor()));
            System.out.println("Book updated successfully.");
        } else {
            System.out.println("Book not found.");
        }
    }

    private static void deleteAuthor() {
        System.out.print("Enter Author ID to delete: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        if (authorService.getAuthor(id) == null) {
            System.out.println("Author not exist");
        } else {
            try {
                authorService.removeAuthor(id);
            } catch (DataIntegrityViolationException e)  {
                System.out.println("Remove All associated Books first");
                return;
            }
            System.out.println("Author deleted successfully.");
        }
    }

    private static void deleteBook() {
        System.out.print("Enter Book ID to delete: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        if (bookService.getBook(id) == null) {
            System.out.println("Book not exist");
        } else {
            bookService.removeBook(id);
            System.out.println("Book deleted successfully.");
        }
    }

    private static void getAuthor() {
        System.out.print("Enter Author ID to fetch: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Author author = authorService.getAuthor(id);

        if (author == null) {
            System.out.println("Author not exist");
        } else {
            System.out.println(author);
        }
    }

    private static void getBook() {
        System.out.print("Enter Book ID to fetch: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Book book = bookService.getBook(id);

        if (book == null) {
            System.out.println("Book not exist");
        } else {
            System.out.println(book);
        }
    }

    private static void getAuthors() {
        List<Author> authors = authorService.getAllAuthors();
        System.out.println("\nAll Authors:");
        authors.forEach(author -> System.out
                .println(author.getAId() + ". " + author.getAName()));
    }

    private static void getBooks() {
        List<Book> books = bookService.getAllBooks();
        System.out.println("\nAll Books:");
        books.forEach(book -> System.out
                .println(book.getBId() + ". " + book.getBTitle() + " (" + book.getPublicationYear() + ") - "
                        + book.getPublicationYear() + " -> " + book.getBAuthor()));
    }

    public static void getAll() {
        getAuthors();

        getBooks();
    }
}