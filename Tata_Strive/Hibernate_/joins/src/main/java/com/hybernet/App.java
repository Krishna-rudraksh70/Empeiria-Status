package com.hybernet;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hybernet.dao.HibernateUtil;
import com.hybernet.model.Address;
import com.hybernet.model.Student;
import com.hybernet.model.Teacher;

public class App {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        do {

            menu();

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> addStudent();
                case 2 -> addTeacher();
                case 3 -> addAddress();
                case 4 -> viewAllData();
                case 5 -> {
                    System.out.println("Exiting...");
                    HibernateUtil.shutdown();
                    return;
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        } while(true);
    }

    private static void menu() {
        System.out.println("\nChoose an option:");
        System.out.println("1. Add Student");
        System.out.println("2. Add Teacher");
        System.out.println("3. Add Address");
        System.out.println("4. View All Data");
        System.out.println("5. Exit");
        System.out.print("Enter choice: ");
    }

    private static void addStudent() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();

            System.out.print("Enter Student Name: ");
            String sname = scanner.nextLine();

            System.out.print("Enter Course: ");
            String scourse = scanner.nextLine();

            System.out.print("Enter Age: ");
            int sage = scanner.nextInt();
            scanner.nextLine();

            List<Teacher> teachers = session.createQuery("FROM Teacher", Teacher.class).list();
            System.out.println("Choose a Teacher (ID):");
            teachers.forEach(t -> System.out.println(t.getTid() + " - " + t.getTname()));
            System.out.println();

            int tid = scanner.nextInt();
            scanner.nextLine();
            Teacher teacher = session.get(Teacher.class, tid);

            List<Address> addresses = session.createQuery("FROM Address", Address.class).list();
            System.out.println("Choose an Address (ID):");
            addresses.forEach(a -> System.out.println(a.getAddId() + " - " + a.getAddress()));
            System.out.println();

            int addId = scanner.nextInt();
            scanner.nextLine();
            Address address = session.get(Address.class, addId);

            Student student = new Student(sname, scourse, sage, teacher, address);
            session.persist(student);

            transaction.commit();
            System.out.println("Student added successfully!");
        }
    }

    private static void addTeacher() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();

            System.out.print("Enter Teacher Name: ");
            String tname = scanner.nextLine();

            System.out.print("Enter Course: ");
            String tcourse = scanner.nextLine();

            System.out.print("Enter Department: ");
            String tdept = scanner.nextLine();

            List<Address> addresses = session.createQuery("FROM Address", Address.class).list();
            System.out.println("Choose an Address (ID):");
            addresses.forEach(a -> System.out.println(a.getAddId() + " - " + a.getAddress()));
            System.out.println();

            int addId = scanner.nextInt();
            scanner.nextLine();
            Address address = session.get(Address.class, addId);

            Teacher teacher = new Teacher(tname, tcourse, tdept, address);
            session.persist(teacher);

            transaction.commit();
            System.out.println("Teacher added successfully!");
        }
    }

    private static void addAddress() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();

            System.out.print("Enter Address: ");
            String addr = scanner.nextLine();

            System.out.print("Enter Pincode: ");
            int pincode = scanner.nextInt();
            scanner.nextLine();

            Address address = new Address(addr, pincode);
            session.persist(address);

            transaction.commit();
            System.out.println("Address added successfully!");
        }
    }

    private static void viewAllData() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            System.out.println("\n--- Students ---");
            List<Student> students = session.createQuery("FROM Student", Student.class).list();
            students.forEach(System.out::println);

            System.out.println("\n--- Teachers ---");
            List<Teacher> teachers = session.createQuery("FROM Teacher", Teacher.class).list();
            teachers.forEach(System.out::println);

            System.out.println("\n--- Addresses ---");
            List<Address> addresses = session.createQuery("FROM Address", Address.class).list();
            addresses.forEach(System.out::println);
        }
    }
}