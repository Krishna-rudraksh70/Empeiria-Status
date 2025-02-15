package application;

import java.sql.SQLException;
import java.util.Scanner;

import dao.StudentUtil;
import dao.UserUtil;
import model.Student;
import model.User;

public class App {

    private static final Scanner scanner = new Scanner(System.in);
    private static User loggedInUser;

    public static void main(String[] args) {
        boolean exit = false;

        System.out.println("\nWelcome to the Student Management System!\nJDBC Project");
        loggedInUser = login();

        if (loggedInUser != null) {
            System.out.println("Welcome, " + loggedInUser.getUsername() + " from (" + loggedInUser.getRole() + ")");
            do {
                showMenu();
                int choice = getIntInput("Enter your choice: ");

                switch (choice) {
                    case 1 -> createStudentTable();
                    case 2 -> viewAllStudents();
                    case 3 -> viewStudentById();
                    case 4 -> insertStudent();
                    case 5 -> updateStudent();
                    case 6 -> deleteStudent();
                    case 7 -> countTotalStudents();
                    case 8 -> countStudentsByCourse();
                    case 9 -> countStudentsByAttribute();
                    case 10 -> viewTopStudents();
                    case 11 -> viewBottomStudents();
                    case 12 -> sortStudentsByAttribute();
                    case 13 -> startTransaction();
                    case 14 -> commitTransaction();
                    case 15 -> rollbackTransaction();
                    case 16 -> closeDatabaseConnection();
                    case 17 -> {
                        System.out.println("Exiting program.");
                        exit = true;
                    }
                    default -> System.out.println("Invalid choice, please try again.");
                }

            } while (!exit);
        } else {
            System.out.println("Invalid username or password.");
        }

        scanner.close();
    }

    private static void showMenu() {
        System.out.println("\nStudent Management Menu:");
        System.out.println("1. Create Student Table");
        System.out.println("2. View All Student Details");
        System.out.println("3. View Student Details By ID");
        System.out.println("4. Insert Student Details");
        System.out.println("5. Update Student Details");
        System.out.println("6. Delete Student Details");
        System.out.println("7. Count Total Students");
        System.out.println("8. Count Students By Course");
        System.out.println("9. Count Students By Attribute");
        System.out.println("10. View Top N Students");
        System.out.println("11. View Bottom N Students");
        System.out.println("12. Sort Students By Attribute");
        System.out.println("13. Begin Transaction");
        System.out.println("14. Commit Transaction");
        System.out.println("15. Rollback Transaction");
        System.out.println("16. Close Database Connection");
        System.out.println("17. Exit");
    }

    private static User login() {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        try {
            return UserUtil.loginUser(username, password);
        } catch (SQLException e) {
            System.err.println("Error logging in: " + e.getMessage());
            return null;
        }
    }

    private static int getIntInput(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next();
        }
        int input = scanner.nextInt();
        scanner.nextLine();
        return input;
    }

    private static void createStudentTable() {
        if (canPerformAction("admin")) {
            try {
                boolean success = StudentUtil.createStudentTable();
                System.out.println(success ? "Student table created successfully." : "Student table already exists.");
            } catch (SQLException e) {
                System.err.println("Error creating student table: " + e.getMessage());
            }
        } else {
            System.out.println("You do not have permission to create the student table.");
        }
    }

    private static void viewAllStudents() {
        if (canPerformAction("admin", "IT", "developer")) {
            try {
                StudentUtil.allStudentDetails();
            } catch (SQLException e) {
                System.err.println("Error retrieving student details: " + e.getMessage());
            }
        } else {
            System.out.println("You do not have permission to view student details.");
        }
    }

    private static void viewStudentById() {
        if (canPerformAction("admin", "IT", "developer")) {
            int id = getIntInput("Enter student ID: ");
            try {
                Student student = StudentUtil.detailsById(id);
                if (student != null) {
                    printStudentDetails(student);
                } else {
                    System.out.println("No student found with ID " + id);
                }
            } catch (SQLException e) {
                System.err.println("Error retrieving student details: " + e.getMessage());
            }
        } else {
            System.out.println("You do not have permission to view student details.");
        }
    }

    private static void insertStudent() {
        if (canPerformAction("admin", "developer")) {
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();
            System.out.print("Enter student course: ");
            String course = scanner.nextLine();
            int age = getIntInput("Enter student age: ");

            Student newStudent = new Student(0, name, course, age);
            try {
                boolean inserted = StudentUtil.insertDetails(newStudent);
                System.out
                        .println(inserted ? "Student details inserted successfully."
                                : "Failed to insert student details.");
            } catch (SQLException e) {
                System.err.println("Error inserting student details: " + e.getMessage());
            }
        } else {
            System.out.println("You do not have permission to insert student details.");
        }
    }

    private static void updateStudent() {
        if (canPerformAction("admin", "developer")) {
            int id = getIntInput("Enter student ID to update: ");
            System.out.print("Enter new student name: ");
            String name = scanner.nextLine();
            System.out.print("Enter new student course: ");
            String course = scanner.nextLine();
            int age = getIntInput("Enter new student age: ");

            Student updatedStudent = new Student(id, name, course, age);
            try {
                boolean updated = StudentUtil.updateStudentDetails(id, updatedStudent);
                System.out.println(
                        updated ? "Student details updated successfully." : "Failed to update student details.");
            } catch (SQLException e) {
                System.err.println("Error updating student details: " + e.getMessage());
            }
        } else {
            System.out.println("You do not have permission to view student details.");
        }
    }

    private static void deleteStudent() {
        if (canPerformAction("admin", "developer")) {
            int id = getIntInput("Enter student ID to delete: ");
            try {
                boolean deleted = StudentUtil.deleteStudentDetails(id);
                System.out.println(
                        deleted ? "Student details deleted successfully." : "Failed to delete student details.");
            } catch (SQLException e) {
                System.err.println("Error deleting student details: " + e.getMessage());
            }
        } else {
            System.out.println("You do not have permission to view student details.");
        }
    }

    private static void countTotalStudents() {
        if (canPerformAction("admin", "IT", "developer")) {
            try {
                int count = StudentUtil.Count();
                System.out.println("Total students: " + count);
            } catch (SQLException e) {
                System.err.println("Error counting students: " + e.getMessage());
            }
        } else {
            System.out.println("You do not have permission to view student details.");
        }
    }

    private static void countStudentsByCourse() {
        if (canPerformAction("admin", "IT", "developer")) {
            System.out.print("Enter course name: ");
            String course = scanner.nextLine();
            try {
                int count = StudentUtil.countByCourse(course);
                System.out.println("Number of students in " + course + ": " + count);
            } catch (SQLException e) {
                System.err.println("Error counting students by course: " + e.getMessage());
            }
        } else {
            System.out.println("You do not have permission to view student details.");
        }
    }

    private static void countStudentsByAttribute() {
        if (canPerformAction("admin", "IT", "developer")) {
            System.out.print("Enter attribute (e.g., Stud_course): ");
            String attribute = scanner.nextLine();
            System.out.print("Enter value: ");
            String value = scanner.nextLine();
            try {
                int count = StudentUtil.countByAttribute(attribute, value);
                System.out.println("Number of students with " + attribute + " = " + value + ": " + count);
            } catch (SQLException e) {
                System.err.println("Error counting students by attribute: " + e.getMessage());
            }
        } else {
            System.out.println("You do not have permission to view student details.");
        }
    }

    private static void viewTopStudents() {
        if (canPerformAction("admin", "IT", "developer")) {
            int n = getIntInput("Enter the number of top students to display: ");
            try {
                StudentUtil.TopStudents(n);
            } catch (SQLException e) {
                System.err.println("Error retrieving top students: " + e.getMessage());
            }
        } else {
            System.out.println("You do not have permission to view student details.");
        }
    }

    private static void viewBottomStudents() {
        if (canPerformAction("admin", "IT", "developer")) {
            int n = getIntInput("Enter the number of bottom students to display: ");
            try {
                StudentUtil.BottomStudents(n);
            } catch (SQLException e) {
                System.err.println("Error retrieving bottom students: " + e.getMessage());
            }
        } else {
            System.out.println("You do not have permission to view student details.");
        }
    }

    private static void sortStudentsByAttribute() {
        if (canPerformAction("admin", "IT", "developer")) {
            System.out.print("Enter sorting attribute (e.g., Stud_Name): ");
            String attribute = scanner.nextLine();
            try {
                StudentUtil.SortedByattribute(attribute);
            } catch (SQLException e) {
                System.err.println("Error sorting students: " + e.getMessage());
            }
        } else {
            System.out.println("You do not have permission to view student details.");
        }
    }

    private static void startTransaction() {
        if (canPerformAction("admin")) {
            try {
                StudentUtil.beginTransaction();
                System.out.println("Transaction started.");
            } catch (SQLException e) {
                System.err.println("Error starting transaction: " + e.getMessage());
            }
        } else {
            System.out.println("You do not have permission to view student details.");
        }
    }

    private static void commitTransaction() {
        if (canPerformAction("admin")) {
            try {
                StudentUtil.commitTransaction();
                System.out.println("Transaction committed.");
            } catch (SQLException e) {
                System.err.println("Error committing transaction: " + e.getMessage());
            }
        } else {
            System.out.println("You do not have permission to view student details.");
        }
    }

    private static void rollbackTransaction() {
        if (canPerformAction("admin")) {
            try {
                StudentUtil.rollbackTransaction();
                System.out.println("Transaction rolled back.");
            } catch (SQLException e) {
                System.err.println("Error rolling back transaction: " + e.getMessage());
            }
        } else {
            System.out.println("You do not have permission to view student details.");
        }
    }

    private static void closeDatabaseConnection() {
        if (canPerformAction("admin")) {
            try {
                StudentUtil.closeConnection();
                System.out.println("Database connection closed.");
            } catch (SQLException e) {
                System.err.println("Error closing connection: " + e.getMessage());
            }
        } else {
            System.out.println("You do not have permission to view student details.");
        }
    }

    private static void printStudentDetails(Student student) {
        if (canPerformAction("admin", "IT", "developer")) {
        System.out.println("ID: " + student.getId() +
                ", Name: " + student.getName() +
                ", Course: " + student.getCourse() +
                ", Age: " + student.getAge());
        } else {
            System.out.println("You do not have permission to view student details.");
        }
    }
    
    private static boolean canPerformAction(String... allowedRoles) {
        String userRole = loggedInUser.getRole();
        for (String role : allowedRoles) {
            if (role.equals(userRole)) {
                return true;
            }
        }
        return false;
    }

}
