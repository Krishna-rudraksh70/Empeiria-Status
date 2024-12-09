package Oops;
import java.util.Arrays;
import java.util.Scanner;

class Emp{
    private int empId;
    private String empName;
    private String empDestination;
    private int empAge;
    private long contactNumber;

    public Emp(int empId, String empName, String empDestination, int empAge, long contactNumber) {
        this.empId = empId;
        this.empName = empName;
        this.empDestination = empDestination;
        this.empAge = empAge;
        this.contactNumber = contactNumber;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmpDestination() {
        return empDestination;
    }

    public int getEmpAge() {
        return empAge;
    }

    public long getContactNumber() {
        return contactNumber;
    }

}

public class Employee{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Number of Entries : ");
        int n = sc.nextInt();

        Emp emp[] = new Emp[n];

        for(int i=0; i<n; i++){
            System.out.println(String.format("Enter the entry for Employee %d", i+1));
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            if(!nameValid(b)){
                System.out.println("\nInvalid Name\nName should be greater than 3 and less than 15 characters\nRenter the entry\n");
                --i;
                continue;
            }
                
            String c = sc.nextLine();
            if(!destinationValid(c)){
                System.out.println("\nInvalid Destination\nDestination should be Manager, HR or IT\nRenter the entry\n");
                --i;
                continue;
            }

            int d = sc.nextInt(); sc.nextLine();
            if(!ageValid(d)){
                System.out.println("\nInvalid Age\nAge should be between 18 and 60\nRenter the entry\n");
                --i;
                continue;
            }

            long e = sc.nextLong();
            if(!contactNumberValid(Long.toString(e))){
                System.out.println("\nInvalid Contact Number\nContact Number should be 10 and start with 9, 8 or 6\nRenter the entry\n");
                --i;
                continue;
            }

            emp[i] = new Emp(a, b, c, d, e);
        }

        Emp[] r = task(emp);

        if(r == null)
            System.out.println("\nNo such Entries");
        else{
            for(Emp i : r)
                System.out.println(String.format("\nEmployee Id : %d\nEmployee Name : %s\nDestination : %s\nAge : %d\nContact Number : %s", i.getEmpId(), i.getEmpName(), i.getEmpDestination(), i.getEmpAge(), i.getContactNumber()));
        }

        sc.close();
    }

    static Emp[] task(Emp[] e){
        
        if(e == null)
            return null;

        Emp[] r = new Emp[0];
        
        for(Emp i : e){
            if(i.getEmpDestination().equalsIgnoreCase("Manager") && (i.getEmpAge() > 40)){
                r = Arrays.copyOf(r, r.length+1);
                r[r.length-1] = i;
            }
        };

        return (r.length < 0)? null : r;
    }

    static boolean nameValid(String s){
        return (s.length() > 3) && (s.length() < 15);
    }

    static boolean destinationValid(String s){
        return (s.equalsIgnoreCase("Manager")) || (s.equalsIgnoreCase("HR")) || (s.equalsIgnoreCase("IT"));
    }

    static boolean ageValid(int a){
        return (a >= 18) && (a < 60);
    }

    static boolean contactNumberValid(String s){
        return (s.length() == 10) && (s.startsWith("9") || s.startsWith("8") || s.startsWith("6"));
    }
}