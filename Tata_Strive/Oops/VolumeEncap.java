package Oops;

import java.util.Scanner;

class Box{
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        return this.height*this.length*this.width;
    }
}

public class VolumeEncap {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Box box = null;

        double l = sc.nextDouble();
        double b = sc.nextDouble();
        double h = sc.nextDouble();

        box = new Box(l, b, h);
        
        System.out.println(box.getVolume());
        System.out.println(volume(l, b, h));
        System.out.println(volume(box));

        sc.close();
    }

    static double volume(double l, double b, double h){
        return l*b*h;
    }

    static double volume(Box b){
        return b.getLength()*b.getWidth()*b.getHeight();
    }
}