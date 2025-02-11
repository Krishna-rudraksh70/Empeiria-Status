package com.arklibrary;

import com.arklibrary.Util.HibernateUtil;

import com.arklibrary.services.AuthorService;
import com.arklibrary.services.BookService;
import com.arklibrary.services.BorrowerService;

import java.util.Scanner;

public class App {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        do {
            showMenu();

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> BookService.addBook();
                case 2 -> BookService.updateBook();
                case 3 -> BookService.getBookById();
                case 4 -> BookService.getBooksByTitle();
                case 5 -> BookService.allBooks();
                case 6 -> AuthorService.addAuthor();
                case 7 -> AuthorService.updateAuthor();
                case 8 -> AuthorService.getAuthorById();
                case 9 -> AuthorService.getAuthorByName();
                case 10 -> AuthorService.allAuthors();
                case 11 -> BorrowerService.addBorrower();
                case 12 -> BorrowerService.updateBorrower();
                case 13 -> BorrowerService.getBorrowerById();
                case 14 -> BorrowerService.getBorrowerByName();
                case 15 -> BorrowerService.allBorrowers();
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

    

    private static void allDetails(){
        System.out.println();
        BookService.allBooks();
        System.out.println();
        AuthorService.allAuthors();
        System.out.println();
        BorrowerService.allBorrowers();
        System.out.println();
    }

}
