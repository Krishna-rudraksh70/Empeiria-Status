import java.util.Scanner;

public class employeeTax{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        int b = sc.nextInt(); sc.nextLine();
        double c = sc.nextDouble(); sc.nextLine();

        Tax t = new Tax(a, b, c);

        double s = calculateYearlySalary(t);
        System.out.println("Yearly salary of " + a + ": " + s);

        double tx = calculateTax(s);
        System.out.println("Tax to be paid by " + a + ": " + tx);

        sc.close();
    }

    public static double calculateYearlySalary(Tax a){
        return 12*a.getSalary();
    }

    public static double calculateTax(double a){
        if(a <= 50000)
            return 0.1*a;
        else if(a <= 100000)
            return (50000*0.1)+((a-50000)*0.2);
        else
            return (50000*0.1)+(50000*0.2)+((a-100000)*0.3);
    }
}

class Tax{
    private String name;
    private int age;
    private double salary;

    public Tax(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}