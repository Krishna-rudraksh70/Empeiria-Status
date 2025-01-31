package com.arklibrary.services;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.arklibrary.model.Book;

public class BookServices {

    public static void insertBook(Book book) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        session.persist(book);

        transaction.commit();
        session.close();
    }

    public static void updateBook(Book book) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        if (book != null) {
            session.merge(book);
        }

        transaction.commit();
        session.close();
    }

    public static Book getBookById(int bookId) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Book book = session.get(Book.class, bookId);
        session.close();
        return book;
    }

    public static List<Book> getBooksByTitle(String title) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Book> books = session.createQuery("FROM Book WHERE bTittle LIKE :title", Book.class)
                .setParameter("title", "%" + title + "%")
                .getResultList();
        session.close();
        return books;
    }

    public static void showAllBooks() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Book> books = session.createQuery("FROM Book", Book.class).getResultList();

        if (books.isEmpty())
            System.out.println("No books found.");
        else{
            System.out.println("Books list");
            books.forEach(book -> System.out.println(book));
        }  

        session.close();
    }

}