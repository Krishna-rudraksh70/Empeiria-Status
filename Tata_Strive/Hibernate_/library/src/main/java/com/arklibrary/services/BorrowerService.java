package com.arklibrary.services;

import java.util.List;
import java.util.Scanner;

import com.arklibrary.dao.BorrowerDao;
import com.arklibrary.model.Borrower;

public class BorrowerService {

    private static final Scanner scanner = new Scanner(System.in);
    
    public static void addBorrower() {
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

        BorrowerDao.insertBorrower(borrower);
        System.out.println("Borrower added successfully!");
    }

    public static void updateBorrower() {
        System.out.print("Enter Borrower ID to update: ");
        int borrowerId = scanner.nextInt();
        scanner.nextLine();

        Borrower borrower = BorrowerDao.getBorrowerById(borrowerId);
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

        BorrowerDao.updateBorrower(borrower);
        System.out.println("Borrower updated successfully!");
    }

    public static void getBorrowerById() {
        System.out.print("Enter Borrower ID: ");
        int borrowerId = scanner.nextInt();
        scanner.nextLine();

        Borrower borrower = BorrowerDao.getBorrowerById(borrowerId);
        if (borrower != null)
            System.out.println(borrower);
        else
            System.out.println("Borrower not found!");
    }

    public static void getBorrowerByName() {
        System.out.print("Enter Borrower Name to search: ");
        String name = scanner.nextLine();

        List<Borrower> borrowers = BorrowerDao.getBorrowersByName(name);
        if (borrowers.isEmpty())
            System.out.println("No borrowers found!");
        else
            borrowers.forEach(borrower -> System.out.println(borrower));
    }

    public static void allBorrowers(){

        BorrowerDao.showAllBorrower();

    }

}
