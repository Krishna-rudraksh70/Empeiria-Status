package com.arklibrary.services;

import java.util.List;
import java.util.Scanner;

import com.arklibrary.dao.AuthorDao;
import com.arklibrary.model.Author;

public class AuthorService {

    private static final Scanner scanner = new Scanner(System.in);

    public static void addAuthor() {
        System.out.print("Enter Author Name: ");
        String name = scanner.nextLine();

        Author author = new Author();
        author.setAName(name);

        AuthorDao.insertAuthor(author);

        System.out.println("Author added successfully!");
    }

    public static void updateAuthor() {
        System.out.print("Enter Author ID to update: ");
        int authorId = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter new Author Name: ");
        String newName = scanner.nextLine();

        AuthorDao.updateAuthor(authorId, newName);
        System.out.println("Author updated successfully!");
    }

    public static void getAuthorById() {
        System.out.print("Enter Author ID: ");
        int authorId = scanner.nextInt();
        scanner.nextLine();

        Author author = AuthorDao.getAuthorById(authorId);
        if (author != null)
            System.out.println(author);
        else
            System.out.println("Author not found!");
    }

    public static void getAuthorByName() {
        System.out.print("Enter Author Name to search: ");
        String name = scanner.nextLine();

        List<Author> authors = AuthorDao.getAuthorsByName(name);
        if (authors.isEmpty())
            System.out.println("No authors found!");
        else
            authors.forEach(author -> System.out.println(author));
    }

    public static void allAuthors() {

        AuthorDao.showAllAuthors();

    }
    
}
