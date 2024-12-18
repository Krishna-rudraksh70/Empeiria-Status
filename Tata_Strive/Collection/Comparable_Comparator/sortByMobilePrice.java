package Comparable_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Mobile implements Comparable<Mobile> {
    private String brand;
    private double price;
    private String modelno;
    private String description;

    public Mobile(String brand, double price, String modelno, String description) {
        this.brand = brand;
        this.price = price;
        this.modelno = modelno;
        this.description = description;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public String getModelno() {
        return modelno;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + "\tPrice: " + price + "\tModel Number: " + modelno + "\tDescription: " + description
                + "\n";
    }

    @Override
    public int compareTo(Mobile other) {
        return -Double.compare(this.price, other.price);
    }
}

class ByPrice implements Comparator<Mobile> {
    @Override
    public int compare(Mobile m1, Mobile m2) {
        return Double.compare(m1.getPrice(), m2.getPrice());
    }
}

public class sortByMobilePrice {
    public static void main(String[] args) {
        ArrayList<Mobile> mobiles = new ArrayList<>();

        Collections.addAll(mobiles,
                new Mobile("OnePlus", 49999, "OnePlus 11", "Flagship phone with impressive speed and camera."),
                new Mobile("Google", 58999, "Pixel 8",
                        "Smartphone with an outstanding camera and clean software experience."),
                new Mobile("Xiaomi", 24999, "Redmi Note 12",
                        "Affordable phone with solid performance and great battery life."),
                new Mobile("Realme", 17999, "Realme 11 Pro", "Mid-range phone offering great display and performance."),
                new Mobile("Oppo", 29999, "Oppo F23", "Well-balanced phone with good camera and design."),
                new Mobile("Motorola", 21999, "Moto Edge 40",
                        "Sleek design with fast performance and 5G connectivity."),
                new Mobile("Vivo", 22999, "Vivo V27", "Stylish phone with excellent camera features and design."),
                new Mobile("Sony", 79999, "Xperia 1 IV",
                        "Premium phone with superb display and audio quality for media lovers."));

        System.out.println("\nUnSorted:");
        for (Mobile mobile : mobiles) {
            System.out.println(mobile);
        }

        System.out.println("Sorted by Price (Natural Order) using Comparable:");
        Collections.sort(mobiles);
        for (Mobile mobile : mobiles) {
            System.out.println(mobile);
        }

        System.out.println("\nSorted by Price using Comparator:");
        Collections.sort(mobiles, new ByPrice());
        for (Mobile mobile : mobiles) {
            System.out.println(mobile);
        }
    }
}
