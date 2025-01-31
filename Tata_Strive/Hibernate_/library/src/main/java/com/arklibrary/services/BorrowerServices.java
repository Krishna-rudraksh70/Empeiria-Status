package com.arklibrary.services;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.arklibrary.model.Borrower;

public class BorrowerServices {
    
    public static void insertBorrower(Borrower borrower) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        session.persist(borrower);

        transaction.commit();
        session.close();
    }

    public static void updateBorrower(Borrower borrower) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        session.merge(borrower);

        transaction.commit();
        session.close();
    }

    public static Borrower getBorrowerById(int borrowerId) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Borrower borrower = session.get(Borrower.class, borrowerId);
        session.close();
        return borrower;
    }

    public static List<Borrower> getBorrowersByName(String name) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Borrower> borrowers = session.createQuery("FROM Borrower WHERE bName LIKE :name", Borrower.class)
                .setParameter("name", "%" + name + "%")
                .getResultList();
        session.close();
        return borrowers;
    }

    public static void showAllBorrower() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Borrower> borrowers = session.createQuery("FROM Borrower", Borrower.class).getResultList();

        if (borrowers.isEmpty())
            System.out.println("No authors found.");
        else{
            System.out.println("Borrower list");
            borrowers.forEach(borrower -> System.out.println(borrower));
        }

        session.close();
    }

}