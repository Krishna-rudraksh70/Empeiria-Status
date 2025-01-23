package com.hybernet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hybernet.model.User;

public class App {
    public static void main(String[] args) {

        Configuration cfg = new Configuration();
        cfg.configure();

        try (SessionFactory sf = cfg.buildSessionFactory()) {

            try (Session s = sf.openSession()) {
                System.out.println(s);
                System.out.println("Session Opened");

                s.beginTransaction();

                User user = new User(1, "RK", "Password001");

                //s.save(user); //deprecated
                s.persist(user);
                System.out.println("User Saved");

                s.getTransaction().commit();
                System.out.println("Transaction Committed");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
