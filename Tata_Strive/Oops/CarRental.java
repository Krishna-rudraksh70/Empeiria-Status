package Oops;

import java.util.Scanner;

abstract class Vehicles{
    protected String brand;
    protected String model;
    protected int year;

    abstract double calculateRentalCost(int d);

    abstract void displayDetais(int d);
}

class Car extends Vehicles{
    protected int numberOfSeats;

    double calculateRentalCost(int d){
        return d*100;
    }

    void displayDetais(int d){
        System.out.println(String.format("The Rental cost of Car for %d days : %.2f", d, calculateRentalCost(d)));
    }
}

class SUV extends Vehicles{
    protected int bootCapacity;

    double calculateRentalCost(int d){
        return d*200;
    }

    void displayDetais(int d){
        System.out.println(String.format("The Rental cost of Car for %d days : %.2f", d, calculateRentalCost(d)));
    }
}

public class CarRental {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number of days : ");
        int n = sc.nextInt();

        Car car = new Car();
        SUV suv = new SUV();

        car.displayDetais(n);
        
        suv.displayDetais(n);

        sc.close();
    }
}