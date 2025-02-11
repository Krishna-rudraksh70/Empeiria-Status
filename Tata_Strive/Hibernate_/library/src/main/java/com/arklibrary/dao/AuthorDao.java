package com.arklibrary.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.arklibrary.Util.HibernateUtil;
import com.arklibrary.model.Author;

public class AuthorDao {

    public static void insertAuthor(Author author) {
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();

        session.persist(author);

        transaction.commit();
        
    }

    public static void updateAuthor(int authorId, String newName) {
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();

        Author author = session.get(Author.class, authorId);
        if (author != null) {
            author.setAName(newName);
            session.merge(author);
        }

        transaction.commit();
        
    }

    public static Author getAuthorById(int authorId) {
        Session session = HibernateUtil.getSession();
        Author author = session.get(Author.class, authorId);
        
        return author;
    }

    public static List<Author> getAuthorsByName(String name) {
        Session session = HibernateUtil.getSession();
        List<Author> authors = session.createQuery("FROM Author WHERE aName LIKE :name", Author.class)
                .setParameter("name", "%" + name + "%")
                .getResultList();
        
        return authors;
    }

    public static void showAllAuthors() {
        Session session = HibernateUtil.getSession();
        List<Author> authors = session.createQuery("FROM Author", Author.class).getResultList();

        if (authors.isEmpty())
            System.out.println("No authors found.");
        else {
            System.out.println("Authors list");
            authors.forEach(author -> System.out.println(author));
        }

        
    }

}