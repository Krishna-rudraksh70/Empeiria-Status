package com.arklibrary.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.arklibrary.model.Book;

public class HibernateUtil {
    private static SessionFactory sessionFactory;
    private static Session session;

    static {
        try {
            sessionFactory = new Configuration().configure().addAnnotatedClass(Book.class).buildSessionFactory();
        } catch (Exception e) {
            e.printStackTrace();
            throw new ExceptionInInitializerError("Failed to create sessionFactory object." + e);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static Session getSession() {
        session = sessionFactory.openSession();
        return session;
    }

    public static void shutdown() {
        if (sessionFactory != null) {
            sessionFactory.close();
            session.close();
        }
    }

}