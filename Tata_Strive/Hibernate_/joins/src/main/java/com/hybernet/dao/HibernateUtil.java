package com.hybernet.dao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hybernet.model.Student;

public class HibernateUtil {
    private static SessionFactory sessionFactory;

    static{
        try{
            sessionFactory = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();
        } catch (Exception e){
            e.printStackTrace();
            throw new ExceptionInInitializerError("Failed to create sessionFactory object." + e);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static void shutdown() {
        if (sessionFactory != null) {
            sessionFactory.close();
        }
    }
}
