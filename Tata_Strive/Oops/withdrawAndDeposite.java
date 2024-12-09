package Oops;

import java.util.Scanner;

class Account{
    private double amt;

    public Account(double amt){
        this.amt = amt;
    }

    public double getAmount(){
        return this.amt;
    }

    public void setAmount(double amt){
        this.amt= amt;
    }

    public void withdraw(double amt){
        this.amt -= amt;
    }

    public void deposite(double amt){
        this.amt += amt;
    }
}

public class withdrawAndDeposite {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Opening Amount : ");
        double n = sc.nextDouble();

        Account a = new Account(n);

        while(n>0){
            System.out.println("What you want to do\n1. Get Balance\n2. Deposite\n3. Withdraw\n4. Quit");
            n = sc.nextDouble();

            switch ((int)n) {
                case 1:
                    System.out.println("Your balance : "+a.getAmount());
                    break;
                case 2:
                    System.out.print("Deposite Amount : ");
                    n = sc.nextDouble(); 
                    a.deposite(n);
                    break;
                case 3:
                    System.out.print("Withdraw Amount : ");
                    n = sc.nextDouble(); 
                    a.withdraw(n);
                    break;  
                case 4:
                    return;
                default:
                    System.out.println("Invalid Option\nPlease choose right option");
                    break;
            }
        }

        sc.close();
    }
}
