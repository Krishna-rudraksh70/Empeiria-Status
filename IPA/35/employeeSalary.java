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
    @SuppressWarnings("unused")
    private String companyName;
    private Employee[] employees;
    @SuppressWarnings("unused")
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