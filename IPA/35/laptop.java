import java.util.Scanner;
import java.util.Arrays;

public class laptop {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    Lap[] arr = new Lap[4];
    for (int i = 0; i < arr.length; i++) {
      int a = sc.nextInt();
      sc.nextLine();
      String b = sc.nextLine();
      String c = sc.nextLine();
      double d = sc.nextDouble();
      sc.nextLine();
      int e = sc.nextInt();
      sc.nextLine();

      arr[i] = new Lap(a, b, c, d, e);
    }

    String s1 = sc.nextLine();
    int c = countOfLaptopByBrand(arr, s1);
    if (c > 0)
      System.out.println(c);
    else
      System.out.println("The given brand is not available");

    String s2 = sc.nextLine();
    Lap[] lap = searchLaptopByOsType(arr, s2);
    if (lap == null)
      System.out.println("The given os is not available");
    else {
      for (Lap i : lap) {
        System.out.println(i.getLaptopId());
        System.out.println(i.getRating());
      }
    }

    sc.close();
  }

  public static int countOfLaptopByBrand(Lap[] arr, String s) {
    int count = 0;

    for (Lap i : arr) {
      if (i.getRating() > 3 && i.getBrand().equalsIgnoreCase(s))
        count++;
    }

    return count == 0 ? 0 : count;
  }

  public static Lap[] searchLaptopByOsType(Lap[] arr, String s) {
    Lap[] l = new Lap[0];

    for (Lap i : arr) {
      if (i.getOsType().equalsIgnoreCase(s)) {
        l = Arrays.copyOf(l, l.length + 1);
        l[l.length - 1] = i;
      }
    }

    Arrays.sort(l, (d1, d2) -> (d2.getLaptopId() - d1.getLaptopId()));

    return l.length == 0 ? null : l;
  }
}

class Lap {
  private int laptopId;
  private String brand;
  private String osType;
  @SuppressWarnings("unused")
  private double price;
  private int rating;

  public Lap(int laptopId, String brand, String osType, double price, int rating) {
    this.laptopId = laptopId;
    this.brand = brand;
    this.osType = osType;
    this.price = price;
    this.rating = rating;
  }

  public int getLaptopId() {
    return this.laptopId;
  }

  public int getRating() {
    return this.rating;
  }

  public String getBrand() {
    return this.brand;
  }

  public String getOsType() {
    return this.osType;
  }
}