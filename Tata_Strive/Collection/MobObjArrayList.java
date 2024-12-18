import java.util.ArrayList;

class Mobile {
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

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getModelno() {
        return modelno;
    }

    public void setModelno(String modelno) {
        this.modelno = modelno;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + "\tPrice: " + price + "\tModel Number: " + modelno + "\tDescription: " + description
                + "\n";

    }
}

public class MobObjArrayList {
    public static void main(String[] args) {

        ArrayList<Mobile> mobiles = new ArrayList<>();

        mobiles.add(new Mobile("OnePlus", 49999, "OnePlus 11", "Flagship phone with impressive speed and camera."));
        mobiles.add(new Mobile("Google", 58999, "Pixel 8",
                "Smartphone with an outstanding camera and clean software experience."));
        mobiles.add(new Mobile("Xiaomi", 24999, "Redmi Note 12",
                "Affordable phone with solid performance and great battery life."));
        mobiles.add(new Mobile("Realme", 17999, "Realme 11 Pro",
                "Mid-range phone offering great display and performance."));
        mobiles.add(new Mobile("Oppo", 29999, "Oppo F23", "Well-balanced phone with good camera and design."));
        mobiles.add(new Mobile("Motorola", 21999, "Moto Edge 40",
                "Sleek design with fast performance and 5G connectivity."));
        mobiles.add(new Mobile("Vivo", 22999, "Vivo V27", "Stylish phone with excellent camera features and design."));
        mobiles.add(new Mobile("Sony", 79999, "Xperia 1 IV",
                "Premium phone with superb display and audio quality for media lovers."));

        for (Mobile mobile : mobiles) {
            System.out.println(mobile.toString());
        }

    }
}
