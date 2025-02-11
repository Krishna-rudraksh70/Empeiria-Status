package com.arklibrary.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.arklibrary.Util.HibernateUtil;
import com.arklibrary.model.Borrower;

public class BorrowerDao {
    
    public static void insertBorrower(Borrower borrower) {
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();

        session.persist(borrower);

        transaction.commit();
        
    }

    public static void updateBorrower(Borrower borrower) {
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();

        session.merge(borrower);

        transaction.commit();
        
    }

    public static Borrower getBorrowerById(int borrowerId) {
        Session session = HibernateUtil.getSession();
        Borrower borrower = session.get(Borrower.class, borrowerId);
        
        return borrower;
    }

    public static List<Borrower> getBorrowersByName(String name) {
        Session session = HibernateUtil.getSession();
        List<Borrower> borrowers = session.createQuery("FROM Borrower WHERE bName LIKE :name", Borrower.class)
                .setParameter("name", "%" + name + "%")
                .getResultList();
        
        return borrowers;
    }

    public static void showAllBorrower() {
        Session session = HibernateUtil.getSession();
        List<Borrower> borrowers = session.createQuery("FROM Borrower", Borrower.class).getResultList();

        if (borrowers.isEmpty())
            System.out.println("No Borrower found.");
        else{
            System.out.println("Borrower list");
            borrowers.forEach(borrower -> System.out.println(borrower));
        }

        
    }

}