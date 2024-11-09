import java.util.Scanner;

public class bankAccountDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAccount[] ba = new BankAccount[3];

        for(int i=0; i<ba.length; i++){
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            double c = sc.nextDouble(); sc.nextLine();

            ba[i] = new BankAccount(a, b, c);
        }

        int an = sc.nextInt(); sc.nextLine();
        double amt = sc.nextDouble(); sc.nextLine();
        double bal = withdraw(ba, an, amt);
        if(bal==-1)
            System.out.println("Sorry - Insufficient balance");
        else if(bal==-2)
            System.out.println("Sorry - Account not found");
        else
            System.out.println("Balance: "+bal);

        an = sc.nextInt();
        amt = sc.nextDouble();
        bal = deposit(ba, an, amt);
        if(bal == -1)
            System.out.println("Sorry - Account not found");
        else
            System.out.println("Balance: "+bal);

        sc.close();
    }

    public static double withdraw(BankAccount[] arr, int ac, double amt){
        
        for(BankAccount i: arr){
            if(i.getAccountNumber() == ac){
                if(i.getBalance() >= amt){
                    i.setBalance(i.getBalance() - amt);
                    return i.getBalance();
                }
                else
                    return -1;
            }
        }

        return -2;  
    }

    public static double deposit(BankAccount[] arr, int ac, double amt){

        for(BankAccount i: arr){
            if(i.getAccountNumber() == ac){
                i.setBalance(i.getBalance() + amt);
                return i.getBalance();
            }
        }

        return -1;  
    }
}

class BankAccount{
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(int accountNumber, String accountHolderName, double balance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}