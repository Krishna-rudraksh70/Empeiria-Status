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
                case 5 -> updateStudent();
                case 6 -> deleteStudent();
                case 7 -> updateTeacher();
                case 8 -> updateAddress();
                case 9 -> searchStudent();
                case 10 -> searchTeacher();
                case 11 -> searchAddress();
                case 12 -> {
                    System.out.println("Exiting...");
                    HibernateUtil.shutdown();
                    scanner.close();
                    return;
                }
                default -> System.out.println("Invalid choice. Try again.");
            }

        } while (true);
    }

    private static void menu() {
        System.out.println("\nChoose an option:");
        System.out.println("1. Add Student");
        System.out.println("2. Add Teacher");
        System.out.println("3. Add Address");
        System.out.println("4. View All Data");
        System.out.println("5. Update Student");
        System.out.println("6. Delete Student");
        System.out.println("7. Update Teacher");
        System.out.println("8. Update Address");
        System.out.println("9. Search Student");
        System.out.println("10. Search Teacher");
        System.out.println("11. Search Address");
        System.out.println("12. Exit");
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

    private static void updateStudent() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();

            System.out.print("Enter Student ID to update: ");
            int sid = scanner.nextInt();
            scanner.nextLine();

            Student student = session.get(Student.class, sid);
            if (student == null) {
                System.out.println("Student not found!");
                return;
            }

            System.out.print("Enter new Name (leave blank to keep current): ");
            String newName = scanner.nextLine();
            if (!newName.isEmpty())
                student.setStName(newName);

            System.out.print("Enter new Course (leave blank to keep current): ");
            String newCourse = scanner.nextLine();
            if (!newCourse.isEmpty())
                student.setStCourse(newCourse);

            System.out.print("Enter new Age (or -1 to keep current): ");
            int newAge = scanner.nextInt();
            scanner.nextLine();
            if (newAge > 0)
                student.setStAge(newAge);

            session.merge(student);
            transaction.commit();
            System.out.println("Student updated successfully!");
        }
    }

    private static void deleteStudent() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();

            System.out.print("Enter Student ID to delete: ");
            int sid = scanner.nextInt();
            scanner.nextLine();

            Student student = session.get(Student.class, sid);
            if (student != null) {
                session.remove(student);
                transaction.commit();
                System.out.println("Student deleted successfully!");
            } else {
                System.out.println("Student not found!");
            }
        }
    }

    private static void updateTeacher() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();

            System.out.print("Enter Teacher ID to update: ");
            int tid = scanner.nextInt();
            scanner.nextLine();

            Teacher teacher = session.get(Teacher.class, tid);
            if (teacher == null) {
                System.out.println("Teacher not found!");
                return;
            }

            System.out.print("Enter new Name (leave blank to keep current): ");
            String newName = scanner.nextLine();
            if (!newName.isEmpty())
                teacher.setTname(newName);

            System.out.print("Enter new Course (leave blank to keep current): ");
            String newCourse = scanner.nextLine();
            if (!newCourse.isEmpty())
                teacher.setTcourse(newCourse);

            System.out.print("Enter new Department (leave blank to keep current): ");
            String newDept = scanner.nextLine();
            if (!newDept.isEmpty())
                teacher.setTdept(newDept);

            session.merge(teacher);
            transaction.commit();
            System.out.println("Teacher updated successfully!");
        }
    }

    private static void updateAddress() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();

            System.out.print("Enter Address ID to update: ");
            int addId = scanner.nextInt();
            scanner.nextLine();

            Address address = session.get(Address.class, addId);
            if (address == null) {
                System.out.println("Address not found!");
                return;
            }

            System.out.print("Enter new Address (leave blank to keep current): ");
            String newAddress = scanner.nextLine();
            if (!newAddress.isEmpty())
                address.setAddress(newAddress);

            System.out.print("Enter new Pincode (or -1 to keep current): ");
            int newPincode = scanner.nextInt();
            scanner.nextLine();
            if (newPincode > 0)
                address.setPincode(newPincode);

            session.merge(address);
            transaction.commit();
            System.out.println("Address updated successfully!");
        }
    }

    private static void searchStudent() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            System.out.println("Search Student by:");
            System.out.println("1. ID");
            System.out.println("2. Name");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            List<Student> students;

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Student ID: ");
                    int sid = scanner.nextInt();
                    scanner.nextLine();
                    Student student = session.get(Student.class, sid);
                    if (student != null) {
                        System.out.println(student);
                    } else {
                        System.out.println("Student not found!");
                    }
                }
                case 2 -> {
                    System.out.print("Enter Student Name: ");
                    String sname = scanner.nextLine();
                    students = session.createQuery("FROM Student WHERE stName LIKE :name", Student.class)
                            .setParameter("name", "%" + sname + "%")
                            .list();
                    if (students.isEmpty()) {
                        System.out.println("No students found!");
                    } else {
                        students.forEach(System.out::println);
                    }
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }

    private static void searchTeacher() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            System.out.println("Search Teacher by:");
            System.out.println("1. ID");
            System.out.println("2. Name");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            List<Teacher> teachers;

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Teacher ID: ");
                    int tid = scanner.nextInt();
                    scanner.nextLine();
                    Teacher teacher = session.get(Teacher.class, tid);
                    if (teacher != null) {
                        System.out.println(teacher);
                    } else {
                        System.out.println("Teacher not found!");
                    }
                }
                case 2 -> {
                    System.out.print("Enter Teacher Name: ");
                    String tname = scanner.nextLine();
                    teachers = session.createQuery("FROM Teacher WHERE tname LIKE :name", Teacher.class)
                            .setParameter("name", "%" + tname + "%")
                            .list();
                    if (teachers.isEmpty()) {
                        System.out.println("No teachers found!");
                    } else {
                        teachers.forEach(System.out::println);
                    }
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }

    private static void searchAddress() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            System.out.println("Search Address by:");
            System.out.println("1. ID");
            System.out.println("2. Pincode");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            List<Address> addresses;

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Address ID: ");
                    int addId = scanner.nextInt();
                    scanner.nextLine();
                    Address address = session.get(Address.class, addId);
                    if (address != null) {
                        System.out.println(address);
                    } else {
                        System.out.println("Address not found!");
                    }
                }
                case 2 -> {
                    System.out.print("Enter Pincode: ");
                    int pincode = scanner.nextInt();
                    scanner.nextLine();
                    addresses = session.createQuery("FROM Address WHERE pincode = :pincode", Address.class)
                            .setParameter("pincode", pincode)
                            .list();
                    if (addresses.isEmpty()) {
                        System.out.println("No addresses found!");
                    } else {
                        addresses.forEach(System.out::println);
                    }
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }

}