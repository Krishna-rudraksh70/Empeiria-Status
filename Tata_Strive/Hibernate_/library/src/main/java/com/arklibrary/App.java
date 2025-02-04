package com.arklibrary;

import com.arklibrary.dao.AuthorUtil;
import com.arklibrary.dao.BookUtil;
import com.arklibrary.dao.BorrowerUtil;
import com.arklibrary.dao.HibernateUtil;
import com.arklibrary.model.Author;
import com.arklibrary.model.Book;
import com.arklibrary.model.Borrower;

import java.util.List;
import java.util.Scanner;

public class App {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        do {
            showMenu();

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> addBook();
                case 2 -> updateBook();
                case 3 -> getBookById();
                case 4 -> getBooksByTitle();
                case 5 -> allBooks();
                case 6 -> addAuthor();
                case 7 -> updateAuthor();
                case 8 -> getAuthorById();
                case 9 -> getAuthorByName();
                case 10 -> allAuthors();
                case 11 -> addBorrower();
                case 12 -> updateBorrower();
                case 13 -> getBorrowerById();
                case 14 -> getBorrowerByName();
                case 15 -> allBorrowers();
                case 16 -> allDetails();
                case 0 -> {
                    HibernateUtil.shutdown();
                    System.out.println("Application closed.");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Invalid choice, please try again.");
            }
        } while (true);

    }

    private static void showMenu() {
        System.out.println("\nLibrary System");
        System.out.println("1. Add Book");
        System.out.println("2. Update Book");
        System.out.println("3. Get Book by ID");
        System.out.println("4. Get Book by title");
        System.out.println("5. All Book details");
        System.out.println("6. Add Author");
        System.out.println("7. Update Author");
        System.out.println("8. Get Author by ID");
        System.out.println("9. Get Author by Name");
        System.out.println("10. All Author details");
        System.out.println("11. Add Borrower");
        System.out.println("12. Update Borrower");
        System.out.println("13. Get Borrower by ID");
        System.out.println("14. Get Borrower by Name");
        System.out.println("15. All Borrower details");
        System.out.println("16. All Details");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void addBook() {
        System.out.print("Enter Book Title: ");
        String title = scanner.nextLine();

        System.out.print("Enter Book Price: ");
        double price = scanner.nextDouble();

        System.out.print("Enter Publication Year: ");
        int year = scanner.nextInt();

        System.out.print("Enter Number of Copies: ");
        int copies = scanner.nextInt();
        scanner.nextLine();

        AuthorUtil.showAllAuthors();

        System.out.print("Enter Author ID: ");
        int authorId = scanner.nextInt();
        scanner.nextLine();

        Author author = AuthorUtil.getAuthorById(authorId);
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

        BookUtil.insertBook(book);
        System.out.println("Book added successfully!");
    }

    private static void updateBook() {
        System.out.print("Enter Book ID to update: ");
        int bookId = scanner.nextInt();
        scanner.nextLine();

        Book book = BookUtil.getBookById(bookId);
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
                AuthorUtil.showAllAuthors();
                System.out.print("Enter new Author ID: ");
                int authorId = scanner.nextInt();
                Author newAuthor = AuthorUtil.getAuthorById(authorId);
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

        BookUtil.updateBook(book);
        System.out.println("Book updated successfully!");
    }

    private static void getBookById() {
        System.out.print("Enter Book ID: ");
        int bookId = scanner.nextInt();
        scanner.nextLine();

        Book book = BookUtil.getBookById(bookId);
        if (book != null)
            System.out.println(book);
        else
            System.out.println("Book not found!");
    }

    private static void getBooksByTitle() {
        System.out.print("Enter Book Title to search: ");
        String title = scanner.nextLine();

        List<Book> books = BookUtil.getBooksByTitle(title);
        if (books.isEmpty())
            System.out.println("No books found!");
        else
            books.forEach(book -> System.out.println(book));
    }

    private static void allBooks() {

        BookUtil.showAllBooks();

    }

    public static void addAuthor() {
        System.out.print("Enter Author Name: ");
        String name = scanner.nextLine();

        Author author = new Author();
        author.setAName(name);

        AuthorUtil.insertAuthor(author);

        System.out.println("Author added successfully!");
    }

    private static void updateAuthor() {
        System.out.print("Enter Author ID to update: ");
        int authorId = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter new Author Name: ");
        String newName = scanner.nextLine();

        AuthorUtil.updateAuthor(authorId, newName);
        System.out.println("Author updated successfully!");
    }

    private static void getAuthorById() {
        System.out.print("Enter Author ID: ");
        int authorId = scanner.nextInt();
        scanner.nextLine();

        Author author = AuthorUtil.getAuthorById(authorId);
        if (author != null)
            System.out.println(author);
        else
            System.out.println("Author not found!");
    }

    private static void getAuthorByName() {
        System.out.print("Enter Author Name to search: ");
        String name = scanner.nextLine();

        List<Author> authors = AuthorUtil.getAuthorsByName(name);
        if (authors.isEmpty())
            System.out.println("No authors found!");
        else
            authors.forEach(author -> System.out.println(author));
    }

    private static void allAuthors() {

        AuthorUtil.showAllAuthors();

    }

    private static void addBorrower() {
        System.out.print("Enter Borrower Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Borrower Email: ");
        String email = scanner.nextLine();

        System.out.print("Enter Borrower Phone Number: ");
        String phoneNumber = scanner.nextLine();

        Borrower borrower = new Borrower();
        borrower.setBName(name);
        borrower.setBEmail(email);
        borrower.setBPhoneNumber(phoneNumber);

        BorrowerUtil.insertBorrower(borrower);
        System.out.println("Borrower added successfully!");
    }

    private static void updateBorrower() {
        System.out.print("Enter Borrower ID to update: ");
        int borrowerId = scanner.nextInt();
        scanner.nextLine();

        Borrower borrower = BorrowerUtil.getBorrowerById(borrowerId);
        if (borrower == null) {
            System.out.println("Borrower not found.");
            return;
        }

        System.out.println("What would you like to update?");
        System.out.println("1. Borrower Name");
        System.out.println("2. Borrower Phone Number");
        System.out.println("3. Borrower Email");
        System.out.print("Select an option (1-3): ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1 -> {
                System.out.print("Enter new Borrower Name: ");
                String newName = scanner.nextLine();
                borrower.setBName(newName);
            }
            case 2 -> {
                System.out.print("Enter new Borrower Phone Number: ");
                String newPhoneNumber = scanner.nextLine();
                borrower.setBPhoneNumber(newPhoneNumber);
            }
            case 3 -> {
                System.out.print("Enter new Borrower Email: ");
                String newEmail = scanner.nextLine();
                borrower.setBEmail(newEmail);
            }
            default -> {
                System.out.println("Invalid option.");
                return;
            }
        }

        BorrowerUtil.updateBorrower(borrower);
        System.out.println("Borrower updated successfully!");
    }

    private static void getBorrowerById() {
        System.out.print("Enter Borrower ID: ");
        int borrowerId = scanner.nextInt();
        scanner.nextLine();

        Borrower borrower = BorrowerUtil.getBorrowerById(borrowerId);
        if (borrower != null)
            System.out.println(borrower);
        else
            System.out.println("Borrower not found!");
    }

    private static void getBorrowerByName() {
        System.out.print("Enter Borrower Name to search: ");
        String name = scanner.nextLine();

        List<Borrower> borrowers = BorrowerUtil.getBorrowersByName(name);
        if (borrowers.isEmpty())
            System.out.println("No borrowers found!");
        else
            borrowers.forEach(borrower -> System.out.println(borrower));
    }

    private static void allBorrowers(){

        BorrowerUtil.showAllBorrower();

    }

    private static void allDetails(){
        System.out.println();
        allBooks();
        System.out.println();
        allAuthors();
        System.out.println();
        allBorrowers();
        System.out.println();
    }

}
