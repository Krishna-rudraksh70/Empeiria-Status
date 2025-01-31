package com.hybernet;

import org.hibernate.Session;
import org.hibernate.Transaction;
// import org.hibernate.query.Query;

import com.hybernet.model.User;
import com.hybernet.services.HibernateUtil;

// import java.util.List;
import java.util.Scanner;

public class App {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            showMenu();

            System.out.print("Enter your choice: ");
            int choice=scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 1 -> insertUser(); 
                // case 2 -> deleteUserById();
                // case 3 -> findUserById();
                // case 4 -> printAllUsers();
                // case 5 -> countTotalUsers();
                // case 6 -> updateUserById();
                // case 7 -> findUserByName();
                // case 8 -> validateUserLogin();
                // case 9 -> deleteAllUsers();
                case 10 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        } while(true);
    }

    private static void showMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Insert User");
        // System.out.println("2. Delete User by ID");
        // System.out.println("3. Find User by ID");
        // System.out.println("4. Print All Users");
        // System.out.println("5. Count Total Users");
        // System.out.println("6. Update User by ID");
        // System.out.println("7. Find User by Name");
        // System.out.println("8. Validate User Login");
        // System.out.println("9. Delete All Users");
        System.out.println("10. Exit");
    }

    private static void insertUser() {
        System.out.print("Enter User Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter User Password: ");
        String password = scanner.nextLine();

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        User user = new User(name, password);
        // session.save(user); // depricated
        session.persist(user);


        transaction.commit();
        session.close();
        System.out.println("User inserted successfully.");
    }

    // private static void deleteUserById() {
    //     System.out.print("Enter User ID to delete: ");
    //     int id = scanner.nextInt();

    //     Session session = HibernateUtil.getSessionFactory().openSession();
    //     Transaction transaction = session.beginTransaction();

    //     User user = session.get(User.class, id);
    //     if (user != null) {
    //         // session.delete(user); // depricated
    //         session.delete(user);
    //         transaction.commit();
    //         System.out.println("User deleted successfully.");
    //     } else {
    //         System.out.println("User not found with ID: " + id);
    //     }

    //     session.close();
    // }

    // private static void findUserById() {
    //     System.out.print("Enter User ID to find: ");
    //     int id = scanner.nextInt();

    //     Session session = HibernateUtil.getSessionFactory().openSession();
    //     User user = session.get(User.class, id);

    //     if (user != null) {
    //         System.out.println("User found: " + user);
    //     } else {
    //         System.out.println("User not found with ID: " + id);
    //     }

    //     session.close();
    // }

    // private static void printAllUsers() {
    //     Session session = HibernateUtil.getSessionFactory().openSession();
    //     Query<User> query = session.createQuery("FROM User", User.class);
    //     List<User> users = query.list();

    //     if (users.isEmpty()) {
    //         System.out.println("No users found.");
    //     } else {
    //         System.out.println("All Users:");
    //         for (User user : users) {
    //             System.out.println(user);
    //         }
    //     }

    //     session.close();
    // }

    // private static void countTotalUsers() {
    //     Session session = HibernateUtil.getSessionFactory().openSession();
    //     Query<Long> query = session.createQuery("SELECT COUNT(*) FROM User", Long.class);
    //     Long count = query.uniqueResult();

    //     System.out.println("Total number of users: " + count);
    //     session.close();
    // }

    // private static void updateUserById() {
    //     System.out.print("Enter User ID to update: ");
    //     int id = scanner.nextInt();
    //     scanner.nextLine();

    //     Session session = HibernateUtil.getSessionFactory().openSession();
    //     Transaction transaction = session.beginTransaction();

    //     User user = session.get(User.class, id);
    //     if (user != null) {
    //         System.out.print("Enter new name: ");
    //         String Name = scanner.nextLine();
    //         System.out.print("Enter new password: ");
    //         String Pass = scanner.nextLine();

    //         user.setName(Name);
    //         user.setPassword(Pass);

    //         session.update(user);
    //         transaction.commit();
    //         System.out.println("User updated successfully.");
    //     } else {
    //         System.out.println("User not found with ID: " + id);
    //     }

    //     session.close();
    // }

    // private static void findUserByName() {
    //     System.out.print("Enter User Name to find: ");
    //     String name = scanner.nextLine();

    //     Session session = HibernateUtil.getSessionFactory().openSession();
    //     Query<User> query = session.createQuery("FROM User WHERE name = :name", User.class);
    //     query.setParameter("name", name);
    //     List<User> users = query.list();

    //     if (users.isEmpty()) {
    //         System.out.println("No users found with name: " + name);
    //     } else {
    //         System.out.println("Users found:");
    //         for (User user : users) {
    //             System.out.println(user);
    //         }
    //     }

    //     session.close();
    // }

    // private static void validateUserLogin() {
    //     System.out.print("Enter User Name: ");
    //     String name = scanner.nextLine();

    //     System.out.print("Enter Password: ");
    //     String password = scanner.nextLine();

    //     Session session = HibernateUtil.getSessionFactory().openSession();
    //     Query<User> query = session.createQuery("FROM User WHERE name = :name AND password = :password", User.class);
    //     query.setParameter("name", name);
    //     query.setParameter("password", password);
    //     User user = query.uniqueResult();

    //     if (user != null) {
    //         System.out.println("Login successful. Welcome, " + user.getName() + "!");
    //     } else {
    //         System.out.println("Invalid username or password.");
    //     }

    //     session.close();
    // }

    // private static void deleteAllUsers() {
    //     Session session = HibernateUtil.getSessionFactory().openSession();
    //     Transaction transaction = session.beginTransaction();

    //     Query<?> query = session.createQuery("DELETE FROM User");
    //     int deletedCount = query.executeUpdate();

    //     transaction.commit();
    //     session.close();

    //     System.out.println("Deleted " + deletedCount + " users from the database.");
    // }

}