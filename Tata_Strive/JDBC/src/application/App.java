package application;

import java.sql.SQLException;
import java.util.Scanner;

import dao.StudentUtil;
import model.Student;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        do {
            System.out.println();
            System.out.println("Student Management Menu:");
            System.out.println("1. Create Student Table");
            System.out.println("2. View All Student Details");
            System.out.println("3. View Student Details By ID");
            System.out.println("4. Insert Student Details");
            System.out.println("5. Update Student Details");
            System.out.println("6. Delete Student Details");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    try {
                        boolean success = StudentUtil.createStudentTable();
                        if (success) {
                            System.out.println("Student table created successfully.");
                        } else {
                            System.out.println("Student table already exists.");
                        }
                    } catch (SQLException e) {
                        System.out.println("Error creating student table: " + e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        StudentUtil.allStudentDetails();
                    } catch (SQLException e) {
                        System.out.println("Error retrieving student details: " + e.getMessage());
                    }
                    break;
                case 3:
                    System.out.print("Enter student ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    try {
                        Student student = StudentUtil.detailsById(id);
                        if (student != null) {
                            System.out.println("ID: " + student.getId() + ", Name: " + student.getName() + ", Course: " + student.getCourse() + ", Age: " + student.getAge());
                        } else {
                            System.out.println("No student found with ID " + id);
                        }
                    } catch (SQLException e) {
                        System.out.println("Error retrieving student details: " + e.getMessage());
                    }
                    break;
                case 4:
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter student course: ");
                    String course = scanner.nextLine();
                    System.out.print("Enter student age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();

                    Student newStudent = new Student(0, name, course, age);
                    try {
                        boolean inserted = StudentUtil.insertDetails(newStudent);
                        if (inserted) {
                            System.out.println("Student details inserted successfully.");
                        } else {
                            System.out.println("Failed to insert student details.");
                        }
                    } catch (SQLException e) {
                        System.out.println("Error inserting student details: " + e.getMessage());
                    }
                    break;
                case 5:
                    System.out.print("Enter student ID to update: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter new student name: ");
                    String updateName = scanner.nextLine();
                    System.out.print("Enter new student course: ");
                    String updateCourse = scanner.nextLine();
                    System.out.print("Enter new student age: ");
                    int updateAge = scanner.nextInt();
                    scanner.nextLine();

                    Student updatedStudent = new Student(updateId, updateName, updateCourse, updateAge);
                    try {
                        boolean updated = StudentUtil.updateStudentDetails(updateId, updatedStudent);
                        if (updated) {
                            System.out.println("Student details updated successfully.");
                        } else {
                            System.out.println("Failed to update student details.");
                        }
                    } catch (SQLException e) {
                        System.out.println("Error updating student details: " + e.getMessage());
                    }
                    break;
                case 6:
                    System.out.print("Enter student ID to delete: ");
                    int deleteId = scanner.nextInt();
                    scanner.nextLine();
                    try {
                        boolean deleted = StudentUtil.deleteStudentDetails(deleteId);
                        if (deleted) {
                            System.out.println("Student details deleted successfully.");
                        } else {
                            System.out.println("Failed to delete student details.");
                        }
                    } catch (SQLException e) {
                        System.out.println("Error deleting student details: " + e.getMessage());
                    }
                    break;
                case 7:
                    System.out.println("Exiting program.");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }

        } while (!exit);

        scanner.close();
    }
}
