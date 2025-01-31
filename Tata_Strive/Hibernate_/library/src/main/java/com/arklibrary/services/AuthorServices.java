package com.arklibrary.services;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.arklibrary.model.Author;

public class AuthorServices {

    public static void insertAuthor(Author author) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        session.persist(author);

        transaction.commit();
        session.close();
    }

    public static void updateAuthor(int authorId, String newName) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        Author author = session.get(Author.class, authorId);
        if (author != null) {
            author.setAName(newName);
            session.merge(author);
        }

        transaction.commit();
        session.close();
    }

    public static Author getAuthorById(int authorId) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Author author = session.get(Author.class, authorId);
        session.close();
        return author;
    }

    public static List<Author> getAuthorsByName(String name) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Author> authors = session.createQuery("FROM Author WHERE aName LIKE :name", Author.class)
                .setParameter("name", "%" + name + "%")
                .getResultList();
        session.close();
        return authors;
    }

    public static void showAllAuthors() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Author> authors = session.createQuery("FROM Author", Author.class).getResultList();

        if (authors.isEmpty())
            System.out.println("No authors found.");
        else {
            System.out.println("Authors list");
            authors.forEach(author -> System.out.println(author));
        }

        session.close();
    }

}