// Create a class named "Employee" with the following attributes:

// id (int)
// name (String)
// designation (String)
// salary (double)

// The above attributes should be private, and the class should have a parameterized constructor to initialize them.

// Implement the following methods in the Employee class:

// getSalary(): This method should return the salary of the employee.
// getDesignation(): This method should return the designation of the employee.

// Create a class named "Company" with the following attributes:

// companyName (String)
// employees (Employee array)
// numEmployees (int)

// The above attributes should be private, and the class should have a parameterized constructor to initialize them.

// Implement the following methods in the Company class:

// getAverageSalary(): This method should return the average salary of all the employees in the company.
// getMaxSalary(): This method should return the highest salary of all the employees in the company.
// getEmployeesByDesignation(String designation): This method should return an array of all employees with the given designation.

// In the main method, use a Scanner object to read the values of the company name, number of employees, and the employee details 
// (id, name, designation, and salary) in a loop. Once all employee details have been read, create a Company object and pass the 
// appropriate parameters. Finally, call the three methods mentioned above and print the output.

// Note:

// All searches should be case-insensitive.
// You may assume that the input is valid and in the correct format.

// Sample input:
// ---------------------
// Enter company name: ABC Company
// Enter number of employees: 3
// Enter employee details:
// Employee 1:
// Enter id: 101
// Enter name: John Smith
// Enter designation: Manager
// Enter salary: 5000
// Employee 2:
// Enter id: 102
// Enter name: Jane Doe
// Enter designation: Engineer
// Enter salary: 4000
// Employee 3:
// Enter id: 103
// Enter name: Bob Johnson
// Enter designation: Engineer
// Enter salary: 4500

// Sample Output:
// --------------------
// Average salary: 4500.0
// Max salary: 5000.0
// Employees with designation: Engineer
// ID: 102, Name: Jane Doe, Designation: Engineer, Salary: 4000.0
// ID: 103, Name: Bob Johnson, Designation: Engineer, Salary: 4500.0

import java.util.Scanner;
import java.util.Arrays;

public class employeeSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String Comp = sc.nextLine();
        int numE = sc.nextInt(); sc.nextLine();
        Employee[] emp = new Employee[numE];

        for(int i=0; i<numE; i++){
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            double d = sc.nextDouble(); sc.nextLine();
            emp[i] = new Employee(a, b, c, d);
        }

        Company cmp = new Company(Comp, emp, numE);

        System.out.println(cmp.getAverageSalary());

        System.out.println(cmp.getMaxSalary());

        String des = sc.nextLine();
        Employee[] e = cmp.getEmployeesByDesignation(des);
        for(Employee i: e){
            System.out.println(i.getId() + " " + i.getName() + " " + i.getDesignation() + " " + i.getSalary() + " " + i.getClass());
        }
        
        sc.close();
    }
}

class Employee{
    private int id;
    private String name;
    private String designation;
    private double salary;

    public Employee(int id, String name, String designation, double salary){
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    public int getId(){
        return this.id;
    }

    public double getSalary(){
        return this.salary;
    }

    public String getDesignation(){
        return this.designation;
    }

    public String getName(){
        return this.name;
    }
}

class Company{
    private String companyName;
    private Employee[] employees;
    private int numEmployees;

    public Company(String companyName, Employee[] employees, int numEmployees){
        this.companyName = companyName;
        this.employees = employees;
        this.numEmployees = numEmployees;
    }

    public double getAverageSalary(){
        double avgSal = 0;
        int count = 0;

        for(Employee i: employees){
            avgSal += i.getSalary();
            count++;
        }

        avgSal /= count;

        return (avgSal);
    }

    public double getMaxSalary(){
        double max = employees[0].getSalary();

        for(Employee i: employees){
            if(max < i.getSalary())
                max = i.getSalary();
        }

        return (max);
    }

    public Employee[] getEmployeesByDesignation(String designation){
        Employee[] desEmp = new Employee[0];

        for(Employee i: employees){
            if(i.getDesignation().equalsIgnoreCase(designation)){
                desEmp = Arrays.copyOf(desEmp, desEmp.length+1);
                desEmp[desEmp.length-1] = i;
            }
        }

        return desEmp;
    }
}