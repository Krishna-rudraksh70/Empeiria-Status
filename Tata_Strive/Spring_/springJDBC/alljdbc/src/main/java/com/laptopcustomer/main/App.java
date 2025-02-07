package com.laptopcustomer.main;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.laptopcustomer.config.AppConfig;
import com.laptopcustomer.model.Customer;
import com.laptopcustomer.model.Laptop;
import com.laptopcustomer.service.CustomerService;
import com.laptopcustomer.service.LaptopService;

public class App {

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        CustomerService customerService = context.getBean(CustomerService.class);
        LaptopService laptopService = context.getBean(LaptopService.class);

        int choice;

        do {
            menu();
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> start(laptopService, customerService);
                case 2 -> addCustomer(customerService);
                case 3 -> addLaptop(laptopService, customerService);
                case 4 -> updateCustomer(customerService);
                case 5 -> updateLaptop(laptopService);
                case 6 -> deleteCustomer(customerService, laptopService);
                case 7 -> deleteLaptop(laptopService, customerService);
                case 8 -> viewCustomerById(customerService);
                case 9 -> viewLaptopById(laptopService);
                case 10 -> viewAllCustomers(customerService);
                case 11 -> viewAllLaptops(laptopService);
                case 12 -> {
                    System.out.println("Exiting...");
                    context.close();
                    scanner.close();
                    System.exit(0);
                }
                default -> System.out.println("Invalid option, please try again.");
            }
        } while (true);
    }

    private static void menu() {
        System.out.println("\nMenu:");
        System.out.println("1. Create Table");
        System.out.println("2. Add Customer");
        System.out.println("3. Add Laptop");
        System.out.println("4. Update Customer");
        System.out.println("5. Update Laptop");
        System.out.println("6. Delete Customer");
        System.out.println("7. Delete Laptop");
        System.out.println("8. View Customer By ID");
        System.out.println("9. View Laptop By ID");
        System.out.println("10. View All Customers");
        System.out.println("11. View All Laptops");
        System.out.println("12. Exit");
        System.out.print("Choose an option: ");
    }

    public static void start(LaptopService laptopService, CustomerService customerService) {
        // customerService.setupTable();
        // laptopService.setupTable();
        System.out.println("Table already exist work on that");
    }

    private static void addCustomer(CustomerService customerService) {
        System.out.print("Enter Customer Id: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Customer Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Customer Email: ");
        String email = scanner.nextLine();
        Customer customer = new Customer(id, name, email);
        customerService.addCustomer(customer);
        System.out.println("Customer added successfully.");
    }

    private static void addLaptop(LaptopService laptopService, CustomerService customerService) {
        System.out.println("Existing Customers:");
        List<Customer> customers = customerService.getAllCustomers();
        customers.forEach(customer -> System.out.println(customer.getId() + ". " + customer.getName()));

        System.out.print("Choose an existing customer by ID or press 0 to add a new customer: ");
        int customerId = scanner.nextInt();
        scanner.nextLine();

        if (customerId == 0) {
            addCustomer(customerService);
            System.out.print("Enter the ID of the newly added customer: ");
            customerId = scanner.nextInt();
            scanner.nextLine();
        }

        System.out.print("Enter Laptop Id: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Laptop Brand: ");
        String brand = scanner.nextLine();
        System.out.print("Enter Laptop Model: ");
        String model = scanner.nextLine();
        System.out.print("Enter Laptop Price: ");
        double price = scanner.nextDouble();
        scanner.nextLine();
        Laptop laptop = new Laptop(id, brand, model, price, customerId);
        laptopService.addLaptop(laptop);
        System.out.println("Laptop added successfully.");
    }

    private static void updateCustomer(CustomerService customerService) {
        System.out.print("Enter Customer ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        Customer customer = customerService.getCustomerById(id);
        if (customer != null) {
            System.out.print("Enter new name (current: " + customer.getName() + "): ");
            String name = scanner.nextLine();
            System.out.print("Enter new email (current: " + customer.getEmail() + "): ");
            String email = scanner.nextLine();
            customer.setName(name);
            customer.setEmail(email);
            customerService.updateCustomer(customer);
            System.out.println("Customer updated successfully.");
        } else {
            System.out.println("Customer not found.");
        }
    }

    private static void updateLaptop(LaptopService laptopService) {
        System.out.print("Enter Laptop ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        Laptop laptop = laptopService.getLaptopById(id);
        if (laptop != null) {
            System.out.print("Enter new brand (current: " + laptop.getBrand() + "): ");
            String brand = scanner.nextLine();
            System.out.print("Enter new model (current: " + laptop.getModel() + "): ");
            String model = scanner.nextLine();
            System.out.print("Enter new price (current: " + laptop.getPrice() + "): ");
            double price = scanner.nextDouble();
            scanner.nextLine();
            laptop.setBrand(brand);
            laptop.setModel(model);
            laptop.setPrice(price);
            laptopService.updateLaptop(laptop);
            System.out.println("Laptop updated successfully.");
        } else {
            System.out.println("Laptop not found.");
        }
    }

    private static void deleteCustomer(CustomerService customerService, LaptopService laptopService) {
        System.out.print("Enter Customer ID to delete: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        List<Laptop> laptops = laptopService.getAllLaptops();
        laptops.forEach(laptop -> {
            if (laptop.getCustomerId() == id) {
                laptopService.deleteLaptop(laptop.getId());
            }
        });

        customerService.deleteCustomer(id);
        System.out.println("Customer and associated laptops deleted successfully.");
    }

    private static void deleteLaptop(LaptopService laptopService, CustomerService customerService) {
        System.out.print("Enter Laptop ID to delete: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Laptop laptop = laptopService.getLaptopById(id);
        if (laptop != null) {
            int customerId = laptop.getCustomerId();
            laptopService.deleteLaptop(id);
            System.out.println("Laptop deleted successfully.");

            List<Laptop> laptops = laptopService.getAllLaptops();
            boolean customerHasMoreLaptops = laptops.stream().anyMatch(l -> l.getCustomerId() == customerId);
            if (!customerHasMoreLaptops) {
                customerService.deleteCustomer(customerId);
                System.out.println("Customer associated with laptop was also deleted.");
            }
        } else {
            System.out.println("Laptop not found.");
        }
    }

    private static void viewCustomerById(CustomerService customerService) {
        System.out.print("Enter Customer ID to view: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Customer customer = customerService.getCustomerById(id);
        if (customer != null)
            System.out.println(customer.getId() + ". " + customer.getName() + " - " + customer.getEmail());
        else
            System.out.println("No Custome exist with id " + id);
    }

    private static void viewLaptopById(LaptopService laptopService) {
        System.out.print("Enter Laptop ID to view: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Laptop laptop = laptopService.getLaptopById(id);
        if (laptop != null)
            System.out.println(laptop.getId() + ". " + laptop.getBrand() + " " + laptop.getModel() + " - " + laptop.getPrice());
        else
            System.out.println("No Laptop exist with id " + id);
    }

    private static void viewAllCustomers(CustomerService customerService) {
        List<Customer> customers = customerService.getAllCustomers();
        System.out.println("\nAll Customers:");
        customers.forEach(customer -> System.out
                .println(customer.getId() + ". " + customer.getName() + " - " + customer.getEmail()));
    }

    private static void viewAllLaptops(LaptopService laptopService) {
        List<Laptop> laptops = laptopService.getAllLaptops();
        System.out.println("\nAll Laptops:");
        laptops.forEach(laptop -> System.out.println(
                laptop.getId() + ". " + laptop.getBrand() + " " + laptop.getModel() + " - " + laptop.getPrice() + " -> " + laptop.getCustomerId()));
    }
}
