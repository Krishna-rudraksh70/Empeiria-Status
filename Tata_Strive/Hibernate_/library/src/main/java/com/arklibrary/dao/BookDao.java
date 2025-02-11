package com.arklibrary.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.arklibrary.Util.HibernateUtil;
import com.arklibrary.model.Book;

public class BookDao {

    public static void insertBook(Book book) {
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();

        book.setBAuthor(session.merge(book.getBAuthor()));

        session.persist(book);

        transaction.commit();
    }

    public static void updateBook(Book book) {
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();

        if (book != null) {
            session.merge(book);
        }

        transaction.commit();
    }

    public static Book getBookById(int bookId) {
        Session session = HibernateUtil.getSession();
        Book book = session.get(Book.class, bookId);
        
        return book;
    }

    // public static Book getBookById(int bookId) {
    //     Session session = HibernateUtil.getSession();
    
    //     Book book = session.createQuery("FROM Book b JOIN FETCH b.bAuthor WHERE b.id = :bookId", Book.class)
    //                        .setParameter("bookId", bookId)
    //                        .uniqueResult();
    
    //     
    //     return book;
    // }
    

    public static List<Book> getBooksByTitle(String title) {
        Session session = HibernateUtil.getSession();
        List<Book> books = session.createQuery("FROM Book WHERE bTitle LIKE :title", Book.class)
                .setParameter("title", "%" + title + "%")
                .getResultList();
        
        return books;
    }

    public static void showAllBooks() {
        Session session = HibernateUtil.getSession();
        List<Book> books = session.createQuery("FROM Book", Book.class).getResultList();

        if (books.isEmpty())
            System.out.println("No books found.");
        else{
            System.out.println("Books list");
            books.forEach(book -> System.out.println(book));
        }  

        
    }

}