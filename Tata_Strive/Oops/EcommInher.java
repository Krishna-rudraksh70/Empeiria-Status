package Oops;

import java.util.Scanner;

class User{
    protected String userName;
    protected String email;
    protected boolean isLogin;
    
    public User(String userName, String email, boolean isLogin) {
        this.userName = userName;
        this.email = email;
        this.isLogin = isLogin;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public boolean getLogin() {
        return isLogin;
    }

    public void setLogin(boolean isLogin) {
        this.isLogin = isLogin;
    }
    
    public void login(){

        System.out.println("Welcome User");

        if(this.getLogin())
            System.out.println("User already logged in");
        else
            System.out.println("Logged in");
    }

    public void logout(){

        System.out.println("See you soon User");

        if(!this.getLogin())
            System.out.println("User already logged out");
        else
            System.out.println("Logged out");
    }
}

class Customer extends User{
    protected String shippingAddress;
    
    public Customer(String userName, String email, boolean isLogin, String shippingAddress) {
        super(userName, email, isLogin);
        this.shippingAddress = shippingAddress;
        System.out.println("Welcome Customer");
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public void viewOrderHistory(){
        System.out.println("Your Order Histroy");
    }

    public void addToCart(){
        System.out.println("Added to cart");
    }

    public void login(){

        System.out.println("Welcome Customer");

        if(this.getLogin())
            System.out.println("Customer already logged in");
        else
            System.out.println("Logged in");
    }

    public void logout(){
        
        System.out.println("See you soon Customer");

        if(!this.getLogin())
            System.out.println("Customer already logged out");
        else
            System.out.println("Logged out");
    }
}

class Admin extends User{
    protected boolean adminLevel;

    public Admin(String userName, String email, boolean isLogin, String shippingAddress, boolean adminLevel){
        super(userName, email, isLogin);
        this.adminLevel = adminLevel;
        System.out.println("Welcome Admin");
    }

    public void viewAllOrder(){
        System.out.println("All orders by Customers");
    }

    public void manageUser(){
        System.out.println("Manage user here");
    }

    public void login(){

        System.out.println("Welcome Admin");

        if(this.getLogin())
            System.out.println("Admin already logged in");
        else
            System.out.println("Logged in");
    }

    public void logout(){

        System.out.println("See you soon Admin");

        if(!this.getLogin())
            System.out.println("Admin already logged out");
        else
            System.out.println("Logged out");
    }

    public void generateReport(){
        System.out.println("Report");
    }
}

public class EcommInher {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean i = true;
        
        while(i){

            if(s.trim().equalsIgnoreCase("Quit"))
                break;

            
        }

        sc.close();
    }

    public static void sendNotification(User user){
        if(user instanceof Customer)
            System.out.println("Sending notification to Customer : "+user.userName);
        else if(user instanceof Admin)
            System.out.println("Sending notification to Admin"+user.userName);
    }
}
