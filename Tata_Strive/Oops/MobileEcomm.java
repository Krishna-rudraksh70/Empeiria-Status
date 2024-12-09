package Oops;

import java.util.Arrays;
import java.util.Scanner;

class Mobile{
    protected String brand;
    protected String modelNumber;
    protected String color;
    protected int price;
    protected String ram;
    protected String rom;

    public Mobile(String brand, String modelNumber, String color, int price, String ram, String rom) {
        this.brand = brand;
        this.modelNumber = modelNumber;
        this.color = color;
        this.price = price;
        this.ram = ram;
        this.rom = rom;
    }

    public String getBrand() {
        return brand;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public String getRam() {
        return ram;
    }

    public String getRom() {
        return rom;
    }

    @Override
    public String toString() {
        return String.format("Brand : %s, Model : %s, Color : %s, Price : %d, RAM : %s, ROM : %s", this.brand, this.modelNumber, this.color, this.price, this.ram, this.rom);
    }
    
}

public class MobileEcomm {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("How much enteries : ");
        int n = sc.nextInt(); sc.nextLine();

        Mobile mob[] = new Mobile[n];

        for(int i=0; i<n; i++){
            System.out.println("Enter details for mobile " + (i + 1) + ":");
            System.out.print("Brand: ");
            String brand = sc.nextLine();
            System.out.print("Model Number: ");
            String modelNumber = sc.nextLine();
            System.out.print("Color: ");
            String color = sc.nextLine();
            System.out.print("Price: ");
            int price = Integer.parseInt(sc.nextLine());
            System.out.print("RAM: ");
            String ram = sc.nextLine();
            System.out.print("ROM: ");
            String rom = sc.nextLine();

            mob[i] = new Mobile(brand, modelNumber, color, price, ram, rom);
        }

        boolean f = true;

        do{
            System.out.print("\n1. Search by Brand Name\n2. Search by color\n3. Search by model\n4. search by Price\n5. exit\nEter your choice : ");
            n = sc.nextInt(); sc.nextLine();
            String s;

            switch(n){
                case 1 : 
                    System.out.print("Enter brand name : ");
                    s = sc.nextLine();
                    print(searchByBrandName(mob, s));
                    break;
                case 2 :
                    System.out.print("Enter color : ");
                    s = sc.nextLine();
                    print(searchByColor(mob, s));
                    break;
                case 3 :
                    System.out.print("Enter model : ");
                    s = sc.nextLine();
                    print(searchByModel(mob, s));
                    break;
                case 4 :
                    System.out.print("Enter price : ");
                    n = sc.nextInt(); sc.nextLine();
                    print(searchByPrice(mob, n));
                    break;
                case 5 :
                    System.out.println("Existing...");
                    f = false;
                    break;
                default:
                    System.out.println("\nInvalid Choice\nChoose the option again\n");
            }
        }while(f);

        sc.close();
    }
    
    public static void print(Mobile[] m){
        for(Mobile i : m)
            System.out.println(i.toString());
    }

    public static Mobile[] searchByBrandName(Mobile[] m, String s){
        Mobile r[] = new Mobile[0];

        for(Mobile i : m){
            if(i.getBrand().equalsIgnoreCase(s)){
                r = Arrays.copyOf(r, r.length+1);
                r[r.length-1] = i;
            }
        }
        
        return r;
    }

    public static Mobile[] searchByColor(Mobile[] m, String s){
        Mobile r[] = new Mobile[0];

        for(Mobile i : m){
            if(i.getColor().equalsIgnoreCase(s)){
                r = Arrays.copyOf(r, r.length+1);
                r[r.length-1] = i;
            }
        }
        
        return r;
    }

    public static Mobile[] searchByModel(Mobile[] m, String s){
        Mobile r[] = new Mobile[0];

        for(Mobile i : m){
            if(i.getModelNumber().equalsIgnoreCase(s)){
                r = Arrays.copyOf(r, r.length+1);
                r[r.length-1] = i;
            }
        }
        
        return r;
    }

    public static Mobile[] searchByPrice(Mobile[] m, int s){
        Mobile r[] = new Mobile[0];

        for(Mobile i : m){
            if(i.getPrice() == s){
                r = Arrays.copyOf(r, r.length+1);
                r[r.length-1] = i;
            }
        }
        
        return r;
    }

}